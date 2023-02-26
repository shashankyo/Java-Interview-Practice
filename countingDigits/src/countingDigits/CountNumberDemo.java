package countingDigits;

public class CountNumberDemo {
public static void main(String[] args) {
	int number = 5678;
	int count = 0;
	while(number !=0)
	{
		number  = number/10;
		count++;
	}
	System.out.println(count);
}
}
