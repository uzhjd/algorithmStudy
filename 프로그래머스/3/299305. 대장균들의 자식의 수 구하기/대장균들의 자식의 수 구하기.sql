SELECT ID, IFNULL(CNT, 0) CHILD_COUNT
FROM ECOLI_DATA E LEFT JOIN 
    (SELECT PARENT_ID, COUNt(*) CNT
     FROM ECOLI_DATA
     GROUP BY PARENT_ID) AS G ON E.ID = G.PARENT_ID
ORDER BY ID ASC;