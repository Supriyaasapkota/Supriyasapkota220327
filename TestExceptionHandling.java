public class TestExceptionHandling {
   
        public static void main(String[] args) {
            try {
                // Attempt to divide by zero
                int divideByZero = 100 / 0;
                System.out.println("Result: " + divideByZero);
            } catch (ArithmeticException e) {
                // Handle the exception and print an error message
                System.out.println("Error: ]This is finally block.");
            }
        }
    }
        

