-- 코드를 입력하세요
SELECT a.PRODUCT_ID, a.PRODUCT_NAME, SUM(a.PRICE * b.AMOUNT) AS TOTAL_SALES
FROM FOOD_PRODUCT a
    JOIN FOOD_ORDER b
    ON a.PRODUCT_ID = b.PRODUCT_ID
WHERE YEAR(b.PRODUCE_DATE) = 2022 AND MONTH(b.PRODUCE_DATE) = 5
GROUP BY a.PRODUCT_ID
ORDER BY 3 DESC, 1;