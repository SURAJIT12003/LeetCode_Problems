# Write your MySQL query statement below
select 
(select name from Users where account=Transactions.account)as name 
,sum(amount)
 as balance from Transactions
group by account having balance>10000;