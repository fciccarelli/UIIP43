select citta from aeroporto
where npiste is null;

select a.nazione from aeroporto as a
left join volo as v
on v.aeroportoArr = a.id or v.aeroportoPart = a.id
where idVolo = 1;

select distinct v.tipoAereo from volo as v
left join aeroporto as a
on v.aeroportoPart = a.id
where a.citta = 'Roma';

select a.tipoAereo, a.npass, p.citta from aereo as a
left join volo as v
on v.tipoAereo = a.tipoAereo
left join aeroporto as p
on p.id = v.aeroportoPart
where p.citta like '%Roma%';

select a.citta from aeroporto as a
left join volo as v
on v.aeroportoPart = a.id
where v.aeroportoArr = 'AMS'
group by a.citta;

select count(v.idVolo) from volo as v
left join aeroporto as a
on v.aeroportoPart = a.id
where  v.aeroportoPart = 'NAP'
group by v.giornoSett = 'venerdì';

select a.citta from aeroporto as a
inner join volo as v
on v.aeroportoPart = a.id 
inner join aereo as p
on p.tipoAereo = v.tipoAereo
having max(p.npass);

select p.citta from aeroporto as p
inner join volo as v
on v.aeroportoArr = p.id 
inner join aereo as a
on a.tipoAereo = v.tipoAereo
having max(a.npass);

select p.citta from aeroporto as p
inner join volo as v
on v.aeroportoArr = p.id and v.aeroportoPart = p.id
inner join aereo as a
on a.tipoAereo = v.tipoAereo
having max(a.npass);







