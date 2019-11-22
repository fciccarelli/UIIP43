# Le città con un aeroporto di cui non è noto il numero di piste
select citta from aeroporto
	where npiste is null;

# Le nazioni da cui parte e arriva il volo con codice 1;
select a.nazione from aeroporto as a

	inner join volo as v
    on v.aeroportoArr = a.id or v.aeroportoPart = a.id
    where v.idVolo = 1;
    
# I tipi di aereo usati nei voli che partono da Roma;
select distinct v.tipoAereo from volo as v

	left join aeroporto as a
    on a.id = v.aeroportoPart
    where a.citta = 'Roma';
    
# I tipi di aereo e il corrispondente numero di passeggeri per i voli che partono da Roma.
select distinct a.tipoAereo, a.nPass, v.aeroportoPart, v.aeroportoArr, ap.citta from aereo as a

	inner join volo as v
    on a.tipoAereo = v.tipoAereo
    
    inner join aeroporto as ap
    on ap.id = v.aeroportoPart
    
    where ap.citta = 'Roma';
    
# Le città da cui partono voli diretti ad Amsterdam, ordinate alfabeticamente;
select distinct a.citta from aeroporto as a

	left join volo as v
    on a.id = v.aeroportoPart
    
    where v.aeroportoArr = 'AMS'
    order by a.citta asc;
	
# Il numero di voli che partono il venerdì da Napoli;
select count(v.idVolo) as count from volo as v

	left join aeroporto as a
    on v.aeroportoPart = a.id
    
    where v.aeroportoPart = 'NAP'
    
    group by v.giornoSett = 'Venerdì';
    
# Le città italiane da cui partono almeno 2 voli alla settimana diretti in Olanda;
select count(v.idVolo), a.citta from aeroporto as a

	inner join volo as v
    on v.aeroportoPart = a.id
    
    inner join aeroporto as b
    on v.aeroportoArr = b.id
    
    where a.nazione = 'Italia' and b.nazione = 'Olanda' group by a.citta having count(v.idVolo) >=2;
    
# Le città da cui parte l'aereo caratterizzato dal massimo numero di passeggeri;
select distinct ap.citta from aereo as a
	
    inner join volo as v
	on v.tipoAereo = a.tipoAereo

	inner join aeroporto as ap
	on v.aeroportoPart = ap.id
    
where a.npass =  ( select max(b.npass) from aereo as b inner join volo as x on b.tipoAereo = x.tipoAereo);

# Le città su cui è diretto l'aereo caratterizzato dal massimo numero di passeggeri;
select distinct ap.citta from aereo as a
	
    inner join volo as v
	on v.tipoAereo = a.tipoAereo

	inner join aeroporto as ap
	on v.aeroportoArr = ap.id
    
where a.npass =  ( select max(b.npass) from aereo as b inner join volo as x on b.tipoAereo = x.tipoAereo);

# Le città che sono servite dall'aereo caratterizzato dal massimo numero di passeggeri;
select distinct ap.citta from aereo as a
	
    inner join volo as v
	on v.tipoAereo = a.tipoAereo

	inner join aeroporto as ap
	on v.aeroportoPart = ap.id 
    
    inner join aeroporto as b
    on v.aeroportoArr = b.id
    
where a.npass =  ( select max(b.npass) from aereo as b inner join volo as x on b.tipoAereo = x.tipoAereo);