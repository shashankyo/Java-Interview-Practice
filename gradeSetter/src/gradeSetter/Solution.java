package gradeSetter;

import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
	System.out.println("Please enter the grade");
	Scanner scan = new Scanner(System.in);
	int grade = scan.nextInt();
	if (grade >= 37 && grade % 5 > 2) {
	       grade += 5 - (grade % 5);
	    } else {
	        grade = grade;
	    }
	System.out.println(grade);
}
}
