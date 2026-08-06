//primitive data types
// note: the default values provided by the jvm is
//for byte short int long--->0
//for float & double--->0.0
// for char---(empty space)
//for boolean it is -->false
public class Datatypes {
	byte b;
	short s;
	int i;
	long l;
	
	
	float f;
	double d;
	char c;
	boolean boo;

	public static void main(String[] args) {
		System.out.println("main method started");
		 Datatypes b =new  Datatypes ();
		 System.out.println("byte value :="+ b.b);
		 System.out.println("short value:="+b.s);
		 System.out.println("int value:="+b.i);
		 System.out.println("long value:="+b.l);
		 System.out.println("float value:="+b.f);
		 System.out.println("double valu:="+b.d);
		 System.out.println("char values:="+b.c);
		 System.out.println("boolean  values:="+b.boo);
		 
		
		
		
	}

}
