### 1.
``` mysql
select city, state
from station;
```

### 3.
``` mysql
select distinct city
from station
where id % 2 = 0;
```

### 4.
``` mysql
select count(*) - count(distinct(city))
from station;
```

### 18.
``` mysql
select round((max(lat_n) - min(lat_n)) + (max(long_w) - min(long_w)), 4)
from station;
```

### 19.
``` mysql
select round(sqrt(pow(max(lat_n) - min(lat_n), 2) + pow(max(long_w) - min(long_w), 2)), 4)
from station;
```

### 20.
[row_number]
``` mysql
select round(avg(lat_n), 4)
from (select lat_n, row_number() over (order by lat_n) r_num, COUNT(*) OVER () n
      from station) t
where case when mod(n, 2) = 1 then r_num = (n + 1) / 2
           else r_num in (n/2, n/2+1)
      end;
```
[percent_rank]
``` mysql
select round(avg(lat_n), 4)
from (select lat_n, percent_rank() over (order by lat_n) p_rank
      from station) w
where p_rank = 0.5;
```
