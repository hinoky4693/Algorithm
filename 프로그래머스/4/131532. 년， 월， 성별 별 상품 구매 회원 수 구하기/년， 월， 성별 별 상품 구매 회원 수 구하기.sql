SELECT to_char(o.sales_date, 'yyyy') as year, to_number(to_char(o.sales_date, 'mm')) as month, u.gender, count(distinct o.user_id) as users
from user_info u, online_sale o
where u.user_id = o.user_id
and u.gender in (0,1)
group by to_char(o.sales_date, 'yyyy'), to_number(to_char(o.sales_date, 'mm')), u.gender
order by year, month, gender
;