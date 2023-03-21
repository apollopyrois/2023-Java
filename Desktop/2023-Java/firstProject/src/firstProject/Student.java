package firstProject;

public class Student {

	//2. attribute list
	private String first_name;
	private String last_name;
	private int id_number;
	private int age;
	private String program;
	private int courses;
	
	//3. getters and setters
	public String getFirstName() { return this.first_name; }
	public void setFirstName(String temp) {this.first_name = temp; }
	
	public String getLastName() { return this.last_name; }
	public void setLastName(String temp) {this.last_name = temp; }
	
	public int getIdNumber() { return this.id_number; }
	public void setIdNumber(int temp) {this.id_number = temp; }
	
	public int getAge() { return this.age; }
	public void setAge(int temp) {this.age = temp; }
	
	public String getProgram() { return this.program; }
	public void setProgram(String temp) {this.program = temp; }
	
	public int getCourses() { return this.courses; }
	public void setCourses(int temp) {this.courses = temp; }
	
	//4. default constructor
	public Student() {
		this.first_name = "";
		this.last_name = "";
		this.id_number = 0;
		this.age = 0;
		this.program = "";
		this.courses = 0;
	}
	
	
	//5. secondary constructor(s)
	public Student(String s1, String s2, int i3, int i4, String s5, int i6) {
		this.first_name = s1;
		this.last_name = s2;
		this.id_number = i3;
		this.age = i4;
		this.program = s5;
		this.courses = i6;
	}
	
	
	//6.other methods
	
	//7. display
	public void display() {
		System.out.println("First Name: " + this.first_name);
		System.out.println("Last Name: " + this.last_name);
		System.out.println("ID Number: " + this.id_number);
		System.out.println("Age: " + this.age);
		System.out.println("Program: " + this.program);
		System.out.println("Courses: " + this.courses);
	}
}

/*
 * Employee and Student both share some properties because Both are "People"
 * Common fields for a "Person" would be name (first / last), address, date of birth, etc.
 * 
 * it would be useful to have both Student and Employee, not to repeat
 * data where possible. Fewer lines, fewer mistakes, fewer edits.
 * 
 * We are going to build a Person class and have student and Employee build off it
 * (inheritance)
 */