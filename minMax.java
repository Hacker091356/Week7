//Import scanner
import java.util.Scanner;
public class minMax {
    public static void main(String[]args){
        //Initializing the scanner
        Scanner userInput = new Scanner(System.in);
        //Asking the user for input
        System.out.print("Enter a minimum value: ");
        int min = userInput.nextInt();
        System.out.print("Enter a maximum value: ");
        int max = userInput.nextInt();
        System.out.print("Enter a value in range of the min and max: ");
        int inRange = userInput.nextInt();
        
        //While loop (checking if the number is in the range of min and max)
        while (inRange<=min ||  inRange>=max)
        {
            System.out.print("This number is not in range. Enter another number: ");
            inRange = userInput.nextInt();
        }
        if (inRange > min && inRange <max)
        {
            //Closing scanner to avoid wasteage of resources
            userInput.close();
            System.out.print("This number is in range.");
        }
    }
}
       
            
    
    

