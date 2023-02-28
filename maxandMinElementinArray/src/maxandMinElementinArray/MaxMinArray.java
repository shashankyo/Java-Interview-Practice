package maxandMinElementinArray;

import java.util.Scanner;

public class MaxMinArray {
public static void main(String[] args) {
	int n,max,min;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number of elements in an array");
	n = scan.nextInt();
	int a[] = new int[n];
	System.out.println("Enter the array elements");
	for(int i=0;i<n;i++)
	{
		a[i] = scan.nextInt();
	}
	max = a[0];
	min = a[0];
	
	//logic for Max 
	for(int i=0;i<n;i++)
	{
		if(a[i] > max)
		{
			max = a[i];
		}
	}
	//Logic for Min
	for(int i=0;i<n;i++)
	{
		if(a[i]<min)
		{
			min = a[i];
		}
	}
	System.out.println("Max="+max);
	System.out.println("Min="+min);
}
}
