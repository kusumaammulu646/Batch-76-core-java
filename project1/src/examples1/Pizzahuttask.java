package examples1;

public class Pizzahuttask {
	String pizza;
	String cooldrink;
	int totalamount;
	String orderplaced;
	
	
	 static String websitename="zomoto";
	 
	 void additem() {
		 System.out.println("pizza:="+pizza);
		 System.out.println("cooldrink:="+cooldrink);
		 System.out.println("totalamount:="+totalamount);
		 System.out.println("orderplaced:="+orderplaced);
		 
	 }
	 void placeorder() {
		 System.out.println("order is placed");
		 
	 }
	 static void changewebisite() {
		 websitename="swiggy";
		 
	 
		
	 
	 }
	 static void displaywebsite() {
		 System.out.println(" websitename:="+ websitename);
		 
		 
	 
		 
	 }
	 
	
	
	

	public static void main(String[] args) {
		Pizzahuttask  s=new Pizzahuttask ();
		s.pizza="vegpizza";
		s.cooldrink="thumpsup";
		s.totalamount=320;
		s.orderplaced="yes";
		s.additem() ;
		s.placeorder();
		s.changewebisite();
		s.displaywebsite();
		
		
		System.out.println(" *********************");
		
		
		Pizzahuttask  s1=new Pizzahuttask ();
		s1.pizza="chickenpizza";
		s1.cooldrink="sprit";
		s1.totalamount=400;
		s1.orderplaced="yesss";
		s1.additem() ;
		s1.placeorder();
		s1.displaywebsite();
		s1.changewebisite();
		
		
		
		

	}

}
