package bubbleSoring;

import java.util.Scanner;

public class BubbleSort {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter array size");
	int n = scan.nextInt();
	System.out.println("Enter array elements to be sorted");

	int intArray[] = new int[n];
	for(int i=0;i<intArray.length;i++)
	{
		intArray[i] =  scan.nextInt();
	}

	System.out.println("Before Sorting");
	for(int i:intArray)
	{
		System.out.println(i);
	}
	bubbleSort(intArray);
	System.out.println("After Sorting");
	for(int i : intArray)
	{
		System.out.println(i);
	}
}
private static void bubbleSort(int[] intArray)
{
	int temp = 0;
	for(int i=0;i<intArray.length;i++)
	{
		for(int j=1;j<(intArray.length)-i;j++)
		{
			if(intArray[j-1] > intArray[j])
			{
				temp = intArray[j-1];
				intArray[j-1] = intArray[j];
				intArray[j] = temp;
			}
		}
	}
}
}
