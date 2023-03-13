package com.kodnest.Program2;

import java.util.Scanner;

public class Demo {
	static Scanner scan = new Scanner(System.in);

public static void main(String[] args) {
	System.out.println("Please enter the array length");
	int size = scan.nextInt();
	int[] array = createarray(size);
	int[] array1 = initializeArray(array);
	display(array1);
	int arraySum = arraySum(array1);
	System.out.println("The sum is: "+arraySum);

}

private static int arraySum(int[] array1) {
	int sum = 0;
	for(int i=0;i<array1.length;i++)
	{
		sum = sum + array1[i];
	}
	return sum;

}

private static void display(int[] array1) {

	for(int i=0; i< array1.length; i++)
	{
		System.out.println(array1[i] + " ");
	}
}

private static int[] initializeArray(int[] array) {
	 System.out.println("Please enter "+array.length+" elements");
	 for(int i=0;i<array.length;i++)
	 {
		 array[i] = scan.nextInt();
	 }
	 return array;
}

private static int[] createarray(int size) {
	int array[] = new int[size];
	return array;
}
}
