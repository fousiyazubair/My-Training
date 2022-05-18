package overriding;

public class Parent {
	public int operation(int number1,int number2)
	{
		int sum;
		sum=number1+number2;
		return sum;
	}
	public void print()
	{
		System.out.println("parent");
	}
}
