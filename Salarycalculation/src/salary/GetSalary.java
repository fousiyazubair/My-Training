package salary;
import java.util.*;
public class GetSalary
{
	 double basicpay;
		double bonus;
		double deduction;
		
public void getSalary()
{
	   System.out.println("Enter the basic pay of the employee");
		Scanner sc=new Scanner(System.in);
	basicpay = sc.nextFloat();
	System.out.println("Enter the bonus ");
	bonus=sc.nextFloat();
	System.out.println("Enter deduction");
	deduction=sc.nextFloat();
	}
}

