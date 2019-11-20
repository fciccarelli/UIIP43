drop database if exists phone_homework3;

create database if not exists phone_homework3
default character set utf8
default collate utf8_unicode_ci;
use phone_homework3;

create table if not exists country (
code varchar(2) primary key,
name varchar(32) not null
);

create table if not exists brand (
id int not null auto_increment,
name varchar(32) unique not null, 
country varchar(2) not null,
primary key (id),
constraint fk_country foreign key (country) references country (code)
);


create table if not exists opsys (
id int not null auto_increment,
description varchar(64),
company varchar(64) unique not null,
openSource tinyint(1) not null,
primary key (id)
);

create table if not exists smartphone (
id int not null auto_increment,
name varchar(64) unique not null,
ram varchar(5) not null,
cpu varchar(64) not null,
displayDpi int not null,
displaySize varchar(12) not null,
displayResolution varchar(64) not null,
size varchar(64) not null,
weight int(4) not null,
notes varchar(1024),
brand int not null,
opSys int not null,
primary key (id),
constraint fk_brand foreign key (brand) references brand(id),
constraint fk_opSys foreign key (opsys) references opsys(id)
);



















