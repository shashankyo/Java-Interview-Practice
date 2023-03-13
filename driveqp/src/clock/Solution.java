package clock;

public class Solution {
public static void main(String[] args) {
	String str = "TECHNOLOGIES?";
	String sub = str.substring(0, 6);

	int mid = str.length()/2;
	String str1 ="";
	for(int i=(str.length()-1);i>= mid;i--)
	{
		str1 = str1 +str.charAt(i);
	}
	System.out.println(str1+sub);
}
}
