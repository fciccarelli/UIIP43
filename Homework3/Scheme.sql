#drop database if exists phone_homework3;

# Creazione database phone_homework3
create database if not exists phone_homework3
	default character set utf8
    default collate utf8_general_ci;

# creazione tabella country
create table if not exists country (
	code varchar(2) primary key,
    name varchar(32) not null unique
);

# creazione tabella opsys
create table if not exists opsys (
	id int(11) primary key auto_increment,
    description varchar(64),
    company varchar(64) not null unique,
    openSource tinyint(1) not null
);

# creazione tabella brand
create table if not exists brand (
	id int(11) primary key auto_increment,
    name varchar(32) not null,
    country varchar(2) not null,
	constraint fk_country foreign key(country) references country(code)
);


# creazione tabella smartphone
create table if not exists smartphone (
	id int(11) primary key auto_increment,
    name varchar(64) not null unique,
    ram varchar(5) not null,
    cpu varchar(64) not null,
    displayPpi int(11) not null,
    displaySize varchar(12) not null,
    displayResolution varchar(64) not null,
    size varchar(64) not null,
    weight int(4) not null,
    notes varchar(1024),
	brand int(11) not null,
    opSys int(11) not null,
    constraint fk_brand foreign key(brand) references brand(id),
    constraint fk_opSys foreign key(opsys) references opsys(id)
);

    