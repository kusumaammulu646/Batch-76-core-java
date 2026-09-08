package examples1;

public class Task11 {
	
    int tableId;
    int seats;
    String reserved;
    
    
    
    static String restaurantname="ammulu";
    
    void reservetable(){
    	System.out.println("T101 is reserved");
    	System.out.println("T102 is reserved");
    	
    	
    }
    void cancelreservation() {
    	System.out.println( "T101 reservation is cancelled");
    	System.out.println( "Table is available");
    	
    }
    void displaytabledetails(){
    	System.out.println("tableId:="+tableId);
    	System.out.println(" seats:="+ seats);
    	System.out.println("reserved:="+reserved);
    	
    }
    static void changerestaurantname() {
    	restaurantname="kittu";
    	
    	
    	
   
    	
    }
    	
    static void displayrestaurantname() {
    	System.out.println("restaurantname:="+restaurantname);
    	
    	
    }

	public static void main(String[] args) {
		Task11 b=new Task11();
		b.tableId=203;
	    b. seats=505;
	    b.reserved="false";
	    b.reservetable();
	    b.cancelreservation();
	    b.displaytabledetails();
	    b.changerestaurantname();
	    b.displayrestaurantname();
	    
	    Task11 n=new Task11();
	    
	    n.tableId=203;
	    n. seats=505;
	    n.reserved="true";
    	 n.reservetable();
	    n.cancelreservation();
	    n.displaytabledetails();
	    n.changerestaurantname();
	    n.displayrestaurantname();
	    
		

	}

}
