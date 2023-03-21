package firstProject;

public class NewEmployeeTest {

	public static void main(String[] args) {
		NewEmployee newEmp = new NewEmployee();
		newEmp.Display();
		
		
		Person gavin = new NewEmployee();
		gavin.setFirstName("Gavin");
		gavin.Display();
		
		//the base class can instantiate the derived class
		//because the base class is actually the first part
		//of the derived class
		
		

	}

}
