-- 部门表：department
create table dept(
    deptno int primary key comment '部门编号',
    dname varchar(14) comment '部门名称',
    loc varchar(13) comment '部门地址'
);

-- 员工表：employee
create table emp(
    empno int primary key comment '员工编号',
    ename varchar(10) comment '员工姓名',
    job varchar(9) comment '职位',
    mgr int comment '上级领导编号',
    hiredate date comment '入职日期',
    sal double comment '工资',
    comm double comment '提成',
    deptno int comment '所在部门编号'
);

/*工资等级表*/
create table salgrade (
    grade int comment'等级',
    losal double comment'最低工资',
    hisal double comment'最高工资'
);
insert into dept values (10,'ACCOUNTING','NEW YORK');
insert into dept values (20,'RESEARCH','DALLAS');
insert into dept values (30,'SALES','CHICAGO');
insert into dept values (40,'OPERATIONS','BOSTON');

insert into emp values (7369,'SMITH','CLERK',7902,'1980-12-17',800,null,20);
insert into emp values (7499,'ALLEN','SALESMAN',7698,'1981-2-20',1600,300,30);
insert into emp values (7521,'WARD','SALESMAN',7698,'1981-2-22',1250,500,30);
insert into emp values (7566,'JONES','MANAGER',7839,'1981-4-2',2975,null,20);
insert into emp values (7654,'MARTIN','SALESMAN',7698,'1981-9-28',1250,1400,30);
insert into emp values (7698,'BLAKE','MANAGER',7839,'1981-5-1',2850,null,30);
insert into emp values (7782,'CLARK','MANAGER',7839,'1981-6-09',2450,null,10);
insert into emp values (7788,'SCOTT','ANALYST',7566,'1987-4-19',3000,null,20);
insert into emp values (7839,'KING','PRESIDENT',null,'1981-11-17',5000,null,10);
insert into emp values (7844,'TURNER','SALESMAN',7698,'1981-9-08',1500,0,30);
insert into emp values (7876,'ADAMS','CLERK',7788,'1987-5-23',1100,null,20);
insert into emp values (7900,'JAMES','CLERK',7698,'1981-12-31',950,null,30);
insert into emp values (7902,'FORD','ANALYST',7566,'1981-12-3',3000,null,20);
insert into emp values (7934,'MILLER','CLERK',7782,'1982-2-23',1300,null,10);

insert into salgrade values (1,700,1200);
insert into salgrade values (2,1201,1400);
insert into salgrade values (3,1401,2000);
insert into salgrade values (4,2001,3000);
insert into salgrade values (5,3001,9999);
-- 查询对应员工所在的部门
select * from emp,dept where emp.deptno = dept.deptno;
select * from dept inner join emp on dept.deptno=emp.deptno;
-- 查询20部门的员工编号, 姓名, 工资和部门名称（5条）
select emp.empno,emp.ename,emp.sal,dept.dname from emp,dept where dept.deptno=20 and emp.deptno = dept.deptno;