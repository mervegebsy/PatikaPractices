SELECT c.city, co.country
FROM city c
LEFT JOIN country co ON c.country_id = co.country_id;

SELECT p.payment_id, cu.first_name, cu.last_name
FROM customer cu
RIGHT JOIN payment p ON cu.customer_id = p.customer_id;

SELECT r.rental_id, cu.first_name, cu.last_name
FROM customer cu
FULL JOIN rental r ON cu.customer_id = r.customer_id;
