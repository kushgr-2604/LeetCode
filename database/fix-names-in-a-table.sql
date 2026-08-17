# Write your MySQL query statement below
Select user_id, Concat(
    Upper(left(name,1)),
    lower(Substring(name,2))
    ) AS name from Users
    ORDER BY user_id;