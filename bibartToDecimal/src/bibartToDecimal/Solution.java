package bibartToDecimal;

public class Solution {
public static void main(String[] args) {
//using toCharArray Method
//		int sum = 0;
//	String str = "1010";
//	char ch[] = str.toCharArray();
//	int m = str.length()-1;
//	for(int i=0;i<ch.length;i++)
//	{
//		int k =  ch[i]-48;
//		sum = sum +(int)(k*Math.pow(2, m));
//		m--;
//		
//	}
//	System.out.println(sum);
//	
	//without using tocharArray
	int sum = 0;
	String str = "1011";
//	char ch[] = str.toCharArray();
	int m = str.length()-1;
	for(int i=0;i<str.length();i++)
	{
		int k = str.charAt(i)-48;
		sum = sum +(int)(k*Math.pow(2, m));
		m--;
		
	}
	System.out.println(sum);
	}
	}
