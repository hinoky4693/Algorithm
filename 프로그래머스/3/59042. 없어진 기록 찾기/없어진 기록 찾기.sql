SELECT outs.animal_id, outs.name
from animal_ins ins, animal_outs outs
where ins.animal_id(+) = outs.animal_id
and ins.animal_id is null
order by outs.animal_id
;
