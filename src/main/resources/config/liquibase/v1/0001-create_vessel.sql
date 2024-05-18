--liquibase formatted sql

--changeset cavemanfrak:01 contextFilter:ddl
CREATE TABLE IF NOT EXISTS vessel (
    code CHAR(10) NOT NULL PRIMARY KEY COMMENT 'Vessel Code',
    name VARCHAR(100) NOT NULL COMMENT 'Vessel Name'
);