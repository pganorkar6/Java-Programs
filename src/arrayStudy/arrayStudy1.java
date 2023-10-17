package arrayStudy;

import java.util.Arrays;

public class arrayStudy1 {

	public static void main(String[] args) {
		int rollnum[]=new int[7];
		rollnum [0]=25;
		rollnum [1]=30;
		rollnum [2]=40;
		rollnum [3]=60;
		rollnum [4]=50;
		rollnum [5]=80;
		rollnum [6]=70;
		
		System.out.println(rollnum[6]);
		System.out.println(rollnum[3]);
		
		System.out.println("================================================================================= ======");
		
		String stuname[]=new String[5];
		stuname[0]="Nilesh";
		stuname[1]="Priyanka";
		stuname[2]="Rajshree";
		stuname[3]="Swati";
		stuname[4]="Pratik";
		
		System.out.println(stuname[0]);
		System.out.println(stuname[1]);
		System.out.println(stuname[2]);
		System.out.println(stuname[3]);
		System.out.println(stuname[4]);
		
		System.out.println("====================================================================================================");
		
		char division[]=new char[5];
		division[0]='D';
		division[1]='B';
		division[2]='E';
		division[3]='A';
		division[4]='C';
	Arrays.sort(division);
		
		for(int i=0;i<=4;i++)
		{
			System.out.println(division[i]);
		}
		
		System.out.println("==========================================================================================================");
		
		for(int i=4;i>=0;i--)
		{
			System.out.println(division[i]);
		}
		
		
				

	}

}
