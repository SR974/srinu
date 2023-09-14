package Singlelevel;

public class Chaildclass extends Parentclass {

	public static void main(String[] args) {
		Chaildclass z=new Chaildclass();
		 z.tyres();
		 z.rpm();
		 z.engine();
		 z.breaks();
		 
	

	}
	public void tyres() {
		System.out.println("tyres are good");
		
	}
	public void rpm() {
		System.out.println("rpmcondition good");
	}

}