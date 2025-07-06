SELECT COUNT(*) AS film_sayisi
FROM film
WHERE length > (SELECT AVG(length) FROM film);

SELECT COUNT(*) AS en_yuksek_rental_rate_filmleri
FROM film
WHERE rental_rate = (SELECT MAX(rental_rate) FROM film);

SELECT *
FROM film
WHERE rental_rate = (SELECT MIN(rental_rate) FROM film)
  AND replacement_cost = (SELECT MIN(replacement_cost) FROM film);

SELECT customer_id, COUNT(*) AS alisveris_sayisi
FROM payment
GROUP BY customer_id
HAVING COUNT(*) = (
    SELECT MAX(siparis_sayisi)
    FROM (
        SELECT COUNT(*) AS siparis_sayisi
        FROM payment
        GROUP BY customer_id
    ) AS alt_sorgu
)
ORDER BY customer_id;
