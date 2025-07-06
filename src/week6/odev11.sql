SELECT first_name FROM actor
UNION
SELECT first_name FROM customer
ORDER BY first_name;

SELECT first_name FROM actor
INTERSECT
SELECT first_name FROM customer
ORDER BY first_name;

SELECT first_name FROM actor
EXCEPT
SELECT first_name FROM customer
ORDER BY first_name;

-- 1. Tüm first_name verileri (tekrarlar dahil)
SELECT first_name FROM actor
UNION ALL
SELECT first_name FROM customer
ORDER BY first_name;

-- 2. Kesişen first_name verileri (tekrarlar dahil)
SELECT first_name FROM actor
INTERSECT ALL
SELECT first_name FROM customer
ORDER BY first_name;

-- 3. İlk tabloda olup ikinci tabloda olmayan first_name verileri (tekrarlar dahil)
SELECT first_name FROM actor
EXCEPT ALL
SELECT first_name FROM customer
ORDER BY first_name;
