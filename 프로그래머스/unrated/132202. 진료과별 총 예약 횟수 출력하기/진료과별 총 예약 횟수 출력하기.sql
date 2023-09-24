SELECT MCDP_CD AS 진료과코드, COUNT(APNT_NO) AS 5월예약건수
FROM APPOINTMENT
WHERE (APNT_NO) IN (SELECT APNT_NO
                             FROM APPOINTMENT
                             WHERE DATE_FORMAT(APNT_YMD, '%Y-%m') = '2022-05')
GROUP BY MCDP_CD
ORDER BY COUNT(APNT_NO) ASC, MCDP_CD ASC;