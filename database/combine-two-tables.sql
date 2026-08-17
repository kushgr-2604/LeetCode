# Write your MySQL query statement below
select p.firstName,p.lastName, A.city,A.state from Person p LEFT JOIN Address A ON p.personID = A.personID; 