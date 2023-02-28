package largestAndSmallestNumber;

import java.util.Scanner;

public class LargestSmallestNumberDemo {
	public static void main(String[] args)
	{
//	int[] intArray = new int[] {1,100,20,30,50};
	Scanner scan  = new Scanner(System.in);
	System.out.println("Enter the length of the array");
	int n = scan.nextInt();
	int intArray[] = new int[n];
	System.out.println("Enter the array element");
	for(int i=0;i<n;i++)
	{
		intArray[i] =  scan.nextInt();
	}
//	int intArray1 = scan.nextInt();
	int largest = Integer.MIN_VALUE;
	int smallest = Integer.MAX_VALUE;
	for(int number: intArray)
	{
		if(number > largest)
		{
			largest = number;
		}
	}
	System.out.println("Largest number in array="+largest);
	
	for(int number : intArray)
	{
		if(number < smallest)
		{
			smallest = number;
		}
	}
	System.out.println("Smallest number in array="+smallest);
	}
}
	