-- SQL setup script for Exercise 2: stock table and department/employee/skill tables

-- Stock table for Query Methods hands-on
CREATE TABLE IF NOT EXISTS `ormlearn`.`stock` (
    `st_id`     INT NOT NULL AUTO_INCREMENT,
    `st_code`   VARCHAR(10),
    `st_date`   DATE,
    `st_open`   NUMERIC(10, 2),
    `st_close`  NUMERIC(10, 2),
    `st_volume` NUMERIC,
    PRIMARY KEY (`st_id`)
);

-- Department table for O/R Mapping hands-on
CREATE TABLE IF NOT EXISTS `ormlearn`.`department` (
    `dp_id`   INT NOT NULL AUTO_INCREMENT,
    `dp_name` VARCHAR(50),
    PRIMARY KEY (`dp_id`)
);

-- Employee table with FK to department
CREATE TABLE IF NOT EXISTS `ormlearn`.`employee` (
    `em_id`            INT NOT NULL AUTO_INCREMENT,
    `em_name`          VARCHAR(50),
    `em_salary`        NUMERIC(10, 2),
    `em_permanent`     TINYINT(1),
    `em_date_of_birth` DATE,
    `em_dp_id`         INT,
    PRIMARY KEY (`em_id`),
    FOREIGN KEY (`em_dp_id`) REFERENCES department(`dp_id`)
);

-- Skill table
CREATE TABLE IF NOT EXISTS `ormlearn`.`skill` (
    `sk_id`   INT NOT NULL AUTO_INCREMENT,
    `sk_name` VARCHAR(50),
    PRIMARY KEY (`sk_id`)
);

-- Join table for Employee <-> Skill (Many-to-Many)
CREATE TABLE IF NOT EXISTS `ormlearn`.`employee_skill` (
    `es_em_id` INT NOT NULL,
    `es_sk_id` INT NOT NULL,
    PRIMARY KEY (`es_em_id`, `es_sk_id`),
    FOREIGN KEY (`es_em_id`) REFERENCES employee(`em_id`),
    FOREIGN KEY (`es_sk_id`) REFERENCES skill(`sk_id`)
);

-- Sample department data
INSERT INTO department (dp_name) VALUES ('Engineering'), ('HR'), ('Finance');

-- Sample skill data
INSERT INTO skill (sk_name) VALUES ('Java'), ('Python'), ('SQL'), ('Spring');

-- Sample employee data
INSERT INTO employee (em_name, em_salary, em_permanent, em_date_of_birth, em_dp_id)
VALUES ('Alice', 75000.00, 1, '1990-05-15', 1),
       ('Bob',   60000.00, 0, '1995-08-20', 2),
       ('Charlie',80000.00,1, '1988-03-10', 1);

-- Sample employee_skill data
INSERT INTO employee_skill VALUES (1, 1), (1, 4), (2, 2), (3, 1), (3, 3);
