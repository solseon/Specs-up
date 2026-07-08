FROM php:8.3-apache

# 1. 패키지 목록을 업데이트하고 그누보드에 필요한 라이브러리를 설치한다.
# 2. GD 라이브러리(이미지 처리)와 mysqli(데이터베이스 통신) 확장을 컴파일하여 활성화한다.
RUN apt-get update && apt-get install -y \
    libfreetype6-dev \
    libjpeg62-turbo-dev \
    libpng-dev \
    git \
    && docker-php-ext-configure gd --with-freetype --with-jpeg \
    && docker-php-ext-install -j$(nproc) gd mysqli pdo_mysql

# 3. 아파치의 URL 재작성(Rewrite) 모듈을 활성화한다.
RUN a2enmod rewrite