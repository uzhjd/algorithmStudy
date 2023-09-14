select a.ingredient_type, sum(b.total_order) as total_order
from icecream_info a, first_half b
where a.flavor = b.flavor
group by a.ingredient_type
order by b.total_order asc