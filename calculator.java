

public class calculator {
    double add;
    double subtract;
    double multiply;
    
    
    
    public static double add(double a, double b) {
        return a + b;

    }
    public static double subtract(double a, double b) {
        return a - b;

    }   
    public static double multiply(double a, double b) {
        return a * b;

    }   
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;

    }
    
    public static void main(String[] args) {

        System.out.println("Addition: " + add(25, 10));
        System.out.println("Subtraction: " + subtract(25, 10)); 
        System.out.println("Multiplication: " + multiply(25, 10));
        System.out.println("Division: " + divide(25, 10));
      
     

      
    }


}
