package strongNumberOrNot;

public class Strong {
	int fact(int n)
	{
		int fact = 1;
	
	for(int i=1;i<=n;i++)
	{
		fact = fact * i;
	}
	return fact;
	}
	
	boolean detectStrong(int num)
	{
		int temp = num;
		int sum = 0;
		int digit = 0;
		while(temp !=0)
		{
			digit = temp % 10;
			sum = sum + fact(digit);
			temp = temp / 10;
		}
		if(sum == num)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}