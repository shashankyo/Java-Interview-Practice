package comparingStringsWithoutBuiltinFunction;

public class Compare {
public static void main(String[] args) {
	String str1 = "abcd";
	String str2 = "aaabdc";
	boolean isCompare =  false;
	for(int i=0;i<str1.length();i++)
	{
		if(str1.charAt(i)!= str2.charAt(i))
		{
			isCompare = false;
			break;
		}
		isCompare = true;
	}
	if (isCompare == true)
	{
		System.out.println("Both Strings are equal ");
	}
	else
	{
		System.out.println("Both Strings are not equal ");
	}
}
}
