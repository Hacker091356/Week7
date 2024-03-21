//Neil
//Importing the scanner
import java.util.Scanner;

public class numberSum {
    public static void main(String[] args){
        //Initializing scanner
        Scanner userInput = new Scanner(System.in);
        //Asking user for input
        System.out.print("Enter a number: ");
        //Storing user input in variable
        int num = userInput.nextInt();
        //Closing the scanner to avoid wasteage of resources
        userInput.close();
        int startNum = 1;
        //Creating variable for sum
        int sum = ((num * (num + 1))/2);
        //Making the while loop
        System.out.println(startNum);
        while(startNum < num)
        {
            startNum++; 
            System.out.println(startNum);
            if (startNum == num){
            System.out.print("The sum is: " + sum);
            break;
            
            }
        }
        
            
             
    }
}