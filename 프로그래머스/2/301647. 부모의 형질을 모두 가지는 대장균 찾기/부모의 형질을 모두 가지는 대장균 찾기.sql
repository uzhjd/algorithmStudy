# SELECT ID, GENOTYPE, P_GENOTYPE AS PARENT_GENOTYPE
# FROM ECOLI_DATA OWN LEFT JOIN 
#      (SELECT ID AS P_ID, GENOTYPE AS P_GENOTYPE FROM ECOLI_DATA) PARENT
#      ON OWN.PARENT_ID = P_ID
# WHERE GENOTYPE & P_GENOTYPE = P_GENOTYPE
# ORDER BY ID ASC;

SELECT C.ID, C.GENOTYPE, P.GENOTYPE AS PARENT_GENOTYPE
FROM ECOLI_DATA C LEFT JOIN ECOLI_DATA P ON C.PARENT_ID = P.ID
WHERE C.GENOTYPE & P.GENOTYPE = P.GENOTYPE
ORDER BY ID ASC;

# SELECT C.ID, C.GENOTYPE, C.PARENT_GENOTYPE
# FROM ECOLI_DATA C JOIN ECOLI_DATA P ON C.PARENT_ID = P.ID
# WHERE C.SIZE_OF_COLONY = P.SIZE_OF_COLONY AND C.GENOTYPE = P.GENOTYPE
# ORDER BY C.ID ASC;