### 쉬움

```sql
select distinct author_id as id
from Views
where author_id = viewer_id
order by author_id ASC;
```

[ 문제 ] https://leetcode.com/problems/article-views-i/?envType=study-plan-v2&envId=top-sql-50
