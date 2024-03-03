### 해봐!!

```sql
select stu.student_id, stu.student_name, sub.subject_name, count(e.student_id) as attended_exams
from Students stu
     join Subjects sub
     left join Examinations e
     on stu.student_id = e.student_id and sub.subject_name = e.subject_name
group by stu.student_id, sub.subject_name
order by stu.student_id, sub.subject_name;
```

[ 문제 ] https://leetcode.com/problems/students-and-examinations/?envType=study-plan-v2&envId=top-sql-50
