create database 2021_07_21;
use 2021_07_21;
create table goods(
    goods_id int,
    goods_name varchar(20),
    goods_price decimal(4,1),
    category varchar(10),
    provider varchar(10)
);
create table customer(
  customer_id int,
  name varchar(20),
  address varchar(30),
  email varchar(40),
  sex varchar(2),
  card_id varchar(40)
);
create table purchase(
    order_id int,
    customer_id int,
    goods_id int,
    nums int
);
show tables;
drop table if exists student;
create table student(
    id int,
    name varchar(20),
    score decimal(3,1),
    email varchar(20)
);
insert into student values (1,'张三',98.2,'1234@qq.com');
select * from student;
create table exam_result(
    id int ,
    name varchar(20),
    chinese decimal(3,1),
    english decimal(3,1),
    math decimal(3,1)
);
insert into exam_result values (1,'张三',79.8,92.1,94.5);
insert into exam_result values (2,'李四',91.8,73.1,65.5);
insert into exam_result values (3,'王五',69.8,67.1,98.5);
insert into exam_result values (4,'嘻嘻',72.4,82.5,64.2);
insert into exam_result values (5,'哈哈',69.6,84.6,74.4);
insert into exam_result values (6,'呵呵',73.2,59.8,96.8);
insert into exam_result values (7,'牛牛',88.8,66.6,52.1);
select * from exam_result;
select * from exam_result order by chinese desc ;
select name,(chinese+math+english) as total from exam_result order by total desc ;
select name,chinese,math,english from exam_result order by chinese desc ,math asc ;

