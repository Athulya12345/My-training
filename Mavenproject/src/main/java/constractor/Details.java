package constractor;

public class Details {
	String name;
	String address;
	int salary;
Details(String a, String b,int c)
{
	 name=a;
    address=b;
	 salary =c;
	
}
void display()
{
	 System.out.println(name);
	 System.out.println(address);
	 System.out.println(salary);
}
	public static void main(String[] args) {
		Details ob=new Details("richu","sreesylam",5000);
		ob.display();
		Details ob1=new Details("visu","ohmkaram",9000);
		ob1.display();
		
		// TODO Auto-generated method stub

	}
}
