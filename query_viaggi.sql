
# query 1 Le città con un aeroporto di cui non è noto il numero di piste
select citta from aeroporto 
	where nPiste is not null;

# query 2 Le nazioni da cui parte e arriva il volo con codice 1
select a.nazione from aeroporto as a
	
    inner join volo as v
    on v.aeroportoArr = a.id or v.aeroportoPart = a.id
    
    where v.idVolo = 1;
    
# query 3	I tipi di aereo usati nei voli che partono da Roma
select distinct a.tipoAereo, ae.citta from aeroporto as ae

	inner join volo as v
    on v.aeroportoPart = ae.id
    
    inner join aereo as a
    on v.tipoAereo = a.tipoAereo
    
    where v.aeroportoPart = 'FCO';
    
#query 4 I tipi di aereo e il corrispondente numero di passeggeri per i voli che partono da Roma
select distinct a.tipoAereo, a.nPass, v.aeroportoPart,v.aeroportoArr from aeroporto as ae

	inner join volo as v
    on v.aeroportoPart = ae.id
    
    inner join aereo as a
    on v.tipoAereo = a.tipoAereo
    
    where v.aeroportoPart = 'FCO';

# query 5 Le città da cui partono voli diretti ad Amsterdam, ordinate alfabeticamente
select distinct a.citta from aeroporto as a

	inner join volo as v 
    on v.aeroportoPart = a.id
    
    where v.aeroportoArr = 'AMS'
    order by a.citta asc;
    
# query 6 Il numero di voli che partono il venerdì da Napoli
select count(v.idVolo), v.aeroportoArr from volo as v

	inner join aeroporto as a
    on v.aeroportoPart = a.id
    
	where v.giornoSett like 'Venerdì' and v.aeroportoPart = 'NAP';
    
# query 7 •	Le città italiane da cui partono almeno 2 voli alla settimana diretti in Olanda
select a.citta from aeroporto as a

	inner join volo as v
    on v.aeroportoPart = a.id
    
    where a.nazione = 'Italia' having count(v.idVolo) >= 1;

# query 8 •	Le città da cui parte l'aereo caratterizzato dal massimo numero di passeggeri
select a.citta from aeroporto as a
	
    inner join volo as v
    on v.aeroportoPart = a.id
    
    inner join aereo as p
    on v.tipoAereo = p.tipoAereo
    
    having max(nPass);
    
# query 9 •	Le città su cui è diretto l'aereo caratterizzato dal massimo numero di passeggeri
select a.citta from aeroporto as a
	
    inner join volo as v
    on v.aeroportoArr = a.id
    
    inner join aereo as p
    on v.tipoAereo = p.tipoAereo
    
    having max(nPass);
    
# query •	Le città che sono servite dall'aereo caratterizzato dal massimo numero di passeggeri
select a.citta from aeroporto as a
	
    inner join volo as v
    on v.aeroportoArr = a.id and v.aeroportoPart = a.id
    
    inner join aereo as p
    on v.tipoAereo = p.tipoAereo
    
    having max(nPass);
    
