package firstProject;

/*
 * 1. Create the skeleton
 * 2. add attributes, properties, data members, member variables
 * 3. create getter and setter functions
 * 4. create a default constructor
 * 5. create other secondary constructor(s)
 * 6. create a display function
 * 7. any other functions your class required
 * 8. test in a program
 * 
 */

public class Employee {
	//2. attributes
	private String first_name;
	private String last_name;
	private String position;
	private double salary;
	private String hiring_date;
	private int employee_number;
	
	//3. getters and setter/accessors and mutators
	public String getFirstName() { return this.first_name; }
	public String getLastName() { return this.last_name; }
	public String getPosition() { return this.position; }
	public double getSalary() { return this.salary; }
	public String getHiringDate() { return this.hiring_date; }
	public int getEmployeeNumber() { return this.employee_number; }
	
	public void setFirstName(String temp) { this.first_name = temp;}
	public void setLastName(String last_name) { this.last_name = last_name;}
	public void setPostition(String temp) { this.position = temp; } 
	public void setSalary(double temp) { this.salary = temp; }
	public void sethiringDate(String temp) { this.hiring_date = temp; }
	public void setEmplpoyeenumber(int temp) { this.employee_number = temp; }


	
	//4. default constructor (this is here we initialize our attributes)
	//function name is EXACTLY SAME AS CLASS NAME, NO VALUES IN PARENTHESES
	//NO RETURN TYPE, NOT EVEN VOID
	public Employee() {
		this.first_name = "";
		this.last_name = "";
		this.position = "";
		this.hiring_date = "";
		this.salary = -1;
		this.employee_number = -1;
	}
	
	//5. other constructors
	public Employee( String s1, String s2) {
		this.first_name = s1;
		this.last_name = s2;
		this.position = "";
		this.hiring_date = "";
		this.salary = -1;
		this.employee_number = -1;
		
	}
	
	public Employee(String firstName) {
		this.first_name = firstName;
		this.last_name = "";
		this.position = "";
		this.hiring_date = "";
		this.salary = -1;
		this.employee_number = -1;
	}
	
	//ambiguous method declaration. compiler can't tell the difference between
	//two functions with only 1 string value passed to it
	/*
	public Employee(String lastName) {
		this.first_name = "";
		this.last_name = lastName;
		this.position = "";
		this.hiring_date = "";
		this.salary = -1;
		this.employee_number = -1;
	}
	*/
	
    public Employee(String s1, String s2, String s3, String s4, double d5, int i6) {
    	this.first_name = s1;
		this.last_name = s2;
		this.position = s3;
		this.hiring_date = s4;
		this.salary = d5;
		this.employee_number = i6;
    }
	
	
	//6. display function
	public void display() {
		System.out.println("The Employee's current values (state) are: ");
		System.out.println("FirstName: " + this.first_name );
		System.out.println("LastName: " + this.last_name );
		System.out.println("Position: " + this.position );
		System.out.println("Salary: " + this.salary );
		System.out.println("HiringDate: " + this.hiring_date );
		System.out.println("EmployeeNumber: " + this.employee_number );
	}
	
	//7. extra functions

	
	

}
