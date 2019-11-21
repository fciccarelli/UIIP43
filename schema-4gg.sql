create database if not exists viaggi
default character set utf8
default collate utf8_general_ci;

use viaggi;

create table aeroporto(
id varchar(4) primary key,
citta varchar(64) not null,
nazione varchar(32) not null,
nPiste int not null
);

create table aereo(
tipoAereo varchar(16) primary key,
npass int not null,
quantitaMerci int
);

create table volo(
idvolo int auto_increment primary key,
giornoSett varchar(16) not null,
aeroportoPart varchar(4) not null,
aeroportoArr varchar(4) not null,
tipoAereo varchar(16) not null,
oraPartenza time not null,
oraArrivo time not null,
constraint fk_aereo foreign key (tipoAereo) references aereo(tipoAereo) on delete restrict on update cascade,
constraint fk_partenza foreign key (aeroportoPart) references aeroporto(id) on delete restrict on update cascade,
constraint fk_arrivo foreign key (aeroportoArr) references aeroporto(id) on delete restrict on update cascade
);

