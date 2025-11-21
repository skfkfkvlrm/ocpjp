-- 5. 도서 (Book) - 중심 엔터티
CREATE TABLE books (
                       book_id INT PRIMARY KEY AUTO_INCREMENT,
                       isbn VARCHAR(20) UNIQUE,
                       title VARCHAR(200) NOT NULL,
                       subtitle VARCHAR(200),
                       description TEXT,
                       page_count INT,
                       publication_date DATE,
                       language VARCHAR(10) DEFAULT 'ko',
                       price DECIMAL(10,2) NOT NULL,
                       stock_quantity INT DEFAULT 0,

    -- 외래키 관계
                       category_id INT NOT NULL,
                       publisher_id INT NOT NULL,

    -- 메타데이터
                       created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                       updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,

                       FOREIGN KEY (category_id) REFERENCES book_categories(category_id),
                       FOREIGN KEY (publisher_id) REFERENCES publishers(publisher_id),

    -- 인덱스 생성 (검색 성능 향상)
                       INDEX idx_title (title),
                       INDEX idx_isbn (isbn),
                       INDEX idx_category (category_id)
);
