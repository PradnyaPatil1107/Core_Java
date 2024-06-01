package com.java_assignment;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee11 emp;
		emp=new Employee11();
		
		Employee11 e1=new Employee11(1, "King", 78000);
		Employee11 e2=new Employee11(2,"Ernst",89000);
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		
		Employee11 e3=new Employee11(101,"John",60000);
		System.out.println(e3.toString());
		emp.setEmpid(200);
		emp.setEmpname("Amruta");
		emp.setEmpsalary(40000);
		System.out.println("pid -" +emp.getEmppid());
		
		System.out.println("name -" +emp.getEmpName());
		
		System.out.println("salary -"+emp.getEmpsalary());
		
		
		
		
		
		
		
		

	}

}
