create database 07_22;
use 07_22;
create table emp(
    id int primary key auto_increment,
    name varchar(20),
    role varchar(10),
    salary decimal(9,2)
);
insert into emp values (null,'双双1','开发',900000),
                       (null,'双双2','开发',905000),
                       (null,'双双3','开发',899090),
                       (null,'双双4','测试',765478),
                       (null,'双双4','测试',676456),
                       (null,'双双5','测试',672345),
                       (null,'双双6','前端',779643),
                       (null,'双双7','前端',778987),
                       (null,'双双8','前端',828987);
select role,salary from emp group by role;
select role,avg(salary) from emp group by role order by avg(salary) desc ;
select count(role) from emp;
select role,avg(salary) from emp group by  role having avg(salary)>710000;

drop table if exists classes;
drop table if exists student;
drop table if exists course;
drop table if exists score;

create table classes (id int primary key auto_increment, name varchar(20), `desc` varchar(100));

create table student (id int primary key auto_increment, sn varchar(20),  name varchar(20), qq_mail varchar(20) ,
                      classes_id int);

create table course(id int primary key auto_increment, name varchar(20));

create table score(score decimal(3, 1), student_id int, course_id int);

insert into classes(name, `desc`) values
('计算机系2019级1班', '学习了计算机原理、C和Java语言、数据结构和算法'),
('中文系2019级3班','学习了中国传统文学'),
('自动化2019级5班','学习了机械自动化');

insert into student(sn, name, qq_mail, classes_id) values
('09982','黑旋风李逵','xuanfeng@qq.com',1),
('00835','菩提老祖',null,1),
('00391','白素贞',null,1),
('00031','许仙','xuxian@qq.com',1),
('00054','不想毕业',null,1),
('51234','好好说话','say@qq.com',2),
('83223','tellme',null,2),
('09527','老外学中文','foreigner@qq.com',2);

insert into course(name) values
('Java'),('中国传统文化'),('计算机原理'),('语文'),('高阶数学'),('英文');

insert into score(score, student_id, course_id) values
-- 黑旋风李逵
(70.5, 1, 1),(98.5, 1, 3),(33, 1, 5),(98, 1, 6),
-- 菩提老祖
(60, 2, 1),(59.5, 2, 5),
-- 白素贞
(33, 3, 1),(68, 3, 3),(99, 3, 5),
-- 许仙
(67, 4, 1),(23, 4, 3),(56, 4, 5),(72, 4, 6),
-- 不想毕业
(81, 5, 1),(37, 5, 5),
-- 好好说话
(56, 6, 2),(43, 6, 4),(79, 6, 6),
-- tellme
(80, 7, 2),(92, 7, 6);
show tables;
select * from student;
select * from course;
select * from score;
select * from classes;
select student.id sid,student.name s_name,score.score score from student,score where student.id = score.student_id and student.name='许仙';
select student.id,student.name,score.student_id,score.score from student join score on student.id = score.student_id and student.name='许仙';
select student.id,student.name,student.qq_mail,student.sn,sum(score) from student,score where score.student_id=student.id group by student.id;
select student.id,student.name,course.name,score.score from student,course,score where student.id=score.student_id and course.id=score.course_id;
select student.id,student.name,course.name,score.score from student,course,score where student.id=score.student_id and course.id=score.course_id;
/*同一张表中查询叫做自连接*/
select s1.student_id,s1.course_id,s1.score,s2.student_id,s2.course_id,s2.score from score s1,score s2
where s1.student_id = s2.student_id
and s1.course_id = 3
and s2.course_id = 1
and s1.score > s2.score;
/*子查询*/
select student.name from student where classes_id=(select classes_id from student where name='不想毕业');
select * from score where course_id in (select id from course where name='英文' or name='语文');
select * from course where id<3 or name='英文';


