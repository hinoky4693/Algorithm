(select to_char(sales_date,'YYYY-MM-DD') as sales_date, product_id, user_id, sales_amount
from online_sale
where to_char(sales_date,'YYYY-MM-DD') between '2022-03-01' and '2022-03-31')
union
(select to_char(sales_date,'YYYY-MM-DD') as sales_date, product_id, NULL as user_id, sales_amount
from offline_sale
where to_char(sales_date,'YYYY-MM-DD') between '2022-03-01' and '2022-03-31')
order by sales_date asc, product_id asc, user_id asc
;