-- 고객 주소 정보 (복합 속성 분리)
CREATE TABLE customer_addresses (
                                    address_id INT PRIMARY KEY AUTO_INCREMENT,
                                    customer_id INT NOT NULL,
                                    address_type ENUM('home', 'work', 'shipping') NOT NULL,

    -- 주소 구성 요소 분리
                                    street_address VARCHAR(200) NOT NULL,
                                    detail_address VARCHAR(100),
                                    city VARCHAR(50) NOT NULL,
                                    state VARCHAR(50),
                                    postal_code VARCHAR(10) NOT NULL,
                                    country VARCHAR(50) DEFAULT '대한민국',

                                    is_default BOOLEAN DEFAULT FALSE,
                                    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

                                    FOREIGN KEY (customer_id) REFERENCES customers(customer_id) ON DELETE CASCADE,
                                    INDEX idx_customer_address (customer_id)
);

-- 도서 리뷰 (의견/평가 속성)
CREATE TABLE book_reviews (
                              review_id INT PRIMARY KEY AUTO_INCREMENT,
                              book_id INT NOT NULL,
                              customer_id INT NOT NULL,
                              rating INT NOT NULL CHECK(rating BETWEEN 1 AND 5),
                              review_title VARCHAR(200),
                              review_content TEXT,
                              is_verified_purchase BOOLEAN DEFAULT FALSE,
                              helpful_count INT DEFAULT 0,
                              created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

                              FOREIGN KEY (book_id) REFERENCES books(book_id) ON DELETE CASCADE,
                              FOREIGN KEY (customer_id) REFERENCES customers(customer_id) ON DELETE CASCADE,
                              UNIQUE KEY unique_customer_book_review (customer_id, book_id),
                              INDEX idx_book_rating (book_id, rating)
);
