package demomethods;

public class Demo {
	
	public static void main(String[] args) {
		computer.namemethod();  // call for static method//
	   String str=computer.name; // global varaiable//
	   System.out.println(str); // Call for static varaiable//
	   computer2 obj=new computer2();
	   obj.nonmethod();              // call for non static method//
	   System.out.println(obj.name2); // call for non static varaibale//
	   
}
}
  class computer{
	
	  
	  static String  name= "srinivas";  //STATIC VARAIABLE//
	  public static void namemethod () {  // Static method//
		  int b= 20;
		  System.out.println("print the static method");
	  }
  }
  class computer2{
	  String name2="kumar viajy"; // non static vraiable //
	  public void nonmethod() {   // non static method//
		  System.out.println("print the non staticmethod");
	  }
  }
