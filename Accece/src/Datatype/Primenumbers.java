package Datatype;

public class Primenumbers {

	public static void main(String[] args) {
		System.out.println("Prime numbers up to 50:");
        int n = 50; // Initialize the value of n
        
        for (int i = 2; i <= n; i++) { // Loop through numbers from 2 to n
            int count = 0; // Initialize a counter for divisors
            
            for (int j = 2; j < i; j++) { // Loop to check divisors from 2 to i-1
                if (i % j == 0) { // Check if i is divisible by j
                    count++; // Increment the counter if i is divisible by j
                }
            }
            
            if (count == 0) { // If count remains 0, i has no divisors other than 1 and itself
                System.out.println("Prime number: " + i); // Print i, which is a prime number
            }
        }
    }

	}

