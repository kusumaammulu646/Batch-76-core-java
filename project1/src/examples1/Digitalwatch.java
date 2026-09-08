package examples1;

public class Digitalwatch {
	String brandname;
	String watchtype;
	int hours;
	int minutes;
	int seconds;
	int price;
	
	
	void displaytime() {
		System.out.println(hours + ":" + minutes + ":" + seconds);
		
		
	}
	void displayatchdetails(){
		System.out.println("brandname:="+brandname);
		System.out.println("watchtype:="+watchtype);
		System.out.println("hours:="+hours);
		System.out.println(" minutes:="+ minutes);
		System.out.println("seconds:="+seconds);
		System.out.println("price:="+price);
		
	}
	void updatehour() {
		  hours =hours+1;
		
		
		
	}
	void  updateminutes(){
		minutes=minutes+5;
		
		
	}

	public static void main(String[] args) {
		 Digitalwatch c=new  Digitalwatch();
		c. brandname="apple";
		c. watchtype="smart";
		c. hours=3;
		c. minutes=10;
		c. seconds=5;
		c. price=20000;
		System.out.println("before updating");
		c.displaytime();
		 c.displayatchdetails();
		c. updatehour();
		c.updateminutes();
		System.out.println("after updating");
		c.displaytime();
		
		 
		 
		
		
		
		
		

	}

}
