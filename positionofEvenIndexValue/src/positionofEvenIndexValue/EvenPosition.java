package positionofEvenIndexValue;

public class EvenPosition {
public static void main(String[] args) {
	int arr[] = new int[] {1,2,3,4,5,7,8};
	for(int i=2;i<arr.length;i=i+2)
	{
		System.out.println("Index="+i);
		System.out.println("Value="+arr[i]);
	}
}
}
