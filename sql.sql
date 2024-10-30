CREATE SCHEMA IF NOT EXISTS `petrg`;

DROP TABLE IF EXISTS `petrg`.`usuarios`;
CREATE TABLE `petrg`.`usuarios` (
                                    `id`        INT NOT NULL AUTO_INCREMENT,
                                    `name`      VARCHAR(60) NOT NULL,
                                    `surname`   VARCHAR(20),
                                    `cpf`       VARCHAR(15) NOT NULL,
                                    `telephone` VARCHAR(14) NOT NULL,
                                    `email`     VARCHAR(255) NOT NULL,
                                    `date`      DATE NOT NULL,
                                    `login_id`  INT,
                                    PRIMARY KEY (`id`),
                                    UNIQUE (`cpf`),
                                    UNIQUE (`email`)
);

DROP TABLE IF EXISTS `petrg`.`logins`;
CREATE TABLE `petrg`.`logins` (
                                  `id`         INT AUTO_INCREMENT PRIMARY KEY,
                                  `username`   VARCHAR(255) NOT NULL,
                                  `password`   VARCHAR(255) NOT NULL,
                                  `usuario_id` INT, -- Coluna usuario_id que será a FK
                                  UNIQUE (`username`),
                                  CONSTRAINT fk_usuario_login FOREIGN KEY (`usuario_id`) REFERENCES `petrg`.`usuarios` (`id`) ON DELETE CASCADE
);

ALTER TABLE `petrg`.`usuarios`
    ADD CONSTRAINT fk_login FOREIGN KEY (`login_id`) REFERENCES `petrg`.`logins` (`id`);

DROP TABLE IF EXISTS `petrg`.`pets`;
CREATE TABLE `petrg`.`pets` (
                                `id`              INT AUTO_INCREMENT PRIMARY KEY,
                                `name_pet`        VARCHAR(255) NOT NULL,
                                `age_pet`         INT NOT NULL,
                                `race`            VARCHAR(255) NOT NULL,
                                `type_animal`     VARCHAR(255) NOT NULL,
                                `weight_pet`      DOUBLE NOT NULL,
                                `observation`     TEXT NOT NULL,
                                `photo`           VARCHAR(255) NOT NULL,
                                `castrated_date`  DATE  NULL,
                                `life_animal`     VARCHAR(255)  NULL,
                                `usuario_id`      INT,
                                CONSTRAINT fk_usuario FOREIGN KEY (`usuario_id`) REFERENCES `petrg`.`usuarios` (`id`) ON DELETE CASCADE
);

DROP TABLE IF EXISTS `petrg`.`vaccines`;
CREATE TABLE `petrg`.`vaccines` (
                                    `id`              INT AUTO_INCREMENT PRIMARY KEY,
                                    `name_vaccine`    VARCHAR(255) NOT NULL,
                                    `vaccine_date`    DATE NOT NULL,
                                    `validity_date`   DATE NOT NULL,
                                    `dose`            INT NOT NULL,
                                    `notes`           TEXT NOT NULL,
                                    `manufacturer`    VARCHAR(255) NOT NULL,
                                    `pet_id`          INT NOT NULL,
                                    CONSTRAINT fk_pet FOREIGN KEY (`pet_id`) REFERENCES `petrg`.`pets` (`id`) ON DELETE CASCADE
);
