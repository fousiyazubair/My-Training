package salary;

public class CalculateHra extends GetSalary
{
	double hra;
	double pf;
public void hracalculate()
{
	 hra=5*basicpay/100;
}
public void pfcalculate()
{
	 pf=20*basicpay/100;
}
}
