UPDATE employee
SET username = 'updated_user_10'
WHERE id = 10;

UPDATE employee
SET email = 'update@updatedmail.com'
WHERE username = 'bkrug2';

UPDATE employee
SET username = 'female_user'
WHERE gender = 'Female';

UPDATE employee
SET gender = 'Other'
WHERE email = 'racomek@nymag.com';

DELETE FROM employee
WHERE id = 15;

DELETE FROM employee
WHERE username = 'erikelx';

DELETE FROM employee
WHERE id IN (
    SELECT id FROM employee WHERE gender = 'Male' LIMIT 1
);

DELETE FROM employee
WHERE email = 'dmckenna18@ustream.tv';

UPDATE employee
SET email = 'ali.kara@company.com'
WHERE gender = 'Female' AND username = 'msellwood1a';

DELETE FROM employee
WHERE gender = 'Other';