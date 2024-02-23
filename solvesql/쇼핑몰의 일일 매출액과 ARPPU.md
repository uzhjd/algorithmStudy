```mysql
SELECT date(order_purchase_timestamp) as dt, count(DISTINCT customer_id) as pu, round(sum(payment_value), 2) as revenue_daily, round((sum(payment_value) / count(DISTINCT customer_id)), 2) as arppu
FROM olist_orders_dataset as o join olist_order_payments_dataset as p on o.order_id = p.order_id
WHERE date(order_purchase_timestamp) >= "2018-01-01"
GROUP BY date(order_purchase_timestamp)
ORDER BY date(order_purchase_timestamp) ASC;
```

[ 문제 ] https://solvesql.com/problems/daily-arppu/
