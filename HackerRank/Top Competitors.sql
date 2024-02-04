### #Basic Join #medium

``` mysql
SELECT s.hacker_id, h.name
FROM Submissions s
    INNER JOIN Challenges c ON s.challenge_id = c.challenge_id
    INNER JOIN Difficulty d ON c.difficulty_level = d.difficulty_level
    INNER JOIN Hackers h ON s.hacker_id = h.hacker_id
WHERE d.score = s.score
GROUP BY s.hacker_id, h.name
HAVING count(s.challenge_id) > 1
ORDER BY count(s.challenge_id) DESC, s.hacker_id
```

### [출처]
https://www.hackerrank.com/challenges/full-score/problem?isFullScreen=true