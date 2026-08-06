
public class Empsalarytask {
	String employeename;
	int monthlysalary;
	int  monthlygst;
	int monthlypf;
	int netmonthlysalary;
	
	
	int annualgst;
	int annualpf;
	int annualnetsalary;
	
	void calculatemonthlypf() {
		monthlypf=monthlysalary*2/100;

		
	}
	void calculatemonthlygst() {
		monthlygst=monthlysalary*3/100;
		
	}
	void calculatenetmonthlysalary() {
		netmonthlysalary= monthlysalary-monthlygst-monthlypf;
		
		
	}
	void calculateannulgst() {
		annualgst= monthlygst*12;
		
	}
	void calculateannualpf() {
		annualpf=monthlypf*12;
		
	}
	void calculateannualnetsalary() {
		annualnetsalary= netmonthlysalary*12;
		
	}
	void displayemployeedetails() {
		System.out.println("employeename:="+employeename);
		System.out.println("monthlysalary:="+monthlysalary);
		System.out.println("monthlygst:="+monthlygst);
		System.out.println("monthlypf:="+monthlypf);
		System.out.println("netmonthlysalary:="+netmonthlysalary);
		System.out.println("annualgst:="+annualgst);
		System.out.println("annualpf:="+annualpf);
		System.out.println(" annualnetsalary:="+ annualnetsalary);
		
		
		
	}
	

	public static void main(String[] args) {
		Empsalarytask z =new Empsalarytask ();
		z.employeename="james";
		z. monthlysalary=5000;
		z. calculatemonthlypf() ;
		z.calculatemonthlygst() ;
		z.calculatenetmonthlysalary();
		z.calculateannulgst();
		z. calculateannualpf();
		z.calculateannualnetsalary();
		z. displayemployeedetails();
		
		
	}

}
