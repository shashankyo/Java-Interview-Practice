package insertElementsAtSpecificPOsition;

import java.util.Scanner;

public class ArrayInsert {
public static void main(String[] args) {
	int array[] = new int[5];
	System.out.println("Enter the element");
	Scanner scan = new Scanner(System.in);
	for(int i=0;i<array.length;i++)
	{
		array[i] = scan.nextInt();
	}
	System.out.println("Printing the elements before the insertion");
	for(int i : array)
	{
		System.out.println(i);
	}
	System.out.println("Enter the loaction to insert an element");
	int location = scan.nextInt();
	System.out.println("Enter the value to insert");
	int value = scan.nextInt();
	for(int i=array.length-1;i>location;i--)
	{
		array[i]= array[i-1];
	}
	array[location] = value;
	for(int i: array)
	{
		System.out.println(i);
	}
}
}
