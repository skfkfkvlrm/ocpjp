-- 1. 고객별 주문 목록 조회
SELECT c.first_name, c.last_name, o.order_id, o.total_amount, o.status
FROM customers c
JOIN orders o ON c.customer_id = o.customer_id
ORDER BY o.order_date DESC;

-- 2. 도서별 리뷰 평균 점수
SELECT b.title, ROUND(AVG(r.rating),1) AS avg_rating,
       COUNT(r.review_id) AS review_count
    FROM books b
LEFT JOIN book_reviews r ON b.book_id = r.book_id
GROUP BY b.book_id, b.title
ORDER BY avg_rating DESC;

-- 3. 저자별 출판 도서 수
SELECT a.author_name, COUNT(ba.book_id) AS book_count
    FROM authors a
LEFT JOIN book_authors ba ON a.author_id = ba.author_id
GROUP BY a.author_name;

-- 4. 카테고리별 도서 재고 현황
SELECT c.category_name, SUM(b.stock_quantity) AS total_stock
    FROM book_categories c
JOIN books b ON c.category_id = b.category_id
GROUP BY c.category_name
ORDER BY total_stock DESC;

-- 5. 고객의 평균 주문 금액
SELECT c.first_name, c.last_name, ROUND(AVG(o.total_amount),0) AS avg_order
    FROM customers c
JOIN orders o ON c.customer_id = o.customer_id
GROUP BY c.customer_id
ORDER BY avg_order DESC;

-- 6. 구매 이력 기반 추천용 조인 (도서-저자-카테고리)
SELECT o.order_id, b.title, a.author_name, c.category_name
    FROM orders o
JOIN order_items oi ON o.order_id = oi.order_id
JOIN books b ON oi.book_id = b.book_id
JOIN book_authors ba ON b.book_id = ba.book_id
JOIN authors a ON ba.author_id = a.author_id
JOIN book_categories c ON b.category_id = c.category_id
ORDER BY o.order_id;