package userdefinedobjects;
import java.util.HashSet;
//import java.util.ArrayList;
import java.util.Iterator;

//import oopsday4inheritance.Employee;

public class TestEmpHashSet {

	public static void main(String[] args) {

		HashSet<Employee> empSet = new HashSet<Employee>();
		 
		Employee emp1 = new Employee("John Doe","Male",24,101,"Research",40000);
	      
	      Employee emp2 = new Employee("Jane Doe","Female",23,102,"Accounting",35000);
	      Employee emp3 = new Employee("Jason Doe","Male",28,103,"Sales",10000);
	      Employee emp4 = new Employee("Jones Doe","Male",23,104,"Research",40000);
	      Employee emp5 = new Employee("Jonas Doe","Female",26,101,"Marketing",50000);
		
	      empSet.add(emp1);
	      empSet.add(emp2);
	      empSet.add(emp3);
	      empSet.add(emp4);
	      empSet.add(emp5);
	      
	      
	      System.out.println(empSet);
		
		
		
		
		
	}

}