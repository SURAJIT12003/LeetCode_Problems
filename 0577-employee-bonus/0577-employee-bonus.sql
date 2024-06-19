# Write your MySQL query statement below
select name , bonus from Employee as a left join 
Bonus as B on a.empId = b.empId where b.bonus<1000 or b.bonus is null;