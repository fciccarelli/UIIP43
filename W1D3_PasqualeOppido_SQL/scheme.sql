# cancella il database phone_homework3 database se esiste
drop database if exists phone_homework3;

# creazione database
create database if not exists phone_homework3
	default character set utf8
    default collate utf8_unicode_ci;

use phone_homework3;

# creazione tabella country
CREATE TABLE country (
    code VARCHAR(2) PRIMARY KEY,
    name VARCHAR(32) NOT NULL
);
    
# creazione tabella opsys
CREATE TABLE opsys (
    id INT PRIMARY KEY AUTO_INCREMENT,
    description VARCHAR(64) NOT NULL,
    company VARCHAR(64) UNIQUE NOT NULL,
    openSource TINYINT(1) NOT NULL
);

# creazione tabella brand
CREATE TABLE brand (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(32) UNIQUE NOT NULL,
    country VARCHAR(2) NOT NULL,
    CHECK (LENGTH(country) = 2),
    CONSTRAINT fk_country FOREIGN KEY (country)
        REFERENCES country (code)
);

# creazione tabella smartphone
CREATE TABLE smartphone (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(64) UNIQUE NOT NULL,
    ram VARCHAR(5) NOT NULL,
    cpu VARCHAR(64) NOT NULL,
    displayPpi INT NOT NULL,
    displaySize VARCHAR(12) NOT NULL,
    displayResolution VARCHAR(64) NOT NULL,
    size VARCHAR(64) NOT NULL,
    weigth INT(4) NOT NULL,
    notes VARCHAR(64),
    brand INT NOT NULL,
    opSys INT NOT NULL,
    CONSTRAINT fk_brand FOREIGN KEY (brand)
        REFERENCES brand (id),
    CONSTRAINT fk_opSys FOREIGN KEY (opSys)
        REFERENCES opSys (id)
);