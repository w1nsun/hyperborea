CREATE TABLE IF NOT EXISTS products (
    id SERIAL PRIMARY KEY ,
    productName varchar(100) NOT NULL,
    brand varchar(100) DEFAULT NULL,
    category varchar(100) DEFAULT NULL,
    description text DEFAULT NULL,
    price numeric(7, 2) DEFAULT NULL,
    size numeric(7, 2) DEFAULT NULL,
    packageType varchar(100) DEFAULT NULL,
    packageSize numeric(7, 2) DEFAULT NULL
);
