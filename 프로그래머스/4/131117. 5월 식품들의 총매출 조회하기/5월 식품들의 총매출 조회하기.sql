# SELECT P.PRODUCT_ID, PRODUCT_NAME, SUM(AMOUNT * PRICE) AS TOTAL_SALES
# FROM FOOD_PRODUCT P JOIN FOOD_ORDER O ON P.PRODUCT_ID = O.PRODUCT_ID
# WHERE DATE_FORMAT(PRODUCE_DATE, '%Y-%m') = '2022-05'
# GROUP BY PRODUCT_NAME
# ORDER BY TOTAL_SALES DESC, PRODUCT_ID;

SELECT P.PRODUCT_ID, PRODUCT_NAME, SUM(AMOUNT * PRICE) AS TOTAL_SALES
FROM FOOD_PRODUCT P JOIN FOOD_ORDER O ON P.PRODUCT_ID = O.PRODUCT_ID
WHERE DATE_FORMAT(PRODUCE_DATE, '%Y-%m') = '2022-05'
GROUP BY P.PRODUCT_ID
ORDER BY TOTAL_SALES DESC, PRODUCT_ID ASC;