# query numero 8 revisionata e corretta
select distinct ar.citta from aereo as s
	
    inner join volo as v
	on v.tipoAereo = s.tipoAereo

	inner join aeroporto as ar
	on v.aeroportoPart = ar.id
    
where s.npass =  ( select max(b.npass) from aereo as b inner join volo as x on b.tipoAereo = x.tipoAereo);

# query numero 9 revisionata e corretta

select distinct ar.citta from aereo as s
	
    inner join volo as v
	on v.tipoAereo = s.tipoAereo

	inner join aeroporto as ar
	on v.aeroportoArr = ar.id
    
where s.npass =  ( select max(b.npass) from aereo as b inner join volo as x on b.tipoAereo = x.tipoAereo);

# query numero 10 revisionata e corretta

select distinct ar.citta from aereo as s
	
    inner join volo as v
	on v.tipoAereo = s.tipoAereo

	inner join aeroporto as ar
	on v.aeroportoPart = ar.id 
    
    inner join aeroporto as z
    on v.aeroportoArr = z.id
    
where s.npass =  ( select max(b.npass) from aereo as b inner join volo as x on b.tipoAereo = x.tipoAereo);