CREATE SCHEMA `petrg` ;
CREATE TABLE `petrg`.`usuarios` (
                                    `id` INT NOT NULL AUTO_INCREMENT,
                                    `name` VARCHAR(60) NOT NULL,
                                    `surname` VARCHAR(20) NOT,
                                    `cpf` VARCHAR(15) NOT NULL,
                                    `telephone` VARCHAR(14) NOT NULL,
                                    `email` VARCHAR(14) NOT NULL,
                                    `datOfBirth` DATE NOT NULL,
                                    PRIMARY KEY (`id`),
                                    UNIQUE (cpf)
);
