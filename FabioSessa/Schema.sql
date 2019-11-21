drop database if exists viaggi;

create database if not exists viaggi
	default character set utf8
    default collate utf8_unicode_ci;

use viaggi;
    
create table if not exists Aereo(
	tipoAereo varchar(16) primary key,
    nPass int not null,
	quantitaMerci int);

create table if not exists Aeroporto(
	id varchar(4) primary key ,
    citta varchar(64) not null,
    nazione varchar(64) not null,
    nPiste int not null);
    
CREATE TABLE IF NOT EXISTS Volo (
    idVolo INT PRIMARY KEY AUTO_INCREMENT,
    giorniSett VARCHAR(16)not null,
    aeroportoPart VARCHAR(4) not null,
    aeroportoArr VARCHAR(4) not null,
    tipoAereo VARCHAR(16) not null,
    oraPartenza TIME not null,
    oraArrivo TIME not null,
    CONSTRAINT ff_keyPart FOREIGN KEY (aeroportoPart) REFERENCES aeroporto (id) on delete restrict on update cascade ,
    CONSTRAINT f_keyArr FOREIGN KEY (aeroportoArr) REFERENCES aeroporto (id) on delete restrict on update cascade ,
    CONSTRAINT fk_Aereo FOREIGN KEY (tipoAereo) REFERENCES aereo (tipoAereo) on delete restrict on update cascade 
);

