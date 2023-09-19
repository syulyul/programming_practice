-- 코드를 입력하세요
SELECT a.PRODUCT_CODE, SUM(a.PRICE*b.SALES_AMOUNT)as SALES
FROM PRODUCT a
     JOIN offline_sale b on a.product_id = b.product_id
GROUP BY a.product_code
ORDER BY 2 desc,1