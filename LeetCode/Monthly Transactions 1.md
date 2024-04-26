### 해볼 만한 정도

```sql
select date_format(trans_date, '%Y-%m') as month,
       country,
       count(*) as trans_count,
       count(case when state = 'approved' then id end) as approved_count,
       sum(amount) as trans_total_amount,
       IFNULL(sum(case when state = 'approved' then amount end), 0) as approved_total_amount
from Transactions
group by date_format(trans_date, '%Y-%m'), country;
```

[ 문제 ] https://leetcode.com/problems/monthly-transactions-i/description/?envType=study-plan-v2&envId=top-sql-50
