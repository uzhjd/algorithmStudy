SELECT DISTINCT NOW.USER_ID USER_ID, NOW.PRODUCT_ID PRODUCT_ID
FROM ONLINE_SALE NOW LEFT JOIN (SELECT * FROM ONLINE_SALE) RE ON NOW.USER_ID = RE.USER_ID
WHERE NOW.PRODUCT_ID = RE.PRODUCT_ID AND NOW.SALES_DATE != RE.SALES_DATE
ORDER BY NOW.USER_ID ASC, PRODUCT_ID DESC;