package examples1;

public class Employee {
	
	String employeename;
	int employeeid;
	String designation;
	String department;
	int salary;
	String remotelocation;
	
	
	static String companyname="suntechsolutions";
	static String companylocation="hi-techcity";
	
	
	static {
		System.out.println("welcome to suntech solutions!employee Hrms portal");
		System.out.println("-----------------------------------------------------------------");
	}
	
	
	
	void displayemployeedetails() {
		System.out.println("employeename:="+employeename);
		System.out.println("employeeid:="+employeeid);
		System.out.println("designation:="+designation);
		System.out.println("department:="+department);
		System.out.println("salary:="+salary);
		System.out.println("remotelocation="+remotelocation);
		
		
	}
	void promoteemployee() {
		employeename="kusuma";
		
	}
	void updatesalary() {
		salary=salary+50000;
		
		
	}
	void updateemployeelocation() {
		companylocation="hyd";
		
		
	}

	public static void main(String[] args) {
		 Employee a=new  Employee ();
		 a.employeename="kusumaammulu";
		 a.employeeid=2231;
		 a.designation="job";
		a. department="softare";
		 a.salary=45000;
		a. remotelocation="kbhp";
		System.out.println("before updating");
		System.out.println("----------------------------------------------------------");
		a.displayemployeedetails();
		a. promoteemployee();
		a. updatesalary();
		a. updateemployeelocation();
		System.out.println("**********************************************************");
		System.out.println("after updating");
		System.out.println("--------------------------------------------------------------");
		
		a.displayemployeedetails();
		
		
		

	}

}
