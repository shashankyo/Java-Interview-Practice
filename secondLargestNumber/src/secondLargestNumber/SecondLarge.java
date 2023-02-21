package secondLargestNumber;

import java.util.Arrays;

public class SecondLarge {
public static void main(String[] args) {
	int array[] = {1,20,5,6,10};
	Arrays.sort(array);
	System.out.println(array[array.length-2]);
}
}
