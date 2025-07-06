SELECT c.city, co.country
FROM city c
INNER JOIN country co ON c.country_id = co.country_id;

SELECT p.payment_id, cu.first_name, cu.last_name
FROM payment p
INNER JOIN customer cu ON p.customer_id = cu.customer_id;

SELECT r.rental_id, cu.first_name, cu.last_name
FROM rental r
INNER JOIN customer cu ON r.customer_id = cu.customer_id;