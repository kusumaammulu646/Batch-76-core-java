
public class Couriertask {
	String customername;
	int courierld;
	String source;
	String destination;
	int weight;
	int deliveryamount;
	
	static int totalcouriers=0;
	static int totalweight=0;
	static int  totalamountcollected=0;
	static int priceperkg=100;
	
	static {
		System.out.println("welcome to quickship courier");
		System.out.println("-------------------------------");
	}
	
	void bookcourier() {
		deliveryamount=weight*priceperkg;
		totalcouriers=totalweight+=weight;
		totalamountcollected+=deliveryamount;
		
		
	}
	void displaycourierdetails() {
		System.out.println("customername:="+customername);
		System.out.println("courierld:="+courierld);
		System.out.println("source:="+source);
		System.out.println("destination:="+destination);
		System.out.println("weight:="+weight);
		System.out.println("deliveryamount:="+deliveryamount);
		System.out.println(" totalcouriers:="+ totalcouriers);
		System.out.println("totalweight:="+totalweight);
		System.out.println("totalamountcollected:="+totalamountcollected);
		System.out.println(" priceperkg:="+ priceperkg);
		
	}
	static void displaytodayscollection() {
		System.out.println("totalcouriersbooked:="+totalcouriers); 
		System.out.println("totalweight:="+totalweight);
		System.out.println("totalamountcollected:="+totalamountcollected);
		
	}
	
	
	
	

	public static void main(String[] args) {
		Couriertask v=new Couriertask();
		v.customername="ammulu";
		v.courierld=101;
		v.source="hyd";
		v.destination="kbhp";
		v.weight=3;
		
		 v.bookcourier();
		v. displaycourierdetails() ;
		v. displaytodayscollection();
		
		System.out.println("*********************************************");
		
		Couriertask v1=new Couriertask();
		v1.customername="kusuma";
		v1.courierld=102;
		v1.source="hyd";
		v1.destination="kbhp";
		v1.weight=3;
		
		 v1.bookcourier();
		v1. displaycourierdetails() ;
		v1. displaytodayscollection();
		
		
		

	}

}
