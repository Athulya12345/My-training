package superkeyword;

public class A2 extends A1{
	void display()
	{
		System.out.println("print");
	}
	void show()
	{
		System.out.println("show");
	}
	void Print()
	{
		super.display();
		show();
		display();
	}
}
