/*Q2. Create a class called Employee that includes three fields—a first name (type String), a last 
name (type String) and a monthly salary (double). Provide a constructor that initializes the three 
instance variables. Provide a set and a get method for each instance variable. If the monthly salary 
is not positive, do not set its value. Write a test application named EmployeeTest that demonstrates 
class Employee’s capabilities. Create two Employee objects and display each object’s yearly salary. 
Then give each Employee a 10% raise and display each Employee’s yearly salary again.*/

package com.sam.assignment3.q2;

public class Tester {

	public static void main(String[] args) {
		Employee emp[] = new Employee[2];

		for (int index = 0; index < emp.length; index++) {
			emp[index] = new Employee();
			emp[index].accpetEmployee();
		}

		System.out.println("First Name" + "\t" + "Last Name" + "\t" + "Salary" + "\t\t" + "Salary After 10% Raise");
		for (int i = 0; i < emp.length; i++) {
			if (emp[i].getSalary() < 0) {
				emp[i].setSalary(0.0);
			}

			double yearlySal = emp[i].getSalary() * 12;
			emp[i].setSalary(yearlySal);

			double raisedSal = yearlySal + (yearlySal * 0.1);

			emp[i].displayEmployee(raisedSal);
		}
	}
}
