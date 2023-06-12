package constractor;

public class Div {
	int c;
	Div( int a,int b)
	{
		this();
		int c=a/b;
		System.out.println(c);
		
	}
	Div()
	{
		System.out.println("defaultconstractor");
	}

	public static void main(String[] args) {
		Div ob=new Div(20,5);
		// TODO Auto-generated method stub

	}

}
