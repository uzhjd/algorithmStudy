### Average Population of Each Continent

``` mysql
select city.name
from city, country
where city.countrycode = country.code and continent = 'Africa'
```

https://www.hackerrank.com/challenges/african-cities/problem?isFullScreen=true
