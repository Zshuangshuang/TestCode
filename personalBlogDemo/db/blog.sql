drop database if exists servlet_blog;
create database servlet_blog character set utf8mb4;
use servlet_blog;

create table user(
                     id int primary key auto_increment,
                     username varchar(20) unique,
                     password varchar(20) not null
);
insert into user values (null,'张继科','abc');
insert into user values (null,'马龙','123');
insert into user values (null,'三剑客','666');

create table article(
                        id int primary key auto_increment,
                        title varchar(20) not null ,
                        content  mediumtext not null,
                        create_time timestamp default now(),
                        user_id int,
                        foreign key (user_id) references user(id)
);
insert into article values (null,'三次握手四次挥手','建立请求三次握手，断开连接4次挥手',null,1);
insert into article values (null,'排序','堆排序、快速排序、归并排序',null,2);
insert into article values (null,'数据库索引','底层B+树，索引存储结构InooDB、MyISAM',null,1);
insert into article values (null,'东京奥运会','三剑客最帅',null,3);

select id,username,password from servlet_blog.user where username='';
select id,title,content,create_time,user_id from article where user_id='';