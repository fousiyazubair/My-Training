package overriding;

public class Child extends Parent {
	public int operation(int n1,int n2)
	{
		int s=super.operation(10,20);
		System.out.println("sum of two numbers is " +s);
		int result;
		result=n2-n1;
		return result;
	}
	public void print()
	{
		System.out.println("Child");
	
	}
	public static void main(String args[])
	{
	/*Child obj=new Child();
	int d=obj.operation(50,100);
	System.out.println("differesnce of two numbers is " +d);
	obj.print();
	Parent obj1=new Parent();
	obj1.print();*/
		Parent obj=new Child();
		obj.print();
		int res=obj.operation(10, 20);
		System.out.print("Difference is " +res);
		

}
}
