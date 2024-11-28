SELECT car_id,
       max(CASE 
           WHEN to_date('2022-10-16', 'YYYY-MM-DD') BETWEEN start_date AND end_date
           THEN '대여중'
           Else '대여 가능'
       END) AS availability
FROM car_rental_company_rental_history
group by car_id
ORDER BY car_id DESC;