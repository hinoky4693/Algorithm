select history_id, car_id, to_char(start_date,'yyyy-mm-dd'), to_char(end_date,'yyyy-mm-dd'),
case 
    when end_date - start_date + 1 >= 30 then '장기 대여'
    else '단기 대여'
end as rent_type
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where start_date between to_date('2022-09-01', 'yyyy-mm-dd') and to_date('2022-09-30','yyyy-mm-dd')
order by history_id desc
;