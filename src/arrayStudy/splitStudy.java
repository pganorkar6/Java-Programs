package arrayStudy;

public class splitStudy {

	public static void main(String[] args) {
		int rollnum[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(rollnum[i][j]+" ");
			}
			System.out.println();
		}
		
		String q="I LOVE MY INDIA AND I AM PROUD OF IT";
		String[] q1=q.split(" ");
		for(int i=0;i<=9;i++)
		{
		System.out.println(q1[i]);
		
		}
		
		
		
		
		
	}
}
