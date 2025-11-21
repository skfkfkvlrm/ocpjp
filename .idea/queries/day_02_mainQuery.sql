-- 고객 목록 확인
SELECT customer_id, CONCAT(first_name, last_name) AS customer_name, email FROM customers;

-- 도서 목록
SELECT book_id, title, price, stock_quantity FROM books;

-- 주문별 상세 내역 조회
SELECT o.order_id, c.first_name AS customer, b.title, oi.quantity, oi.unit_price, o.total_amount
FROM orders o
JOIN customers c ON o.customer_id = c.customer_id
JOIN order_items oi ON o.order_id = oi.order_id
JOIN books b ON oi.book_id = b.book_id
ORDER BY o.order_id;

-- 카테고리별 도서 수 확인
SELECT bc.category_name, COUNT(b.book_id) AS book_count
FROM book_categories bc
LEFT JOIN books b ON bc.category_id = b.category_id
GROUP BY bc.category_name;

-- 3만원 이상 도서 검색
SELECT title, price FROM books WHERE price >= 30000;

-- 특정 고객의 주문 내역
SELECT o.order_id, o.total_amount, o.status, o.payment_method
FROM orders o
JOIN customers c ON o.customer_id = c.customer_id
WHERE c.email = 'hong@test.com';