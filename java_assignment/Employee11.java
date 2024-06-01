package com.java_assignment;

public class Employee11 {
private int pid;
private String name;
private double salary;


public Employee11() {
	pid = 101;
	name = "pradnya";
	salary=80000;
	
}
 public Employee11(int pid,String name,double salary) {
	 this.pid=pid;
	 this.name=name;
	 this.salary=salary;
	 
	 
 }
 public void printdetails() {
	 System.out.println("pid -" +pid  +" name  -" +name + " salary -" +salary );
 }
 @Override
 public String toString()
{
	 return "pid -" +pid  +" name  -" +name + " salary -" +salary;
	 
}
 public int getEmppid () {
	 return this.pid;
 }
 public String getEmpName()
{
	 return this.name;
	 }
 public double getEmpsalary()
{
	 return this.salary;
	 }
 public void setEmpid(int pid) {
	 this.pid=pid;
	 
 }
 public void setEmpname(String name) {
	 this.name=name;
 }
 public void setEmpsalary(double salary) {
	 this.salary=salary;
 }
 
}
 

