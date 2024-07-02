SELECT a.apnt_no, p.pt_name, p.pt_no, a.mcdp_cd, d.dr_name, a.apnt_ymd
from patient p, doctor d, appointment a

where a.mddr_id = d.dr_id
and a.pt_no = p.pt_no
and to_char(a.APNT_YMD, 'YYYY-MM-DD') = '2022-04-13'
and apnt_cncl_yn = 'N'
and d.mcdp_cd = 'CS'
order by a.apnt_ymd asc
;
