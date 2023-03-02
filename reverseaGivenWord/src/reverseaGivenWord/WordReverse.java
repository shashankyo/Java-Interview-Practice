package reverseaGivenWord;

public class WordReverse {
public static void main(String[] args) {
	String str = "Hello Welcome to Kodnest Bangalore";
	String splitArray[] = str.split(" ");
	for(int i=splitArray.length-1;i>=0;i--)
	{
		System.out.println(splitArray[i]);
	}
}
}
