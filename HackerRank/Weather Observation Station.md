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
``` mysql

```
