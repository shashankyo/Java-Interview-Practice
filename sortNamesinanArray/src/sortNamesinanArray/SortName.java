package sortNamesinanArray;

import java.util.Scanner;

public class SortName {
public static void main(String[] args) {
	int n;
	String temp;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number of names you want to sort");
	n = scan.nextInt();
	String names[] = new String[n];
//	Scanner scan  = new Scanner(System.in);
	System.out.println("Enter all the names");
	for(int i=0;i<n;i++)
	{
		names[i] = scan.next();
	}
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(names[i].compareTo(names[j])>0)
			{
				temp = names[i];
				names[i] = names[j];
				names[j] = temp;	
		    }
		}
	}
	for(String name:names)
	{
		System.out.println("Sorted Array");
		System.out.println(name);
	}
}
}
