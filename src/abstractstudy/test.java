package abstractstudy;

public class test extends Abstract{

	public static void main(String[] args) {
		test T=new test ();
		T.display1();
		T.dispay2();
		test.display3();

	}

	@Override
	public void dispay2() 
	{
	System.out.println("Display2 method from abstract class completed here");	
	}

}
