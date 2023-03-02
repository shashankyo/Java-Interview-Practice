package hackerRankregex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
public static void main(String[] args) {
	//write the regex expression for a user name with length <= 10
	Scanner scan =  new Scanner(System.in);
	System.out.println("Enter the username");
	String username = scan.next();
	String reg = "^[a-zA-Z][\\w+a-zA-Z_0-9]{7,29}";
	Pattern pt = Pattern.compile(reg);
	Matcher mt = pt.matcher(username);
	System.out.println(mt.matches());
}
}
