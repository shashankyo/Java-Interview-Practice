package leftRotateArray;

public class LeftRotateArrayDemo {
public static void main(String[] args) {
	int array[] = {10,20,30,40,50};
	//Store the first element in the temp
	int temp = array[0];
	//shift one element to the left
	for(int i=1;i<array.length;i++)
	{
		array[i-1]=array[i];
	}
	//Store the temp value in the last index
	array[array.length-1] = temp;
	for(int i : array)
	{
		System.out.println(i);
	}
}
}
