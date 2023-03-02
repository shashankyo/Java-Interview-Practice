package removeDuplicatefromString;

import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

public class DuplicateRemove {
public static void main(String[] args) {
	String str = "sandeep";
	System.out.println(removeDuplicate(str));
}

private static String removeDuplicate(String str) {
	Set <Character> set = new HashSet<>();
	StringBuffer sf = new StringBuffer();
	for(int i=0;i<str.length();i++)
	{
		Character c = str.charAt(i);
		if(!set.contains(c))
		{
			set.add(c);
			sf.append(c);
		}
	}
	return sf.toString();
}
}
