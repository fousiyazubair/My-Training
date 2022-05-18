package additionsuper;
import java.util.*;

public class Addition 
{
	
	public int add() {
		int number1,number2,sum;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number");
		number1=sc.nextInt();
		System.out.println("Enter the second number");
		number2=sc.nextInt();
		sum=number1+number2;
		return sum;
	}

}


