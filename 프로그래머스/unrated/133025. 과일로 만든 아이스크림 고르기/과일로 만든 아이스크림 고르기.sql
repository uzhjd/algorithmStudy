SELECT H.FLAVOR
FROM FIRST_HALF H, ICECREAM_INFO I
WHERE H.FLAVOR = I.FLAVOR AND TOTAL_ORDER > 3000 AND INGREDIENT_TYPE = 'fruit_based'
ORDER BY TOTAL_ORDER DESC;