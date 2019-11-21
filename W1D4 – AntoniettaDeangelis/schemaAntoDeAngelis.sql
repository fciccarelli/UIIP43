

create database if not exists viaggi
 default character set utf8
 default collate utf8_unicode_ci ;
 
 use viaggi;
 

 
create table Aereo(
	tipoAereo varchar(16) primary key, 
	nPass int not null,
	quantitaMerci int
	);

create table Aeroporto(
	id varchar(4) primary key, 
	citta varchar(64) not null, 
	nazione varchar(64) not null, 
	npiste int not null
);

create table volo(
     idVolo int auto_increment primary key,
	 giornoSett varchar(10) not null,
	 aeroportoPart varchar(4) not null,
	 aeroportoArr varchar(4) not null , 
	 tipoAereo varchar(16) not null,
	 oraPartenza time not null,
	 oraArrivo time not null,
	 constraint fk_aereo foreign key (tipoAereo) references aereo(tipoAereo) on delete restrict on update cascade,
	 constraint fk_Part foreign key (aeroportoPart) references aeroporto(id) on delete restrict on update cascade,
	 constraint fk_Arr foreign key (aeroportoArr) references aeroporto(id) on delete restrict on update cascade
     );
