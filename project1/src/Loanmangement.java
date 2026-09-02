
public class Loanmangement {
	
	String customername;
	int loanamount;
	int intrestrate;
	int loantenure;
	int interest;
	
	
	
	
	double  calculateintrest(double loanamount,double intrestrate) {
		
		double interest =(loanamount*intrestrate*loantenure)/100;
	
		return interest;
		
	}
	double calculatetotalamount(double intrestrate) {
		double totalamount= loanamount+interest;
		return totalamount;
		
	}
	double calculatemonthlyEmi ( double totalamount,double loantenure  ) {
		double emi=totalamount/(loantenure*12);
		return emi;
		
		
	}
	void displayloansummary(double intrestrate,double emi,double totalamount ) {
		System.out.println("customername:="+customername);
		System.out.println("loanamount:="+loanamount);
		System.out.println("intrestrate:="+intrestrate);
		System.out.println("loantenure:="+loantenure);
		System.out.println("interest:="+interest);
		System.out.println("totalamount:="+ totalamount);
		System.out.println("intrestrate:="+ intrestrate);
		System.out.println("emi:="+ emi);
		
		
		
	}

	public static void main(String[] args) {
		Loanmangement b=new Loanmangement();
		b.customername="kusuma";
		b.loanamount=2300;
		b.intrestrate=8;
		b.loantenure=2;
		 double interest =b. calculateintrest(b. loanamount,b.intrestrate);
		double totalamount=b. calculatetotalamount(b. intrestrate);
		double emi=b.calculatemonthlyEmi ( totalamount ,b.loantenure  );
		b.displayloansummary(interest, emi, totalamount);
		
		
		
		
		
		

	}

}
