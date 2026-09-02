
public class Shoppingcart {
	 static String storename="lucky electrical";
	String customername;
	String productname;
	double price;
	int quantity;
	double finalamount;
	int discount;
	
	
	
	
	void addproduct(String pname,double pr,int qty) {
		productname=pname;
		price=pr;
		quantity=qty;
		System.out.println("product added successfully");
		System.out.println("-------------------------------------------------");
		
		
	}
	void calculatetotal(double discount) {
		double total=price*quantity;
		finalamount=total-(total*discount/100);
		
		
		
				
		
		
	}
	void displaycart() {
		System.out.println("storename;:="+storename);
		System.out.println("customername:="+customername);
		System.out.println("productname:="+productname);
		System.out.println(" price:="+ price);
		System.out.println(" quantity:="+ quantity);
		System.out.println("finalamount:="+finalamount);
		
		
		
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		Shoppingcart  v=new Shoppingcart ();
		v.customername="kusuma";
		v.productname="watch";
	
		
		
		v.addproduct("watch",500,5);
		v.calculatetotal(10);
		v.displaycart() ;
		System.out.println("***********************************************");
		
		
		Shoppingcart  v1=new Shoppingcart ();
		v1.customername="ammulu";
		v1.productname="laptop";
		
		v1.addproduct("laptop",5000,5);
		v1.calculatetotal(10);
		v1.displaycart() ;
		
		
		
		
	}

}
