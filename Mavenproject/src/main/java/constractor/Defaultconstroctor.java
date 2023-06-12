package constractor;

public class Defaultconstroctor {
	Defaultconstroctor()
	{
		System.out.println("default constractor");
		
	}
	Defaultconstroctor(int a)
	{
		this();
		System.out.println(a);
	}
	

	public static void main(String[] args) {
		Defaultconstroctor ob=new Defaultconstroctor(40);
		// TODO Auto-generated method stub

	}
}
