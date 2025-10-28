# 11장 예제 1번
# for문 사용
lyrics = 'Half of my heart is in Havana'

words = lyrics.split()
result = []
for w in words:
    result.append((w, len(w)))

print(result)

# 리스트 축약 표현 사용
lyrics = 'Half of my heart is in Havana'
result = [(w, len(w)) for w in lyrics.split()]
print(result)