package firstProject;

public class TestEmployees {

	public static void main(String[] args) {
		
		//single employee object
		Employee employee1 = new Employee();
		
		/*if you want 4 employees,
		 * Employee employee2, employee3, employee4, employee5 = new Employee();
		 */
		//OR...
		Employee employees[] = new Employee[4]; //Employee employees [4] <= c
		//this declares enough memory to store 4 employee objects
		//IT DOES NOT AUTOMATICALLY PUT AN EMPLOYEE OBJECT IN EACH ELEMENT
		
		//you have too loop through the array and initialize each element
		//to an instance of the Employee class
		for(int i=0; i<4; i++) {
			employees[i] = new Employee();
		}
		
		employees[0].setFirstName("Tanner");
		employees[1].setFirstName("Liam");
		employees[2].setFirstName("Jessica");
		employees[3].setFirstName("Anthony");
		//employees[4].setFirstName(""); //out of bounds
		employees[1].display();
	}

}
