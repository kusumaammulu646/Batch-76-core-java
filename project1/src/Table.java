
public class Table {
	
	int tableid;
	String status;
	int seats;
	String restaturant;
	
	void reservedtable() {
		System.out.println( "T101 is reserved");
		System.out.println( "T102 is reserved");
		
		
	}
	void cancel() {
		System.out.println( "T101 reservation is cancelled");
		System.out.println( "Table is available");
		
		
	}
	void display() {
		System.out.println("tableid:="+tableid);
		System.out.println(" status:="+ status);
		System.out.println("seats:="+seats);
		System.out.println(" restaturant:="+ restaturant);
		
	}

	public static void main(String[] args) {
		Table m=new Table();
		m .tableid=101;
		m. status="double";
		m.seats=203;
		m. restaturant="ammu";
		m. display();
		m.reservedtable();
		m.cancel();
		
		
		
		
		
		

	}

}
