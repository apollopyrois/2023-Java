package firstProject;

public class TestEmployee {
	
	public static void main(String [] args) {
		Employee employee1 = new Employee(); //Employee is the pattern
											 //employee1 is an instance of Employee
											 //employee1 is an object
											 //Employee is a class
												
											 //new allocates enough memory to store
											 //an employee instance
											 //Employee()
		employee1.display();
		
		employee1.setFirstName("Fred");
		employee1.setLastName("Jones");
		employee1.setPostition("Dog catcher");
		employee1.sethiringDate("2023-01-01"); //yyyy-mm-dd
		employee1.setSalary(44444.44);
		employee1.setEmplpoyeenumber(123);
		
		employee1.display();
		
		String s1 = employee1.getFirstName();
		String s2 = employee1.getLastName();
		String s3 = employee1.getPosition();
		String s4 = employee1.getHiringDate();
		double d5 = employee1.getSalary();
		int i6 = employee1.getEmployeeNumber();
		
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		System.out.println("s3: " + s3);
		System.out.println("s4: " + s4);
		System.out.println("d5: " + d5);
		System.out.println("i6: " + i6);
		
		
		Employee trent3 = new Employee();
		trent3.setFirstName("Trent");
		trent3.setLastName("Trench");
		trent3.display();
		
		
		//let's say we want to initial to an employee's name
		//instead of...
//		Employee trent3 = new Employee();
//		trent3.setFirstName("Trent");
//		trent3.setLastName("Trench");
//		trent3.display();
		
		//we want to do...
		//Employee employee3 = new Employee("me", "you");
		
		Employee employee3 = new Employee("Trent", "Trench");
		employee3.display();
		
//		Employee trent = new Employee();
//		trent.setFirstName("Trent");
//		trent.display();
		Employee trent = new Employee ("Trent");
		trent.display();
		
		/* ambiguous call
		Employee trent2 = new Employee();
		trent2.setLastName("Trench");
		trent2.display();
		*/
		
		//Employee trent4 = new Employee();
		//trent4.setFirstName("Trent");
		//trent4.setLastName("Trench");
		//trent4.setPostition("Singer");
		//trent4.sethiringDate("2011-01-01");
		//trent4.setSalary(555555);
		//trent4.setEmplpoyeenumber(12222);
		//trent4.display();
		
		Employee trent4 = new Employee("Trent", "Trench", "Singer", "2011-01-01", 555555, 122222);
		trent4.display();
		
		
		
		
		
	}
}
