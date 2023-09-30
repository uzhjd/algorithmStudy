SELECT MONTH(START_DATE) AS MONTH, CAR_ID, COUNT(CAR_ID) AS RECORDS
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE DATE_FORMAT(START_DATE, '%Y-%m') >= '2022-08' AND DATE_FORMAT(START_DATE, '%Y-%m') <= '2022-10' AND CAR_ID IN (SELECT CAR_ID                                                                         FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
                                WHERE DATE_FORMAT(START_DATE, '%Y-%m') >= '2022-08' AND DATE_FORMAT(START_DATE, '%Y-%m') <= '2022-10'
                                GROUP BY CAR_ID
                                HAVING COUNT(CAR_ID) >= 5)                                                                 
GROUP BY CAR_ID, MONTH
HAVING RECORDS >= 1
ORDER BY MONTH, CAR_ID DESC;