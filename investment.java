//Imports
import java.lang.Math;

public class investment {
    public static void main(String[] args){
        double interest = 1.075; 
        double years = (Math.log10(2))/(Math.log10(interest));
        System.out.print("Your principal of $2500 will take " + years + " years to be valued $5000 at an interest rate of 1.075% compounded yearly");


    }
}
