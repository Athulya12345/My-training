package constractor;

public class Parametrised {
	Parametrised()
	{
		this(40);
		System.out.println("default constractor");
	}
	Parametrised(int a)
	{
		System.out.println(a);
		
	}
	
	

	public static void main(String[] args) {
		Parametrised ob=new Parametrised();
		// TODO Auto-generated method stub

	}

}
