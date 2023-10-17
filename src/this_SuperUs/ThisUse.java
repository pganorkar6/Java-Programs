package this_SuperUs;

public class ThisUse {
 int a=50;
 int b=100;
 double c=150.60d;
 float d=200.60f;
 
	public static void main(String[] args) {
ThisUse t1=new ThisUse();
t1.this1();
	}
public void this1()
{
	int q=40;
int sum1=this.a+q;
System.out.println("Additio of a&q is "+sum1);
float sum2=this.d+q+this.b+this.d;
System.out.println("The addition of d,q,b,d is "+sum2);
}
}
