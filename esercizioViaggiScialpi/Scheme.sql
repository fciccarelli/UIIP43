#drop database if exists Viaggi;

create database if not exists Viaggi
	default character set utf8
    default collate utf8_general_ci;

use Viaggi;

create table if not exists Aereo (
	tipoAereo varchar(16) primary key,
    nPass int(11) not null,
    quantitaMerci int(11)
);

create table if not exists Aeroporto (
	id varchar(4) primary key,
    citta varchar(64) not null,
	nazione varchar(64) not null,
    npiste int(11)
);

create table if not exists Volo (
	idVolo int(11) primary key auto_increment,
    giornoSett varchar(16) not null,
    aeroportoPart varchar(4) not null,
    aeroportoArr varchar(4) not null,
    tipoAereo varchar(16) not null,
    oraPartenza time not null,
    oraArrivo time not null,
    constraint fk_part foreign key(aeroportoPart) references Aeroporto(id),
    constraint fk_arr foreign key(aeroportoArr) references Aeroporto(id),
	constraint fk_aereo foreign key(tipoAereo) references Aereo(tipoAereo)
);

