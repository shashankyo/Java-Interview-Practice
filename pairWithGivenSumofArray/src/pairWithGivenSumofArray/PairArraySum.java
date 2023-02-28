package pairWithGivenSumofArray;

public class PairArraySum {
public static void main(String[] args) {
	int arr[] = {10,20,30,40,50};
	int sum = 50;
	for(int i=0;i<arr.length;i++)
	{
		for( int j=i+1;j<arr.length;j++)
		{
			if(arr[j] == sum - arr[i])
			{
				System.out.println(arr[i]+","+arr[j]);
			}
		}
	}
}
}
