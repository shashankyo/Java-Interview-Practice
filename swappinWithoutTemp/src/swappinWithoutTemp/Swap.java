package swappinWithoutTemp;

public class Swap {
public static void main(String[] args) {
	int a = 10;
	int b = 20;
	System.out.println("Before swapping a="+a);
	System.out.println("Before swapping b="+b);
	swap(a,b);
}
private static void swap(int a, int b) {
	a = a + b;
	b = a - b;
	a = a - b;
	System.out.println("After swapping a="+a);
	System.out.println("After swapping b="+b);
}
}
