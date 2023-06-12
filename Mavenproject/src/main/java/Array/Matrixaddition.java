package Array;

public class Matrixaddition {
	public static void main(String[] args) {
		int sum[][]=new int[2][2];
		int a[][]= {{10,20},{25,15}};
		int b[][]= {{9,5},{11,12}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
				System.out.print(sum[i][j]+"  ");
				
			}
			System.out.println();		}
		// TODO Auto-generated method stub

	}

}
