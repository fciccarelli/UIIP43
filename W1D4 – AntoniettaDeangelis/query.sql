#select citta from aeroporto
#where npiste = null;

#select a.nazione from Aeroporto as a
#left join Volo as v on (v.aeroportoPart = a.id ) and (v.aeroportoArr = a.id)
#where  idVolo = '1';
use viaggi;

select a.tipoAereo from Aereo as a 
left join volo as v 
on v.aeroportoPart= a.tipoAereo
left join aeroporto as ar
on v.aeroportoArr=ar.id
where ar.citta='roma';




