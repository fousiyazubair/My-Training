package salary;

public class CalculateTotalSalary extends CalculateHra
{
	double totalsalary;
	public void totalsalarycal()
	{
 totalsalary=(basicpay+bonus+hra-pf-deduction);
	}
	public void displaysalaryslip()
	{
		System.out.println("basic pay " +basicpay);
		System.out.println("deduction " +deduction);
		System.out.println("hra " +hra);
		System.out.println("pf " +pf);
		System.out.println("bonus " +bonus);
		System.out.println("Total Salary by hand " +totalsalary);
	}
	public static void main(String args[])
	{
		CalculateTotalSalary obj=new CalculateTotalSalary();
		obj.getSalary();
		obj.hracalculate();
		obj.pfcalculate();
		obj.totalsalarycal();
		obj.displaysalaryslip();
	}

}
	

