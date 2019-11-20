drop database if exists phone_homework3;
create database if not exists phone_homework3
	default character set  utf8
    default collate utf8_unicode_ci; 
    
    use phone_homework3;
 
 create table Country  (
		code varchar(2) Primary key  ,
        name varchar(32)  not null
	); 
    
   create table Brand (
		id int(11)  Primary key auto_increment,
        name varchar(32) unique not null ,
        country varchar(2)  ,
		constraint fk_country foreign key (country) references Country(code)
    ); 
    
    create table OpSys(
     id int(11) Primary key auto_increment,
     description varchar(64) not null,
     company varchar(64) unique not null,
     openSource tinyint(1) not null
    );
    
    create table Smartphone(
		id int (11) primary key auto_increment,
        name varchar(64) unique not null,
        ram varchar(5) not null,
        cpu varchar(64) not null,
        displayPpi int(11) not null,
        displaySize varchar(12) not null,
        displayResolution varchar(64) not null,
        size varchar(64) not null,
        weight int(4) not null,
        notes varchar(1024),
        brand int(11),
        opSys int(11),
        constraint fk_brand foreign key(brand) references Brand(id),
        constraint fk_opSys foreign key(opSys) references opSys(id)
        );