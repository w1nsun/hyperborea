CREATE TABLE IF NOT EXISTS products (
    id varchar(26) PRIMARY KEY ,
    product_name varchar(100) NOT NULL,
    brand varchar(100) DEFAULT NULL,
    category varchar(100) DEFAULT NULL,
    description text DEFAULT NULL,
    price numeric(38, 2) DEFAULT NULL,
    size numeric(38, 2) DEFAULT NULL,
    package_type varchar(100) DEFAULT NULL,
    package_size numeric(38, 2) DEFAULT NULL
);
