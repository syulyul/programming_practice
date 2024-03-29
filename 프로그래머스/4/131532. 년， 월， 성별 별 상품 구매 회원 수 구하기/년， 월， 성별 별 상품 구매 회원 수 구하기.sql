-- 코드를 입력하세요
SELECT 
    YEAR(b.SALES_DATE) AS YEAR, 
    MONTH(b.SALES_DATE) AS MONTH, 
    a.GENDER, 
    COUNT(DISTINCT b.USER_ID) AS USERS
FROM USER_INFO a 
    JOIN ONLINE_SALE b
    ON a.USER_ID = b.USER_ID
WHERE a.GENDER IS NOT NULL
GROUP BY 1, 2, 3
ORDER BY 1, 2, 3;