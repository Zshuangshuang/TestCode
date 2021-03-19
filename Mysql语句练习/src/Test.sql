
drop database if exists test;
create database test;
use test;

drop table if exists class;
create table class(
    cid int primary key auto_increment,
    caption varchar(10)
);
drop table if exists student;
create table student(
    sid int primary key auto_increment,
    sname varchar(30),
    gender char(3),
    class_id int,
    foreign key (class_id) references class(cid)
);
create table teacher(
  tid int primary key auto_increment,
  tname varchar(20)
);

create table course(
    cid int primary key auto_increment,
    cname varchar(20),
    teacher_id int,
    foreign key(teacher_id) references teacher(tid)
);

create table score(
    sid int primary key auto_increment,
    student_id int,
    course_id int,
    number decimal(3,1),
    foreign key (student_id) references student(sid),
    foreign key (course_id) references course(cid)
  );
