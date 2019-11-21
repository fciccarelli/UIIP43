drop database if exists viaggi;
create database if not exists viaggi
default character set utf8
default collate utf8_unicode_ci;
use viaggi;

create table if not exists aereo (
tipoAereo varchar(16) not null,
nPass int not null,
quantitaMerci int,
primary key (tipoAereo)
);

create table if not exists aeroporto (
id varchar(4) not null,
citta varchar(64) not null,
nazione varchar(64) not null,
npiste int not null,
primary key(id)
);

create table if not exists volo (
idVolo int not null auto_increment,
giornoSett varchar(10) not null, 
aeroportoPart varchar(4) not null,
aeroportoArr varchar(4) not null,
tipoAereo varchar(16) not null,
oraPartenza time not null,
oraArrivo time not null,
primary key (idVolo),
constraint fk_aeroportoPart foreign key(aeroportoPart) references aeroporto(id),
constraint fk_aeroportoArr foreign key(aeroportoArr) references aeroporto(id),
constraint fk_tipoAereo foreign key(tipoAereo) references aereo(tipoAereo)
);






