-- 코드를 입력하세요
SELECT 
    a.MEMBER_NAME, 
    b.REVIEW_TEXT, 
    DATE_FORMAT(b.REVIEW_DATE, '%Y-%m-%d') AS REVIEW_DATE
FROM MEMBER_PROFILE a
    JOIN REST_REVIEW b
    ON a.MEMBER_ID = b.MEMBER_ID
WHERE b.MEMBER_ID = (SELECT MEMBER_ID 
                     FROM REST_REVIEW 
                     GROUP BY MEMBER_ID 
                     ORDER BY COUNT(*) DESC 
                     LIMIT 1)
ORDER BY 3, 2;