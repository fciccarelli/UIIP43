create database if not exists viaggi
default character set latin1
default collate latin1_general_ci;

use viaggi;

alter database viaggi
default character set utf8
default collate utf8_general_ci;

create table if not exists Aeroporto(
id varchar(4),
citta varchar(64) not null,
nazione varchar(64) not null,
npiste int not null,
primary key(id)
);

create table if not exists Aereo(
tipoAereo varchar(16) primary key,
nPass int not null,
quantitaMerci int
);

create table if not exists Volo(
idVolo int primary key,
giornoSett varchar(16) not null,
aeroportoPart varchar(4) not null,
aeroportoArr varchar(4) not null,
tipoAereo varchar(16) not null,
oraPartenza time not null,
oraArrivo time not null, 
constraint fk_aereo foreign key (tipoAereo) references Aereo(tipoAereo) on delete restrict on update cascade,
constraint fk_partenza foreign key (aeroportoPart) references Aeroporto(id) on delete restrict on update cascade,
constraint fk_arrivo foreign key (aeroportoArr) references Aeroporto(id) on delete restrict on update cascade
);



