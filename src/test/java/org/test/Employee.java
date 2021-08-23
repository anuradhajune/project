package org.test;

public class Employee {
	
	 public static Employee e;
	 
	private Employee() {
		
	}
	public static Employee createObj() {
		if (e==null) {
			e=new Employee();
			
		}
		return e;

	}
	private void employeeDetails() {
		System.out.println("Arun");

	}
	public static void main(String[] args) {
		Employee c = createObj();
		c.employeeDetails();
		System.out.println(System.identityHashCode(c));
		Employee es = createObj();
		es.employeeDetails();
		System.out.println(System.identityHashCode(es));
		
	
	}
	

}
