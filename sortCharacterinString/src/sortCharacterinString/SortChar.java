package sortCharacterinString;

import java.util.Arrays;

public class SortChar {
public static void main(String[] args) {
	String str  = "sandeep";
	char ch[] = str.toCharArray();
	Arrays.sort(ch);
	String Sortedstr = new String(ch);
	System.out.println(ch);
	System.out.println(Sortedstr);
}
}
