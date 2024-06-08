# Write your MySQL query statement below
select name as Employee from Employee  as a where a.salary>
(select salary from Employee as b where b.id=a.managerId);
