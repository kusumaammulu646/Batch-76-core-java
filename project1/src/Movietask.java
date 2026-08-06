
public class Movietask {
	String moviename;
	int stores;
	int seatnumber;
	String theatrename;
	int booked;
	
	
	void bookTicket(){
		System.out.println("the hello ticket movie  is booking");
		
	}
	void cancelTicket() {
		System.out.println("the Araya movie ticket is cancel");
		
	}
	void displayTicketdetails() {
		System.out.println("moviename:="+moviename);
		System.out.println("stores:="+stores);
		System.out.println(" seatnumber:="+ seatnumber);
		System.out.println(" theatrename:="+ theatrename);
		System.out.println(" booked:="+ booked);
		
		
	}
	void changetheatrename() {
		 theatrename="mythre";
		
	}
	void displaytheatrename() {
		System.out.println("theatrename:="+theatrename);
		
	}
	
	
	

	public static void main(String[] args) {
		Movietask n=new Movietask();
		n. moviename="love";
		n.stores=345;
		n. seatnumber=4;
		n.theatrename="vamsi";
		n.booked=78;
		n.bookTicket();
		n.cancelTicket();
		n. displayTicketdetails() ;
		n.changetheatrename();
		n.displaytheatrename();
		
		
		
		

	}

}
