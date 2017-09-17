package assignment6_2;
import java.util.Scanner;
//Write a program to generate a user-defined exception called NegativeAgeException if the user inputs negative value for age.
public class Assignment6_2 {
	public static void main(String args[]){
		
		Scanner userInput=new Scanner(System.in);
		System.out.println("Please enter input number!!");
		int number;
		try{
			number=userInput.nextInt();	
			if(number<0){
				throw new NegativeAgeException("Age can not be negative");
			}
		}
		catch(NegativeAgeException e){
			System.out.println(e);
		}
		finally{
			userInput.close();
		}
		
			
	}
	

}

class NegativeAgeException extends Exception
{
   	private static final long serialVersionUID = 1L;
	String errorMessage;
 
    public NegativeAgeException(String errorMessage)
    {
        this.errorMessage = errorMessage;
    }
 
    //Modifying toString() method to display customized error message
 
    @Override
    public String toString()
    {
        return errorMessage;
    }
}
