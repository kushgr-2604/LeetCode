# Write your MySQL query statement below
Select 
    d.name AS department,
    e.name AS employee, 
    e.salary AS salary
From employee e join Department d 
on e.departmentId =d.id 
Where (e.departmentId, e.salary) IN (
    select departmentId, Max(Salary)
    From Employee 
    Group by DepartmentId
    ); 