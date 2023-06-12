package method;

public class Instancesum {
	int sum;
	public int add(int a,int b)
	{
		sum=a+b;
		return sum;
	}

	public static void main(String[] args) {
		Instancesum ob=new Instancesum();
		System.out.println(ob.add(5, 1));
		// TODO Auto-generated method stub

	}

}
