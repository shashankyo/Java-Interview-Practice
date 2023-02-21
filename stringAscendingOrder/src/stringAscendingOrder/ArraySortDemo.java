package stringAscendingOrder;

import java.util.Arrays;

public class ArraySortDemo {
public static void main(String[] args) {
	String str[] = {"one","two","three","four"};
	System.out.println("Before Sorting");
	for(String string:str)
	{
		System.out.println(str);
	}
	Arrays.sort(str);
	System.out.println("After Sorting");
	for(String str1:str)
	{
		System.out.println(str1);
	}
}
}
