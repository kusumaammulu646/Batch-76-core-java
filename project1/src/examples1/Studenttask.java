package examples1;

public class Studenttask {
	int studentid;
	String gender;
	String branchname;
	String collegename;
	
	
	void studentdetails() {
		System.out.println(" studentid;:="+ studentid);
		System.out.println("gender:="+gender);
		System.out.println("branchname:="+branchname);
		System.out.println("collegename:="+collegename);
	}
	
	
	public static void main(String[] args) {
		Studenttask b=new Studenttask();
		b.studentid=101;
		b.gender="male";
		b.branchname="cse";
		b.collegename="vignan";
		b.studentdetails() ;
		
		
		System.out.println("***************");
		
		
		
		Studenttask b1=new Studenttask();
		b1.studentid=102;
		b1.gender="female";
		b1.branchname="eee";
		b1.collegename="vignan";
		b1.studentdetails() ;
		
		
		
		

	}

}
