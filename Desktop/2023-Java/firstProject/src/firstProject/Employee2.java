package firstProject;
//1. create skeleton
public class Employee2 {

	//2. attributes
	private Person myPerson;
	private String hire_date;
	private String start_date;

	//3. getters and setters
	public void setFirstName(String temp) {
		this.myPerson.setFirstName(temp);
	}
	public String getFirstName() {
		return this.myPerson.getFirstName();
	}
	
	//4. default constructors
	public Employee2 () {
		this.myPerson = new Person ();
		this.hire_date = "";
		this.start_date = "";
	}
}
