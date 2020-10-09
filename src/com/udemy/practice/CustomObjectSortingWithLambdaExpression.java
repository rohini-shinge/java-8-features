package com.udemy.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee
{
	int		eno;
	String	ename;

	public Employee(int eno, String ename)
	{
		super();
		this.eno = eno;
		this.ename = ename;
	}

	public int getEno()
	{
		return eno;
	}

	public void setEno(int eno)
	{
		this.eno = eno;
	}

	public String getEname()
	{
		return ename;
	}

	public void setEname(String ename)
	{
		this.ename = ename;
	}

	@Override
	public String toString()
	{
		return "Employee [eno=" + eno + ", ename=" + ename + "]";
	}
}

public class CustomObjectSortingWithLambdaExpression
{
	public static void main(String[] args)
	{
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(201, "Rohini"));
		employees.add(new Employee(202, "Gautam"));
		employees.add(new Employee(203, "Dhaval"));
		employees.add(new Employee(204, "Omi"));
		employees.add(new Employee(205, "Niki"));

		System.out.println("Before Sorting:" + employees);
		Collections.sort(employees, (e1, e2) -> (e1.eno > e2.eno) ? -1 : (e1.eno < e2.eno) ? 1 : 0);
		System.out.println("After Sorting:" + employees);

	}
}
