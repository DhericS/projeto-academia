CREATE TABLE user_acad_admin (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    cnpj VARCHAR(14) UNIQUE NOT NULL,
    academia_id BIGINT UNIQUE,
    FOREIGN KEY (academia_id) REFERENCES academias(id) ON DELETE CASCADE
);
