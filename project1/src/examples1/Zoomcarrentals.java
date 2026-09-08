package examples1;

public class Zoomcarrentals {
	static String companyname() {
		return "Zoomcarrentals";
	}
	static int dailyrate() {
		return 1500;
		
	}
	static int basecost(int days) {
		return dailyrate()*days;
	}
	static int insurance() {
		return 500;
	}
	 static int totalcost(int days) {
		return basecost(days)+ insurance();
	}
	static String welcomemessage(){
		return "welcome to Zoomcarrentals";
		
	}
	
		
	


	public static void main(String[] args) {
		int days=3;
		String companyname=companyname();
		int dailyrate=dailyrate();
		int basecost= basecost(days);
		int insurance=insurance();
		int totalcost=totalcost(days);
		 String welcomemessage= welcomemessage();
		
		
		System.out.println("companyname:="+companyname);
		System.out.println("dailyrate:="+dailyrate);
		System.out.println("basecost:="+basecost);
		System.out.println ("insurance:="+insurance);
		System.out.println("totalcost:="+totalcost);
		System.out.println("welcomemessage:="+welcomemessage());
		
	
		
			
		
		
		

	}

}
