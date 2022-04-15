show databases;
use learnersacademy;
select * from classes;
select * from subjects;
select * from teachers;  
select * from subjects;
select * from students;
create table teachers(t_id int primary key,t_name varchar(20),t_sub varchar(20),t_class varchar(20));
create table subjects(sub_id int ,sub_name varchar(20),time varchar(20),class_name varchar(20));
select * from subjects;	
select * from Login3;
create table Login3( id int ,    username varchar(255) NOT NULL,    password varchar(255),PRIMARY KEY (id));
select * from classes;
insert into  classes values(1,"One");
insert into  classes values(2,"Two");
insert into  classes values(3,"Three");
insert into  classes values(4,"Four");

insert into  subjects values(1,"Java",1);
insert into  subjects values(2,"PHP",2);
insert into  subjects values(3,"Pyhton",3);
insert into  subjects values(4,"JavaScript",4);

create table classes(class_id int,class_name varchar(20));