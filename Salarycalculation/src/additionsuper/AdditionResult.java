package additionsuper;

public class AdditionResult extends Addition {
	
	public void display()
		{
		int result;
		System.out.println(result=super.add());
		if(result%10==0) {
			System.out.print("Divisible by 10");
		}
		else
		{
			System.out.print("Not divisible by 10");
		}
		
	}
public static void main(String args[])
{
	AdditionResult obj = new AdditionResult();
	obj.display();
	}
}
