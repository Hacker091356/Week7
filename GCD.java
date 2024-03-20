//Importing scanner
import java.util.Scanner;
public class GCD {
    public static void main(String[] Strings){
        //Initializing scanner
        Scanner userInput = new Scanner(System.in);
        //Asking the user for inputs
        System.out.print("Enter a non-negative integer: ");
        int num1 = userInput.nextInt();
        System.out.print("\nEnter a second non-negative integer: ");
        int num2 = userInput.nextInt();
        while (num2>0)
        {
            int temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }
    }
    
}
