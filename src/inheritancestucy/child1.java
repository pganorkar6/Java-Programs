package inheritancestucy;

public class child1 extends Mother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
child1 C=new child1();
C.home();
child1.money();

C.mobile();
laptop();
	}
public void mobile()
{
	System.out.println("This is mobile method from class child 1 non-static");
}
public static void laptop()
{
System.out.println("This is laptop method from class child 1 static");	
}
}

