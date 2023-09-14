package Overloading;

public class Methodoverloading {

	public static void main(String[] args) {
		facebook h=new facebook();
		//h.login(1234);
		h.login("srni@mail.com");

	}
	
}
  class facebook{
	  public void login(long contact) {
		  System.out.println("u have login through number");
	  }
	  public void login(String mail) {
		  System.out.println("u have login through email");
  }
  }
