package nonNegativeElementtoStartoftheArray;

public class NegativeElement {
public static void main(String[] args) {
	int arr[] = {-1,-20,30,40,50,-8};
	int newArray[] = new int[arr.length];
	rearrange(arr,newArray);
	print(newArray);
}
	private static void print(int[] newArray)
	{
		for(int i: newArray)
		{
			System.out.println(i);
		}
	}
	private static void rearrange(int []arr, int []newArray)
	{
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				newArray[j]= arr[i];
				j++;
			}
			
		}
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>0)
		{
			newArray[j] = arr[i];
			j++;
		}
	}
	print(newArray);
}
}
