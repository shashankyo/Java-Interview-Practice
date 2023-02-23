package elepress;

import java.util.Scanner;

public class Search {
private static String i;

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the array length");
	int length= scan.nextInt();
	int arr[] =  new int[length];
	System.out.println("Enter the array elements:");
	for(int i=0;i<=arr.length-1;i++)
	{
		arr[i] = scan.nextInt();
	}
	System.out.println("Enter the element to search:");
	int key = scan.nextInt();
	int flag = 0;int i= 0;
	for( i=0;i<=arr.length-1;i++)
	{
		if(key == arr[i])
		{
			flag = 1;
			break;
		} else {
			flag = 0;
		}
	}
		if(flag == 1)
		{
			System.out.print("Key present at index "+i);
		}else {
			System.out.println("not present");

		}
		}
	
}