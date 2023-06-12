package Array;

public class Summultarray {
	public static void main(String[] args) {
		//int a[][]=new int[3][3];
		//int i;
//		int j;
		int sum[][]=new int [2][2];
		
		int a[][]= {{19,12},{99,67}};
		int b[][]= {{7,8},{2,3}};

		
			 for(int i=0;i<a.length;i++)
				{
					for(int j=0;j<a.length;j++)
					{
						 sum[i][j]=a[i][j]-b[i][j];
						System.out.print(sum[i][j]+"  ");
	 
					} 
					 System.out.println();
					
				}
			
	}
			// TODO Auto-generated method stub
}
