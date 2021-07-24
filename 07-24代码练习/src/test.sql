/*1.请你获取薪水第二多的员工的emp_no以及其对应的薪水salary*/
select emp_no,salary from salaries order by salary desc limit 1 offset 1;
/*2.请你查找薪水排名第二多的员工编号emp_no、薪水salary、last_name以及first_name*/
select employees.emp_no,salaries.salary,employees.last_name,employees.first_name
from employees
         join salaries on employees.emp_no = salaries.emp_no
where salary=(
    select max(salary) from salaries
    where salary<(
        select max(salary) from salaries
    )
);
/*3.请你查找所有员工的last_name和first_name以及对应的dept_name，也包括暂时没有分配部门的员工，*/
select employees.last_name,employees.first_name,departments.dept_name
from employees left join dept_emp
                         on employees.emp_no = dept_emp.emp_no
               left join departments
                         on dept_emp.dept_no = departments.dept_no;
/*4.查找在职员工自入职以来的薪水涨幅情况*/
