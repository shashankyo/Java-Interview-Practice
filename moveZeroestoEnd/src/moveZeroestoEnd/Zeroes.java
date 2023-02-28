package moveZeroestoEnd;

public class Zeroes {
public static void main(String[] args) {
int arr [] = {10,0,23,6,0,8,1,2,3,4,0};
int[] newArray = new int[arr.length];
rearrange(arr,newArray);
print(newArray);
}
private static void print(int[] newArray)
{
	System.out.println("Elements after adding zeores ");
	for(int i: newArray)
	{
		System.out.println(i);
	}
}

private static void rearrange(int[] arr, int[] newArray)
{
	int j = 0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]!= 0)
		{
			
		newArray[j] = arr[i];
		j++;
	}
}
for(int i=0;i<arr.length;i++)
{
	if(arr[i] == 0)
	{
		newArray[j] = arr[i];
		j++;
	}
}}}
