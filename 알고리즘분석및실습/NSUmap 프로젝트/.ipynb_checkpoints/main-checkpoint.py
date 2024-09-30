import folium   # folium을 호출
center = [36.9109137342107, 127.143619452225] # 남서울대학교의 [위도, 경도] 불러오는 함수
m=folium.Map(location=center, zoom_start=10) # m 변수 지정, 남서울대학교, 화면 해상도 10
m
    
