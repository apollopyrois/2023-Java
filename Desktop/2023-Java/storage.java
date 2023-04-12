package mainstuff;

public class storage {
	  //list of attributes
	  private int i1;
	  private String s1;
	  private boolean b1;
	  private double d1;
	  private char c1;

	  public int geti1() {return i1;}
	  public void seti1(int i1) {this.i1 = i1;}

	  public String gets1() {return s1;}
      public void sets1(String s1) {this.s1 = s1;}

	  public boolean getb1() {return b1;}
      public void setb1(boolean b1) {this.b1 = b1;}

	  public double getd1() {return d1;}
	  public void setd1(double d1) {this.d1 = d1;}

	  public char getc1() {return c1;}
	  public void setc1(char c1) {this.c1 = c1;}
	  
	  //default constructor
	  public storage () {
		  i1 = 0;
		  s1 = "";
		  b1 = false;
		  d1 = 0;
		  c1 = 'a';
	  }
	  
	  //secondary constructor
	  public storage (int temp1, String temp2, boolean temp3, double temp4, char temp5) {
		  i1 = temp1;
		  s1 = temp2;
		  b1 = temp3;
		  d1 = temp4;
		  c1 = temp5;
	  }
	  
	  public void Display() {
		  System.out.println("i1: "+ i1);
		  System.out.println("s1: "+ s1);
		  System.out.println("b1: "+ b1);
		  System.out.println("d1: "+ d1);
		  System.out.println("c1: "+ c1);
	  }
	  
	    
	  }
