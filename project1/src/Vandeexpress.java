
public class Vandeexpress {
	String passengername;
	int age;
	String source;
	String destination;
	int numberoftickets;
	
	
	
	 static int totalticketbought=0;
	static int totalammount=0;
	static int price=500;
	
	
	static {
	System.out.println("welcome to vande express thank you for choosing us");
	
	
	System.out.println("----------------------");
	}
	
	void bookticket() {
		totalticketbought=totalticketbought+numberoftickets;
		totalammount=totalammount+price;
		System.out.println("ticket booked susfully");
		
	}
	void displaybookingdetails() {
		System.out.println("passengername:="+passengername);
		System.out.println("age:="+age);
		System.out.println("source:="+source);
		System.out.println("destination:="+destination);
		System.out.println(" numberoftickets:="+ numberoftickets);
		System.out.println("totalticketbought:="+totalticketbought);
		System.out.println("totalammount:="+totalammount);
		System.out.println("price:="+price);
		
	}
	static void  ticketcounter() {
		System.out.println("totalticketbought:="+totalticketbought);
		System.out.println("totalamount:="+totalammount);
		
	}
	

	public static void main(String[] args) {
		Vandeexpress d=new Vandeexpress();
		d.passengername="ammu";
		d.age=21;
		d. source="hyd";
		d. destination="ben";
		d. numberoftickets=2;
		d. bookticket() ;
		d. displaybookingdetails() ;
		
		 Vandeexpress.ticketcounter();
		 
		 
		 
		 System.out.println("******************");
		
		
		Vandeexpress d1=new Vandeexpress();
		d1.passengername="kittu";
		d1.age=22;
		d1. source="hyd";
		d1. destination="ben";
		d1. numberoftickets=2;
		d1. bookticket() ;
		d1. displaybookingdetails() ;
		
		 Vandeexpress.ticketcounter();
			
		
		

	}

}
