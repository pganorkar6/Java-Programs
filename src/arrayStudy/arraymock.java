package arrayStudy;

public class arraymock {

	public static void main(String[] args) {
		int rollnum[][]= {{1,2,3},{1,2,3},{1,2,3}};
		for(int i=0;i<=rollnum.length-1;i++)
		{
			for(int j=0;j<=rollnum.length-1;j++)
			{
				System.out.print(rollnum[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
