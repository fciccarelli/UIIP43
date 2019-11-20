create database if not exists  phone_homework3
default character set utf8 
default collate  utf8_general_ci;

use phone_homework3;

create table country(
code varchar(2) primary key,
name varchar(32) not null unique
);

create table opsys(
id int(11) auto_increment primary key ,
description varchar(64) not null,
company varchar(64) not null,
openSource tinyint(1) not null
);

/**
comando eseguito manualmente
**/
ALTER TABLE `phone_homework3`.`opsys` 
ADD UNIQUE INDEX `company_UNIQUE` (`company` ASC);

create table brand(
id int(11) auto_increment primary key,
name varchar(32) not null unique,
country varchar(2) not null,
constraint fr_country foreign key (country) references country(code)
);

create table smartphone(
id int(11) auto_increment primary key,
name varchar(64) not null unique,
ram varchar(5) not null,
cpu varchar(64) not null,
displayPpi int(11) not null,
displaySize varchar(12) not null,
displayResolution varchar(64) not null,
size varchar(64) not null,
weight int(4) not null,
notes varchar(1024) not null,
brand int(11) not null,
opSys int(11)
);

/**
comando per tornare alla situazione precedente
**/
drop table if exists smartphone;

create table smartphone(
id int(11) auto_increment primary key,
name varchar(64) not null,
ram varchar(5) not null,
cpu varchar(64) not null,
displayPpi int(11) not null,
displaySize varchar(12) not null,
displayResolution varchar(64) not null,
size varchar(64) not null,
weight int(4) not null,
notes varchar(1024) not null,
brand int(11) not null,
opSys int(11) not null,
constraint fk_brand foreign key(brand) references brand(id),
constraint fk_opSys foreign key(opsys) references opsys(id)
);

/**
comando per reimpostare name a unique
**/
ALTER TABLE `phone_homework3`.`smartphone` 
ADD UNIQUE INDEX `name_UNIQUE` (`name` ASC);

/**
comando per reimpostare notes a null
**/
ALTER TABLE `phone_homework3`.`smartphone` 
CHANGE COLUMN `notes` `notes` VARCHAR(1024) NULL ;

/**
comando per reimpostare deflaggare UNIQUE a name in smartphone, e company in opsys
**/
ALTER TABLE `phone_homework3`.`smartphone` 
DROP INDEX `name_UNIQUE` ;

ALTER TABLE `phone_homework3`.`opsys` 
DROP INDEX `company_UNIQUE` ;

