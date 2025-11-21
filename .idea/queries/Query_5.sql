-- 6. 도서-저자 관계 (Book_Author) - 다대다 관계 해결
CREATE TABLE book_authors (
                              book_id INT,
                              author_id INT,
                              author_role ENUM('main', 'co-author', 'editor', 'translator') DEFAULT 'main',
                              PRIMARY KEY (book_id, author_id),
                              FOREIGN KEY (book_id) REFERENCES books(book_id) ON DELETE CASCADE,
                              FOREIGN KEY (author_id) REFERENCES authors(author_id) ON DELETE CASCADE
);

-- 7. 주문 (Order) - 행위 엔터티
CREATE TABLE orders (
                        order_id INT PRIMARY KEY AUTO_INCREMENT,
                        customer_id INT NOT NULL,
                        order_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                        status ENUM('pending', 'processing', 'shipped', 'delivered', 'cancelled') DEFAULT 'pending',
                        total_amount DECIMAL(12,2) NOT NULL,

    -- 배송 정보
                        shipping_address TEXT NOT NULL,
                        shipping_phone VARCHAR(20),

    -- 결제 정보
                        payment_method ENUM('card', 'bank_transfer', 'paypal') NOT NULL,
                        payment_status ENUM('pending', 'completed', 'failed') DEFAULT 'pending',

                        created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                        updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,

                        FOREIGN KEY (customer_id) REFERENCES customers(customer_id),
                        INDEX idx_customer_order (customer_id, order_date),
                        INDEX idx_status (status)
);

-- 8. 주문 상세 (Order_Item) - 행위 엔터티
CREATE TABLE order_items (
                             order_id INT,
                             book_id INT,
                             quantity INT NOT NULL CHECK(quantity > 0),
                             unit_price DECIMAL(10,2) NOT NULL,
                             total_price DECIMAL(12,2) GENERATED ALWAYS AS (quantity * unit_price) STORED,

                             PRIMARY KEY (order_id, book_id),
                             FOREIGN KEY (order_id) REFERENCES orders(order_id) ON DELETE CASCADE,
                             FOREIGN KEY (book_id) REFERENCES books(book_id)
);
