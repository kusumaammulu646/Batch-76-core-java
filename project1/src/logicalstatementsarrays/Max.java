package logicalstatementsarrays;

public class Max {

	public static void main(String[] args) {
		int arr[]= {36,45,78,66,99};
		int max=arr[0];
		int secondmax=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max)
			{
				secondmax=max;
				max=arr[i];
			}
			else if(arr[i]>secondmax&&arr[i]!=max)
			{
				secondmax=arr[i];
			}
		}
		System.out.println("second maximum:="+secondmax);
		
	}

}
