package examples1;

public class Bugtracker {
	int bugid;
	String applicationname;
	String bugtitle;
	String severity;
	String priority;
	String status;
	String assigneddeveloper;
	
	
	
	int getbugid() {
		return bugid;
		
	}
	String getapplicationname() {
		return applicationname;
		
		
	}
	String getbugtitle() {
		return bugtitle;
		
	}
	String getseverity() {
		return severity;
		
	}
	String getpriority() {
		return priority;
		
	}
	String getstatus() {
		return status;
		
	}
	String getassigneddeveloper() {
		return assigneddeveloper;
		
	}
	void assigntodeveloper(int  bugid,String developername ) {
		if(this.bugid==bugid) {
			this.assigneddeveloper=developername;
			this.updatestatus("in development");
		}
			
		}
	
	void updatestatus(String newstatus) {
		this.status=newstatus;
		
	}
	void  displaybugsummary() {
		System.out.println("bugid:="+bugid);
		System.out.println("applicationname:="+applicationname);
		System.out.println("bugtitle:="+bugtitle);
		System.out.println("severity:="+severity);
		System.out.println(" priority:="+ priority);
		System.out.println("status:="+status);
		System.out.println("assigneddeveloper:="+assigneddeveloper);
		
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		Bugtracker b=new Bugtracker();
		b.bugid=101;
		b.applicationname="bankingapplication";
		b.bugtitle="login button not working";
		b.severity="high";
		b.priority="high";
		b. status="open";
		b. assigneddeveloper="not assigned";
		b.assigntodeveloper(101,"kusuma");
		b.displaybugsummary();
		
		
	}

}
