package arrayStudy;

public class ArrayStudy3 {

	public static void main(String[] args) {
		int rollnum[][]=new int[2][2];
		rollnum[0][0]=25;
		rollnum[0][1]=25;
		rollnum[1][0]=25;
		rollnum[1][1]=25;
		
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
				System.out.print(rollnum[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println("======================================");
		
		String playersname[][]=new String[2][2];
		playersname[0][0]="ST";
		playersname[0][1]="MS";
		playersname[1][0]="SG";
		playersname[1][1]="SR";
		
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
				System.out.print(playersname[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
