package logicalstatementsarrays;

public class Maxx {

	public static void main(String[] args) {
		int arr[]= {36,45,78,66,99};
		for(int i=1;i<arr.length;i++)
		{
			int n=arr[i];
			int result=((n/10)+1)*10;
			System.out.println(result+" ");
		}
	}

}
