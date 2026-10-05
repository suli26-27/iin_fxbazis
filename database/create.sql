
create database fxbazis;

use fxbazis;

grant all privileges 
on fxbazis.*
to fxbazis@localhost
identified by 'titok';




create table employees(
    id int not null primary key auto_increment,
    name varchar(30),
    city varchar(30),
    salary int
);



select * from employees;


delete from employees;

drop table employees;
