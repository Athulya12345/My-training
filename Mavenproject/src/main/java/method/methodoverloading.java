package method;

public class methodoverloading {
	//static double circle;
		//int square;
		static double add(double r)
		{
			double circle=3.14*r;
			return circle;
		}
		public   int add(int a)
		{
			int square=a*a;
			return square;
		}
		

		public static void main(String[] args) {
			System.out.println(add(3.6));
			methodoverloading ob=new methodoverloading();
			System.out.println(ob.add(7));
			
			// TODO Auto-generated method stub

		}

}
