SELECT BOARD_ID, WRITER_ID, TITLE, PRICE, decode(status, 'SALE', '판매중', 'RESERVED', '예약중', 'DONE', '거래완료') as STATUS
from used_goods_board
where to_char(created_date, 'YYYY-MM-DD') = '2022-10-05'
order by board_id desc
;