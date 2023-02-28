package intersectionofTwoArray;

import java.util.HashSet;
import java.util.Scanner;

public class Intersection {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the length of the array");
	int n =  scan.nextInt();
	System.out.println("Enter the elements of first Array");
	int arr1[] = new int[n];
	for(int i=0;i<arr1.length;i++)
	{
		arr1[i] = scan.nextInt();
	}
	System.out.println("Enter the length of the array");
	int n1 =  scan.nextInt();
	System.out.println("Enter the elements of second Array");
	int arr2[] = new int[n1];
	for(int i=0;i<arr2.length;i++)
	{
		arr2[i] = scan.nextInt();
	}
//	int arr1[] = {4,1,2,3};
//	int arr2[] = {5,4,7,8};
	printIntersection(arr1,arr2);
}

private static void printIntersection(int[] arr1, int[] arr2)
{
	HashSet <Integer> hs = new HashSet<>();
	{
		for(int i=0;i<arr1.length;i++)
		{
			hs.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++)
		{
			if(hs.contains(arr2[i]))
			{
				System.out.println("Common Element is"+arr2[i]);
			}
		}
	}
}
}
