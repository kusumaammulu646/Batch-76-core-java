package logicalstatements;


public class Numbers {
	static void numbers(int n) {
		if(n >100) {
	return;
	
	}
	System.out.println(n);
	n++;
	numbers(n);
}

public static  void main(String [] args) {
	numbers(1);
	
}

}

	

	
