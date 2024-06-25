```mysql
WITH RankedPayments AS (
    SELECT day, time, sex, total_bill,
            ROW_NUMBER() OVER (PARTITION BY day ORDER BY total_bill DESC) AS rn
    FROM tips
)

SELECT day, time, sex, total_bill
FROM RankedPayments
WHERE rn <= 3
ORDER BY day, total_bill DESC;
```

[ 문제 ] https://solvesql.com/problems/top-3-bill/
