# Write your MySQL query statement below
select a.employee_id from employees as a  left join salaries as b on  a.employee_id=b.employee_id 
where b.employee_id is null  union select b.employee_id from employees as a  right join salaries as b on  a.employee_id=b.employee_id 
where a.employee_id is null order by employee_id asc;