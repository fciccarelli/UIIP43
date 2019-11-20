create database if not exists phone_homework3
default character set utf8
default collate utf8_general_ci;

use phone_homework3;

create table country(
code varchar(2) primary key,
name varchar(32) not null unique
);

create table opsys(
id int(11) auto_increment primary key,
description varchar(64) not null,
company varchar(64) not null unique,
openSource tinyint not null
);

create table brand(
id int auto_increment primary key,
name varchar(32) not null unique,
country varchar(2) not null ,
constraint fk_country foreign key (country) references country(code)
);

create table smartphone(
id int auto_increment primary key,
name varchar(64) not null unique,
ram varchar(5) not null,
cpu varchar(64) not null,
displayPpi int not null,
displaySize varchar(12) not null,
displayResolution varchar(64) not null,
size varchar(64) not null,
weight int(4) not null,
notes varchar(1024),
brand int not null,
opSys int not null,
constraint fk_brand foreign key (brand) references brand(id),
constraint fk_opSys foreign key (opSys) references opsys(id)
);
