select citta from aeroporto where nPiste is null;



select a.nazione from aeroporto as a
left join volo as v
on a.id = v.aeroportoArr or a.id = v.aeroportoPart
where v.idvolo = 1;

select distinct a.tipoAereo, p.citta from aereo as a
left join volo as v
on v.tipoAereo = a.tipoAereo
left join aeroporto as p
on p.id = v.aeroportoPart 
where p.citta like '%Roma%';

select distinct a.tipoAereo, a.npass, p.citta from aereo as a
left join volo as v
on v.tipoAereo = a.tipoAereo
left join aeroporto as p
on p.id = v.aeroportoPart
where p.citta like '%Roma%';

select distinct p.citta from aeroporto as p
inner join volo as v
on v.aeroportoPart = p.id
where v.aeroportoArr = 'AMS'
order by p.citta asc;

select count(v.idVolo) as count from volo as v
left join aeroporto as a
on a.id = v.aeroportoPart
where a.citta like '%Napoli%' and v.giornoSett = 'Venerdi';

select count(p.nazione = 'Italia') as count, p.citta from aeroporto as p
inner join volo as v
on p.id = v.aeroportoPart
where count >= 2 and v.aeroportoArr = 'AMS' and p.nazione = 'Italia';

select a.citta from aeroporto as a
inner join volo as v
on a.id = v.aeroportoPart
inner join aereo as p
on p.tipoAereo = v.tipoAereo
having max(p.npass);

select a.citta from aeroporto as a
inner join volo as v
on a.id = v.aeroportoArr
inner join aereo as p
on p.tipoAereo = v.tipoAereo
having max(p.npass);

select a.citta from aeroporto as a
inner join volo as v
on a.id = v.aeroportoArr AND a.id = v.aeroportoPart
inner join aereo as p
on p.tipoAereo = v.tipoAereo
having max(p.npass);