-- 고객 데이터
INSERT INTO customers (email, password_hash, first_name, last_name, phone)
VALUES
    ('kim@example.com', 'hash1', '철수', '김', '010-1111-1111'),
    ('lee@example.com', 'hash2', '영희', '이', '010-2222-2222'),
    ('park@example.com', 'hash3', '민수', '박', '010-3333-3333');

-- 주소 데이터
INSERT INTO customer_addresses (customer_id, address_type, street_address, city, postal_code, is_default)
VALUES
    (1, 'home', '서울시 강남구 테헤란로 123', '서울', '06123', TRUE),
    (2, 'home', '부산시 해운대구 센텀대로 99', '부산', '48000', TRUE),
    (3, 'home', '대전시 유성구 궁동로 77', '대전', '34100', TRUE);

-- 카테고리
INSERT INTO book_categories (category_name, description)
VALUES
    ('IT/프로그래밍', 'IT 전문서적'),
    ('소설', '국내외 소설'),
    ('자기계발', '동기부여 및 성공철학');

-- 출판사
INSERT INTO publishers (publisher_name, address, contact_phone)
VALUES
    ('한빛미디어', '서울시 마포구 양화로 45', '02-111-1111'),
    ('민음사', '서울시 종로구 종로1길 50', '02-222-2222');

-- 저자
INSERT INTO authors (author_name, nationality)
VALUES
    ('홍길동', '대한민국'),
    ('John Smith', 'USA'),
    ('이서연', '대한민국');

-- 도서
INSERT INTO books (isbn, title, price, stock_quantity, category_id, publisher_id)
VALUES
    ('978-89-111-1111-1', 'SQL 완벽 가이드', 28000, 50, 1, 1),
    ('978-89-222-2222-2', '자바 프로그래밍 입문', 32000, 30, 1, 1),
    ('978-89-333-3333-3', '마음챙김의 기술', 15000, 40, 3, 2);

-- 도서-저자 관계
INSERT INTO book_authors (book_id, author_id, author_role)
VALUES
    (1, 1, 'main'),
    (2, 3, 'main'),
    (3, 2, 'main');

-- 주문
INSERT INTO orders (customer_id, total_amount, shipping_address, payment_method, payment_status)
VALUES
    (1, 60000, '서울시 강남구 테헤란로 123', 'card', 'completed'),
    (2, 15000, '부산시 해운대구 센텀대로 99', 'bank_transfer', 'completed');

-- 주문 상세
INSERT INTO order_items (order_id, book_id, quantity, unit_price)
VALUES
    (1, 1, 1, 28000),
    (1, 2, 1, 32000),
    (2, 3, 1, 15000);

-- 리뷰
INSERT INTO book_reviews (book_id, customer_id, rating, review_title, review_content, is_verified_purchase)
VALUES
    (1, 1, 5, '좋아요!', 'SQL 개념이 명확해졌어요.', TRUE),
    (2, 2, 4, '초보자에게 유익', '자바 입문서로 좋아요.', TRUE),
    (3, 3, 5, '삶이 바뀜', '마음이 차분해졌어요.', TRUE);
