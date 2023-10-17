package stringstudy;

public class StringMethod {

	public static void main(String[] args) {
		
String s1="Pune";
String s2="Pune";
String s3= new String("Pune");
String s4= new String("Pune");
//== equals 

System.out.println(s1==s2);
System.out.println(s3==s4);
System.out.println(s2==s3);
System.out.println(s1==s4);

//length method

String s="Velocity";
s.length();
System.out.println(s.length());

String j="Japan ";
System.out.println(j.endsWith("n"));

String y="Yellow";
System.out.println(y.startsWith("P"));

System.out.println(j.concat(y)+" ");
	}

	
    
    
	}
	
