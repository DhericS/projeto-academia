CREATE TABLE personais (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    telefone VARCHAR(20) NOT NULL,
    cref VARCHAR(50) NOT NULL UNIQUE
);
