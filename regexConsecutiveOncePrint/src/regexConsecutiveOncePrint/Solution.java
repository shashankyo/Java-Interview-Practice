package regexConsecutiveOncePrint;
public class Solution {
	public static void main(String[] args) {
		String str = "10011101";
		String[] split = str.split("0+");
		for(int i=0;i<split.length;i++)
		{
			System.out.println(split[i]);
		}
	}
}
