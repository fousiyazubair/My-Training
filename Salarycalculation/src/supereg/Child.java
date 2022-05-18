package supereg;

public class Child extends Parent {
	int a;

	public Child(int number) 
		{
		super(10);
		super.a=number;
	System.out.println("no arguments");
		}
	public void display()
	{
		super.print();
		System.out.println("Hai parent");
		System.out.println(" " +num);
		System.out.println(super.a);
	}

	public static void main(String[] args) {
Child obj=new Child(20);
obj.display();


	}
}
