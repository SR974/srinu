package Accecssfiers;

public class Foreach {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i--) {     // Outer loop for number of lines      
			 for (int j = 1; j <= i; j--) { // Inner loop for printing stars in each line
			   System.out.print("*");
		  }
		   System.out.println();         // Move to the next line after printing stars

	}

}
}