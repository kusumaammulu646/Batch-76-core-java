package com.corejava;

public class Task10 {
	int studentId;
      String studentName;
	int englishmarks;
	int telugumarks;
	int hindimarks;
	int totalmarks;
	double percentage;
	
	
	static String collegename="abc";
	
Task10(int Id,String  Name, int eng,int tel,int hin){
		
		studentId= Id;
		studentName=Name;
		englishmarks=eng;
		telugumarks=tel;
		hindimarks=hin;
		
	}
		
	
	
	
	
	
	void calculatetotal() {
		totalmarks=englishmarks+telugumarks+hindimarks;
		
	}
	void calculatepercentage() {
		percentage= totalmarks ;
		
	}
	void displaystudent() {
		
		System.out.println("collegename:="+collegename);
		System.out.println("studentId:="+studentId);
		System.out.println("studentName:="+studentName);
		System.out.println("englishmarks:="+englishmarks);
		System.out.println("telugumarks:="+telugumarks);
		System.out.println("hindimarks:="+hindimarks);
		System.out.println("totalmarks:="+totalmarks);
		System.out.println("percentage:="+percentage);
		System.out.println("*****************************");
		
		
	}
	
	

	public static void main(String[] args) {
		Task10 h1=new Task10(101,"kusuma",44,55,66);
		Task10 h2=new Task10(102,"ammulu",78,82,80);
		
		
		h1.calculatetotal();
		h1.calculatepercentage();
		h1.displaystudent();
		
		
		h2.calculatetotal();
		h2.calculatepercentage();
		h2.displaystudent();
		
		
		
		
		

	}

}
