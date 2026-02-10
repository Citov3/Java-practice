import java.util.Scanner;


public class math {
    public static void main(String[] args) {

//IMPLEMENT SCANNER TO GET USER INPUT
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
//initialize variable to store user input
        int num1 = sc.nextInt();

        //prompt second number from user
        System.out.println("Enter another number: ");
        int num2 = sc.nextInt();
        //Add,subtract,multiply,divide
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        //Display results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);






        
   
      
      
        
    }
}