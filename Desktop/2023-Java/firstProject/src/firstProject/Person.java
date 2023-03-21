package firstProject;
/*
 * with inheritance, you will move all the common attributes and methods to
 * a 'base' class (parent class, super class)
 * 
 * you will then build new functionality which will incorporate this 'base' 
 * class as the building block for the new class (derived class, child class, 
 * sub class)
 * 
 * to use another class as the building block, you use 'extends' and the 
 * base class you want to build on. THERE CAN BE ONLY ONE!
 */

//1. class skeleton (no main)
public class Person {
	
	//2. attributes/data members
	//2a. if this will be a base class (will be inherited from), change 
	//     private to protected. you get the same protection from public (not 
	//     accessible BUT the child/subclass will access the properties as if 
	//     they were declared within the new class itself
	protected int id;
	protected String first_name;
	protected String last_name;
	protected String address;
	//still can't do
	//Person me = new Person();
	//me.first_name = "me"; x not allowed => me.setFirstName("me");
	
	//3. getters/setters
	public void setFirstName( String temp ) { this.first_name = temp; }
	public void setLastName( String temp ) { this.last_name = temp; }
	public void setAddress( String temp ) { this.address = temp; }
	public void setID( int temp ) { this.id = temp; }

	public String getFirstName( ) { return this.first_name; }
	public String getLastName( ) { return this.last_name; }
	public String getAddress( ) { return this.address; }
	public int getID( ) { return this.id; }

	//4. default constructor. SAME NAME AS CLASS, NO RETURN TYPE NOT EVEN VOID
	public Person ( ) {
		//give all attributes initial values
		this.id = 0;			this.first_name = "";	
		this.last_name = "";	this.address = ""; 
	}
	
	//5. secondary constructor(s)
	//we are going to define one where all 4 can be set
	//Person myPerson = new Person("me", "you", "here", 345);
	public Person ( String s1, String s2, String s3, int i4 ) {
		this.first_name = s1;	this.last_name = s2;
		this.address = s3;		this.id = i4;
	}

	//public Person ( String first_name, String last_name, String address, int id ) {	
	//	this.first_name = first_name;	this.last_name = last_name;
	//	this.address = address;		this.id = id;
	//}
	
	//6. other methods
	
	//7. display method
	public void Display( ) {
		System.out.println("id: " + this.id);
		System.out.println("first_name: " + this.first_name);
		System.out.println("last_name: " + this.last_name);
		System.out.println("address: " + this.address);
	}

}






