
-- Criar o schema
        CREATE SCHEMA IF NOT EXISTS `petrg`;

-- Criar a tabela de logins
DROP TABLE IF EXISTS `petrg`.`logins`;
CREATE TABLE `petrg`.`logins` (
                                  `id`       INT AUTO_INCREMENT PRIMARY KEY,
                                  `username` VARCHAR(255) NOT NULL,
                                  `password` VARCHAR(255) NOT NULL,
                                  UNIQUE (`username`)
);

-- Criar a tabela de usuários
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
                                    UNIQUE (`email`),
                                    CONSTRAINT fk_login FOREIGN KEY (`login_id`) REFERENCES `petrg`.`logins` (`id`)
);

-- Criar a tabela de pets
DROP TABLE IF EXISTS `petrg`.`pets`;
CREATE TABLE `petrg`.`pets` (
                                `id`              INT AUTO_INCREMENT PRIMARY KEY,
                                `name_pet`       VARCHAR(255) NOT NULL,
                                `age_pet`        INT NOT NULL,
                                `race`           VARCHAR(255) NOT NULL,  -- Presumindo que isso seja uma string para raças
                                `type_animal`    VARCHAR(255) NOT NULL,  -- Presumindo que isso seja uma string para tipos de animais
                                `weight_pet`     DOUBLE NOT NULL,
                                `observation`    TEXT NOT NULL,
                                `photo`          VARCHAR(255) NOT NULL,
                                `castrated_date` DATE NOT NULL,
                                `life_animal`    VARCHAR(255) NOT NULL,  -- Presumindo que isso seja uma string para expectativa de vida
                                `usuario_id`     INT,
                                CONSTRAINT fk_usuario FOREIGN KEY (`usuario_id`) REFERENCES `petrg`.`usuarios` (`id`) ON DELETE CASCADE
);

-- Criar a tabela de vacinas
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

