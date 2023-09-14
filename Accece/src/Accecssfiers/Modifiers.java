package Accecssfiers;

public class Modifiers {

	public static void main(String[] args) {
		Modifiers m=new Modifiers();
		m.PublicMethod();
		m.PrivateMethod();
		m.ProtectedMethod();
		m.DefaultMethod();

	}
	public void PublicMethod() {
		 System.out.println("Public method is Done");
	 }
	 private void PrivateMethod() {
		 System.out.println("Private method is Done");
	 }
	 protected void ProtectedMethod() {
		 System.out.println("Protected method is Done");
	 }
	 void DefaultMethod() {
		 System.out.println("DefaultMethod is Done");
		 }
}
