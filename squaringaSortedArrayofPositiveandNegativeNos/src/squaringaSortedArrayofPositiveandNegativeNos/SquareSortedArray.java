package squaringaSortedArrayofPositiveandNegativeNos;

public class SquareSortedArray {
public static void main(String[] args) {
	int array[] = {-6,-1,2,4,5};
	int SquareArray[] = squareSortedArray(array);
	for(int i=0;i<SquareArray.length;i++)
	{
		System.out.println(SquareArray[i]);
	}
}
private static int[] squareSortedArray(int [] array)
{
	int[] SquareArray = new int[array.length];
	int start = 0;
	int end = array.length-1;
	int squareIndex = array.length-1;
	while(start < end)
	{
		if(array[start]*array[start] > array[end]*array[end])
		{
			SquareArray[squareIndex--] = array[start]*array[start];
			start ++;
		}
		else
		{
			SquareArray[squareIndex--] = array[end] * array[end];
			end --;
		}
	}
	return SquareArray;
}
}
