# Write your MySQL query statement below
SELECT MAX(SALARY) AS SecondHighestSalary 
From Employee where salary <(
    Select MAX(salary) from Employee
);