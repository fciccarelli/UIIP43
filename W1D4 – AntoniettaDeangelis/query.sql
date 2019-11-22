#select citta from aeroporto
#where npiste = null;

#1 select a.nazione from Aeroporto as a
#left join Volo as v on (v.aeroportoPart = a.id ) and (v.aeroportoArr = a.id)
#where  idVolo = '1';
#use viaggi;




#2 select distinct a.tipoAereo  from Aereo as a 
#left join volo as v 
#on v.tipoAereo = a.tipoAereo
#left join aeroporto as ar
#on v.aeroportoPart=ar.id
#where ar.citta='Roma';

#3 select distinct a.tipoAereo ,  a.npass from Aereo as a 
#left join volo as v 
#on v.tipoAereo = a.tipoAereo
#left join aeroporto as ar
#on v.aeroportoPart=ar.id
#where ar.citta='Roma';

#4 select distinct a.tipoAereo ,  a.npass from Aereo as a 
#left join volo as v 
#on v.tipoAereo = a.tipoAereo
#left join aeroporto as ar
#on v.aeroportoPart=ar.id
#where ar.citta='Roma';

#5 select distinct ar.citta from aeroporto as ar
#left join volo as v 
#on  v.aeroportoPart=ar.id
#where v.aeroportoArr='AMS'
#order by citta asc;


