CREATE DATABASE ecommerce_table;

\c ecommerce_table;

CREATE TABLE user_info(user_id SERIAL PRIMARY KEY,
					   username VARCHAR(50) NOT NULL,
					   password VARCHAR(50) NOT NULL,
					   first_name VARCHAR(50) NOT NULL,
					   last_name VARCHAR(50) NOT NULL,
					   email VARCHAR(50) NOT NULL,
					   user_type VARCHAR(50) NOT NULL);
						  
CREATE TABLE orders(order_no SERIAL PRIMARY KEY,
					user_id INT GENERATED ALWAYS AS IDENTITY,
					order_date TIMESTAMP,
					order_status VARCHAR(50) NOT NULL,
					CONSTRAINT fk_user
      	            FOREIGN KEY(user_id) 
	                REFERENCES user_info(user_id));
			
CREATE TABLE order_items(items_id SERIAL PRIMARY KEY,
						 order_no SERIAL,
						 product_sku INT,
						 product_qty INT,
						 product_price NUMERIC,
						 CONSTRAINT fk_order
      	                 FOREIGN KEY(order_no) 
	                     REFERENCES orders(order_no));

CREATE TABLE products(product_sku SERIAL PRIMARY KEY,
					  product_name VARCHAR(50) NOT NULL,
					  product_image VARCHAR(50) NOT NULL,
					  product_quantity INT,
					  product_price NUMERIC);

						  
						  
						  