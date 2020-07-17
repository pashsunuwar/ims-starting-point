--DROP DATABASE ims;
CREATE DATABASE IF NOT EXISTS ims;

CREATE TABLE IF NOT EXISTS ims.customers(
<<<<<<< HEAD
	id int NOT NULL AUTO_INCREMENT UNIQUE, 
=======
	customer_id int NOT NULL AUTO_INCREMENT UNIQUE, 
>>>>>>> development
	forename varchar(40) NOT NULL, 
	surname varchar(40) NOT NULL,
	username varchar(40) NOT NULL UNIQUE,
	password varchar(40) NOT NULL,
	email varchar(70) NOT NULL,
<<<<<<< HEAD
	PRIMARY KEY (id)
=======
	PRIMARY KEY (customer_id)
>>>>>>> development
	);

CREATE TABLE IF NOT EXISTS ims.products(
	product_id int NOT NULL AUTO_INCREMENT UNIQUE,
	product_title varchar(40) NOT NULL,
	price dec(7,2),
	quantity int NOT NULL,
	PRIMARY KEY (product_id)
	);

CREATE TABLE IF NOT EXISTS ims.orders(
	order_id int NOT NULL AUTO_INCREMENT UNIQUE,
<<<<<<< HEAD
	id int NOT NULL,
	product_id int NOT NULL,
	date_placed date,
	PRIMARY KEY(order_id),
	FOREIGN KEY(id) REFERENCES customers(id),
	FOREIGN KEY(product_id) REFERENCES products(product_id)
	);

	


=======
	customer_id int NOT NULL,
	product_id int NOT NULL,
	PRIMARY KEY(order_id),
	FOREIGN KEY(customer_id) REFERENCES customers(customer_id),
	FOREIGN KEY(product_id) REFERENCES products(product_id)
	);

>>>>>>> development
