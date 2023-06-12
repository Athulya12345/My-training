package superkeyword;
import java.util.Scanner;
public class Season1 extends Season {

	void season(int amount)
	{
		float discount=amount*0.23f;
		System.out.println(discount);
		
	}
	void display()
	{
		super.onseason(70);
		
	}
public static void main(String args[])
{
  Season1 ob=new Season1();
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the sason");
  String input=sc.nextLine();
  if(input.equals("onseason"))
	  
  {
	  
	  ob.display();
  }
  else
  {
	 ob.season(30);
	  
  }
 
  
  
	}
}
