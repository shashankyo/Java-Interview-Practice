package factorsofNumber;

public class Factors {
static void printFactors(int num)
{
	for(int i=1; i<=num;i++)
	{
		if(num % i == 0)
		{
			System.out.println(i+" ");
		}
	}
}
}
