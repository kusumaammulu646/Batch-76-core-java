
public class Libarytask {
	
	int bookId;
	String booktitle;
	String authorname;
	 static int availblecopies=10;
	 String issuebook;
	 
	
	
	
	static String libraryname="abc";
	static String librarianname="bcd";
	
	
	
	
	void displaybookdetails() {
		System.out.println("bookId:="+bookId);
		System.out.println("booktitle:="+booktitle);
		System.out.println("authorname:="+authorname);
		
	
	
		
		availblecopies=availblecopies-1;
		
		
		 
		
		
	}
	static void displaylibrarydetails() {
		System.out.println("libraryname:="+libraryname);
		System.out.println(" librarianname:="+ librarianname);
		
		
	}
	
	void bookissuebook() {
		System.out.println("updatedvalues:="+availblecopies);
	}

	public static void main(String[] args) {
		Libarytask m1=new Libarytask();
		m1. bookId=101;
		m1. booktitle="guram";
		m1. authorname="kick";
		m1.bookissuebook();
		m1. displaybookdetails();
		m1.libraryname="tryui";
		m1.displaylibrarydetails();
		
		
		
		Libarytask m2=new Libarytask();
		m2. bookId=102;
		m2. booktitle="karam";
		m2. authorname="kicks";
		m2.bookissuebook();
		m2. displaybookdetails();
		m2.displaylibrarydetails();
		
		
		
		
		
		
		

	}

}
