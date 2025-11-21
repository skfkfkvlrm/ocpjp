-- 고객별 주문 내역 조회
SELECT c.customer_name, o.order_id, o.total_amount
FROM customers c
         LEFT JOIN orders o ON c.customer_id = o.customer_id
ORDER BY c.customer_name;

-- 사원-사원증 매핑
SELECT e.employee_name, e.department, c.card_number, c.issued_date
FROM employees e
         JOIN employee_cards c ON e.employee_id = c.employee_id;

-- 저자별 도서 목록
SELECT a.author_name, b.title
FROM authors a
         JOIN book_authors ba ON a.author_id = ba.author_id
         JOIN books b ON ba.book_id = b.book_id
ORDER BY a.author_name;

-- 고객별 총 주문 금액
SELECT c.customer_name, SUM(o.total_amount) AS total_spent
FROM customers c
JOIN orders o ON c.customer_id = o.customer_id
GROUP BY c.customer_name
ORDER BY total_spent DESC;

SELECT a.author_name, COUNT(b.book_id) AS book_count
    FROM authors a
LEFT JOIN book_authors ba ON a.author_id = ba.author_id
LEFT JOIN books b ON ba.book_id = b.book_id
GROUP BY a.author_name;