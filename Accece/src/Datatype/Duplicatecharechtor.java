package Datatype;

public class Duplicatecharechtor {

	public static void main(String[] args) {
		 String input = "shimakh technology";
	        
	        int[] charCount = new int[256]; // Assuming ASCII characters
	        
	        System.out.println("Input String: " + input);
	        System.out.print("Duplicate Characters: ");
	        
	        for (char c : input.toCharArray()) {
	            charCount[c]++;
	        }
	        
	        for (int i = 0; i < charCount.length; i++) {
	            if (charCount[i] > 1) {
	                System.out.print((char) i + " ");
	            }
	        }

	}

}
