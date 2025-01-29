public class FactorialCalculator {

    public static void main(String[] args) {
        // Define the number for which the factorial is to be calculated
        int number = 5;  // You can change this value to calculate the factorial of a different number
        long factorial = 1;  // Use long to handle larger results
        
        // Calculate the factorial using a 'for' loop
        for (int i = 1; i <= number; i++) {
            factorial *= i;  // Multiply factorial by the current value of i
        }
        
        // Print the result
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
 
    

