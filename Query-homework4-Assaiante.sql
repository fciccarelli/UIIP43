select citta from aeroporto 
where npiste = null;

select aero.nazione from Aeroporto as aero
left join Volo as v on (v.aeroportoPart = aero.id ) and (v.aeroportoArr = aero.id) 
where  idVolo = '1';