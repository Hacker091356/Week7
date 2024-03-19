//Importing scanner
import java.util.Scanner;
public class grades{
    public static void main(String[]Strings){
        //Initializing scanner
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        int numGrade = userInput.nextInt();
        //Closing scanner to avoid wasteage of resources
        userInput.close();
        if(numGrade >= 90){
            System.out.print("Your grade is an A. Excellent job!!");
        
        }else if(numGrade >= 80 && numGrade < 90){
            System.out.print("Your grade is an B. Nice!");
        
        }else if(numGrade >= 70 && numGrade < 80){
            System.out.print("Your grade is an C. Start putting in more work");
        
        }else if(numGrade >= 65 && numGrade < 70){
            System.out.print("Your grade is an D. Wow, you're dumb ");
        
        }else{
            System.out.print("Your grade is an F. F stands for failure");
        }

     }
}