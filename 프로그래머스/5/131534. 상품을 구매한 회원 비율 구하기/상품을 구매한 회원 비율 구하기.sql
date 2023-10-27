SELECT YEAR(SALES_DATE) AS YEAR,
        MONTH(SALES_DATE) AS MONTH,
        COUNT(DISTINCT OS.USER_ID) PUCHASED_USERS,
        ROUND(COUNT(DISTINCT OS.USER_ID)/(
                SELECT SUM(JOINCOUNT) 
                FROM (SELECT COUNT(*) JOINCOUNT FROM USER_INFO 
                      WHERE YEAR(JOINED) = '2021') AS JCQUERY),1) PUCHASED_RATIO
FROM USER_INFO UI
LEFT JOIN ONLINE_SALE OS ON OS.USER_ID = UI.USER_ID
WHERE YEAR(JOINED) = '2021' AND OS.USER_ID IS NOT NULL
GROUP BY YEAR, MONTH
ORDER BY YEAR, MONTH;