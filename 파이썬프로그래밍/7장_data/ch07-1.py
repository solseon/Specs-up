import pandas as pd

# 엑셀에서 열 구분자를 세미콜론으로 인식시키기
red_df = pd.read_csv('Desktop/Git/파이썬프로그래밍/7장_data/winequality-red.xlsx'
                     ,sep=';', header = 0, engine = 'python')
white_df = pd.read_csv('/Users/solseon/Desktop/Git/파이썬프로그래밍/7장_data/winequality-white.xlsx'
                       ,sep=';', header = 0, engine = 'python')
red_df.to_csv('/Users/solseon/Desktop/Git/파이썬프로그래밍/7장_data/winequality-red2.xlsx'
              ,index = False)
white_df.to_csv('/Users/solseon/Desktop/Git/파이썬프로그래밍/7장_data/winequality-white2.xlsx'
                ,index = False)

# 레드 와인 데이터 확인 및 정리
red_df.head()
red_df.insert(0, columm = 'type', value = 'red')
red_df.head()
red_df.shape

# 화이트 와인 데이터 확인 및 정리
white_df.head()
white_df.insert(0, columm = 'type', value = 'white')
white_df.head()
white_df.shape

# 레드 와인과 화이트 와인 파일 합치기_concat()
wine = pd.concat([red_df, white_df])
wine.shape
wine.to_csv('/Users/solseon/Desktop/Git/파이썬프로그래밍/7장_data/wine.xlsx'
            , index = False)

# 기본 정보 확인하기 info()
print(wine.info())

# 함수를 사용해 기술 통계 구하기
wine.columns = wine.columns.str.replace(' ','_')
wine.head()
wine.describe()

# 함수를 사용해 기술 통계 구하기
sorted(wine.quality.unique())
wine.quality.value_counts()

# describe() 함수로 그룹 비교하기
wine.groupby('type')['quality'].describe()
wine.groupby('type')['quality'].mean()
wine.groupby('type')['quality'].std()
wine.groupby('type')['quality'].agg(['mean'],['std'])

