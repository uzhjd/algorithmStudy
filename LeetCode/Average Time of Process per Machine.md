### 해보면 좋을 듯

```mysql
select e.machine_id, round(avg(e.timestamp - s.timestamp), 3) as processing_time
from (select timestamp, machine_id, process_id from Activity where activity_type = 'end') e
      join (select timestamp, machine_id, process_id from Activity where activity_type = 'start') s
        on e.machine_id = s.machine_id and e.process_id = s.process_id
group by s.machine_id;
```

[ 문제 ] https://leetcode.com/problems/average-time-of-process-per-machine/description/?envType=study-plan-v2&envId=top-sql-50
