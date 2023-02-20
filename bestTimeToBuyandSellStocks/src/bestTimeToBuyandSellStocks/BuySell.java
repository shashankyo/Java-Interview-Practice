package bestTimeToBuyandSellStocks;

public class BuySell {
public static void main(String[] args) {
	int array[] = {2,20,3,80,100};
	int min = Integer.MAX_VALUE;
	int max = Integer.MIN_VALUE;
	for(int i = 0; i< array.length;i++)
	{
		if(array[i] < min)
		{
			min  = array[i];
		}
		if(array[i] - min > max)
		{
			max = array[i] - min;
		}
	}
	System.out.println("Maximum value="+max);
}
}
