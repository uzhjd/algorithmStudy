### 쉬움
```mysql
select e.name, bonus
from employee e left join bonus b on e.empId = b.empId
where e.empId NOT IN (select empId
                    from Bonus
                    where bonus >= 1000);
```

[ 문제 ] https://leetcode.com/problems/employee-bonus/?envType=study-plan-v2&envId=top-sql-50
