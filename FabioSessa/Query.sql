use viaggi;
select citta from Aeroporto
where nPiste is null;
select a.nazione from Aeroporto as a
inner join Volo as v
on v.aeroportoPart=a.id or  v.aeroportoArr=a.id
where v.idVolo=1;

select distinct ae.tipoAereo from Aereo as ae
inner join Volo as v
on ae.tipoAereo=v.tipoAereo
inner join Aeroporto as ar
on v.aeroportoPart=ar.id
where citta like 'Roma';

select distinct ae.tipoAereo ,ae.nPass from Aereo as ae
inner join Volo as v
on ae.tipoAereo=v.tipoAereo
inner join Aeroporto as ar
on v.aeroportoPart=ar.id
where citta like 'Roma'
order by ae.nPass asc;

select distinct a.citta from Aeroporto as a
inner join Volo v 
on v.aeroportoPart=a.id
where  v.aeroportoArr='AMS'
order by a.citta asc;

select count(v.idVolo) from Volo as v 
left join Aeroporto as a
on v.aeroportoPart =a.id
where a.citta='Napoli' and v.giorniSett='venerdi';

select  count(v.idVolo),a.citta from Aeroporto as a
left join Volo as v
on v.aeroportoPart= a.id 
left join Aeroporto as b 
on v.aeroportoArr = b.id
where b.nazione='Olanda'  and a.nazione='Italia' 
group by a.citta having count(v.idVolo)>=2;


select distinct a.citta from Aeroporto as a
inner join Volo as v
on v.aeroportoPart=a.id
inner  join Aereo as ae
on v.tipoAereo=ae.tipoAereo
where ae.nPass=(select max(nPass) from Volo as vo
	inner join Aereo as  a
    on vo.tipoAereo=a.tipoAereo
);



select distinct a.citta from Aeroporto as a
inner join Volo as v
on v.aeroportoArr=a.id
inner join Aereo as ae
on v.tipoAereo=ae.tipoAereo
 where ae.nPass=(select max(nPass) from Volo as vo
	inner join Aereo as  a
    on vo.tipoAereo=a.tipoAereo
);


select  distinct a.citta from Aeroporto as a
inner  join Volo as v
on v.aeroportoArr=a.id or v.aeroportoPart=a.id
inner  join Aereo as ae
on v.tipoAereo=ae.tipoAereo
where ae.nPass=(select max(nPass) from Volo as vo
	inner join Aereo as  a
    on vo.tipoAereo=a.tipoAereo
);












