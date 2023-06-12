package constractor;

public class Student {
	int id;
	String name;
	int mark1;
	int mark2;
	int mark3;
	int mark4;
	int mark5;
	int total=0;
	Student(int a,String b,int c,int d,int e,int f,int g)
	{
		id=a;
		name=b;
		mark1=c;
		mark2=d;
		mark3=e;
		mark4=f;
		mark1=g;
		
		
	}
	void display()
	{
		System.out.println("id is"+id);
		System.out.println("name is"+name);
		System.out.println("mark1 is"+mark1);
		System.out.println("mark2 is"+mark2);
		System.out.println("mark3 is"+mark3);
		System.out.println("mark4 is"+mark4);
		System.out.println("mark5 is"+mark5);
		
		
		
	}
	int total()
	{
		total=mark1+mark2+mark3+mark4+mark5;
		System.out.println(total);

		return total;
	}
	void grade()
	{
		if(total<30)
		{
			System.out.println("failed");
			
			
		}
		else if(total>40&&total<70)
		{
			System.out.println("c");
		}
		else if(total>71&&total<=140)
		{
			System.out.println("a");
			
			
		}
		
		else
		{
			System.out.println("invalid");
		}
	}

	public static void main(String[] args) {
		Student ob=new Student(1,"hridhu",2,45,4,2,1);
		ob.display();
		ob.total();
		ob.grade();
		// TODO Auto-generated method stub

	}

}
