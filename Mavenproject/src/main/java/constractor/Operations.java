package constractor;

public class Operations {
	
		int sum=0;
		float sum1=0;
		double sum2=0;
		
		Operations(int a,int b)
		{
			sum=a+b;
			System.out.println(sum);
		}
		Operations(float c,float d,float e)
		{
			float sum1=c+d+e;
			System.out.println(sum1);
			
		}
		Operations(double f,double g,double h,double i)
		{
		double sum2=f+g+h+i;
			System.out.println(sum2);
			
		}
		
		
		
		

		public static void main(String[] args) {
			Operations ob= new Operations(10,10);
			Operations ob1= new Operations(1.1,1,2.1,4.3);
			Operations ob2= new Operations(100.56,130.56,345.45,234.67);
			//ob.Operations();
			//ob1.Operations();
			//ob2.Operations();
			
			
			
			
			
			// TODO Auto-generated method stub

		}
}
