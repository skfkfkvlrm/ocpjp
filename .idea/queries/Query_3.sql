-- 기본 엔터티들 식별
-- 1. 고객 (Customer) - 기본 엔터티
CREATE TABLE customers (
                           customer_id INT PRIMARY KEY AUTO_INCREMENT,
                           email VARCHAR(100) UNIQUE NOT NULL,
                           password_hash VARCHAR(255) NOT NULL,
                           first_name VARCHAR(50) NOT NULL,
                           last_name VARCHAR(50) NOT NULL,
                           phone VARCHAR(20),
                           created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                           updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- 2. 도서 카테고리 (Book_Category) - 기본 엔터티
CREATE TABLE book_categories (
                                 category_id INT PRIMARY KEY AUTO_INCREMENT,
                                 category_name VARCHAR(100) UNIQUE NOT NULL,
                                 description TEXT,
                                 parent_category_id INT,  -- 계층적 카테고리 지원
                                 created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                 FOREIGN KEY (parent_category_id) REFERENCES book_categories(category_id)
);

-- 3. 저자 (Author) - 기본 엔터티
CREATE TABLE authors (
                         author_id INT PRIMARY KEY AUTO_INCREMENT,
                         author_name VARCHAR(100) NOT NULL,
                         biography TEXT,
                         birth_date DATE,
                         nationality VARCHAR(50),
                         created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- 4. 출판사 (Publisher) - 기본 엔터티
CREATE TABLE publishers (
                            publisher_id INT PRIMARY KEY AUTO_INCREMENT,
                            publisher_name VARCHAR(100) NOT NULL,
                            address TEXT,
                            contact_phone VARCHAR(20),
                            email VARCHAR(100),
                            created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
