SELECT replacement_cost, COUNT(*) AS film_sayisi FROM film
GROUP BY replacement_cost
HAVING COUNT(*) > 50
ORDER BY film_sayisi DESC