/*day03 练习题*/
/*1.获取所有员工当前的manager*/
select dept_emp.emp_no,dept_manager.emp_no manager
from dept_emp
join dept_manager on dept_emp.dept_no = dept_manager.dept_no
where dept_emp.emp_no
not in (select emp_no from dept_manager);
/*2.获取每个部门中当前员工薪水最高的相关信息，并按照部门号升序排列*/
(1)按照部门编号分组
(2)找到每个组里面的最高薪水
(3)按照部门编号升序排列
select a.dept_no,b.emp_no,a.salary from
(
    select dept_emp.dept_no,dept_emp.emp_no,max(salary) salary
    from dept_emp
    join salaries on dept_emp.emp_no = salaries.emp_no
    group by dept_emp.dept_no
) as a
join
(
    select dept_emp.dept_no,dept_emp.emp_no,salary
    from dept_emp
    join salaries on dept_emp.emp_no = salaries.emp_no
) as b
on a.dept_no = b.dept_no
and a.salary = b.salary
order by dept_no;
/*3.查找employees表emp_no与last_name的员工信息*/
select * from employees
where (emp_no%2 != 0)
  and last_name != 'Mary'
order by hire_date desc;
/*4.请你统计出各个title类型对应的员工薪水对应的平均工资avg.*/
select titles.title,avg(s.salary) from titles
                                           join salaries s on titles.emp_no = s.emp_no
group by title
order by avg(s.salary) asc;