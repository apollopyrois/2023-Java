package firstProject;
//1. to inherit use extends
public class NewEmployee extends Person {

	//2. define any new attributes that specifically apply to new class
	private String hire_date;
	private String start_date;
	
	//3. getters and setter for these new attributes
	public void setHireDate(String temp) { this.hire_date = temp; }
	public void setStartDate(String temp) { this.start_date = temp; }
	
	public String getHireDate( ) { return this.hire_date; }
	public String getStartDate( ) { return this.start_date; }
		
	//4. default constructor
	public NewEmployee( ) {
		//set ALL initial values
		//this.address = ""; this.first_name = ""; this.last_name=""; this.id = 0;
		super(); //is a call to the default constructor in super class => Person()
		this.hire_date = ""; this.start_date = "";
	}
	
	//5. secondary constructors
	//NewEmployee newEmp2 = new NewEmployee("you", "us", "there", 55, "2000", "2022");
	public NewEmployee(String s1, String s2, String s3, int i4, String s5, 
			           String s6) {
		//this.first_name = s1;	this.last_name = s2; this.address = s3; 
		//this.id = i4;
		super(s1, s2, s3, i4);// Person(s1, s2, s3, i4)
		
		this.hire_date = s5;	this.start_date = s6;		
	}
	
	//4 & 5 have 2 or more methods with the same name in the same scope
	//a form of POLYMORPHISM => overloading (overloaded functions)
	//compiler can distinguish by the number and/or types of the parameters
	
	
	//6. other methods
	
	//7. REDEFINE THE Display METHOD

	//7. you have 2 Display methods with the same name in 2 different scopes
	//a form of POLYMORPHISM => overriding (overridden functions)
	//the current version in your inheritance sequence, is the one used
	public void Display() {
		System.out.println("id: "+ this.id);
		System.out.println("firstname: "+ this.first_name);
		System.out.println("last_name: "+ this.last_name);
		System.out.println("address: "+ this.address);
		
		System.out.println("hire_date: "+ this.hire_date);
		System.out.println("start_date: "+ this.start_date);
	}
	
	//8. test in program
}
