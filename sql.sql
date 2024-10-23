

CREATE SCHEMA `petrg`;

CREATE TABLE `petrg`.`logins`
(
    `id`       INT AUTO_INCREMENT PRIMARY KEY,
    `username` VARCHAR(255) NOT NULL,
    `password` VARCHAR(255) NOT NULL,
    UNIQUE (`username`)
);

CREATE TABLE `petrg`.`usuarios`
(
    `id`        INT          NOT NULL AUTO_INCREMENT,
    `name`      VARCHAR(60)  NOT NULL,
    `surname`   VARCHAR(20),
    `cpf`       VARCHAR(15)  NOT NULL,
    `telephone` VARCHAR(14)  NOT NULL,
    `email`     VARCHAR(255) NOT NULL,
    `date`      DATE         NOT NULL,
    `login_id`  INT,
    PRIMARY KEY (`id`),
    UNIQUE (`cpf`),
    UNIQUE (`email`),
    CONSTRAINT fk_login FOREIGN KEY (`login_id`) REFERENCES `petrg`.`logins` (`id`)
);
