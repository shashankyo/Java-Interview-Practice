package calcNoofVowelsWordsCharFrequency;

import java.util.Scanner;

public class Program {
public static void main(String[] args) {
//	String str = "Learn with Krishna Sandeep.";
	Scanner scan  = new Scanner(System.in);
	System.out.println("Enter the string");
	String str = scan.next();
//	PresentWordsDemo p = new PresentWordsDemo();
	getwordVowelsCount(str);
}
private static void getwordVowelsCount(String str) {
	int wordCount = 0;
	int vowelCount = 0;
	int uppercaseCount = 0;
	for(int i=0;i<str.length();i++)
	{
		char c = str.charAt(i);
		switch(c)
		{
		case ' ':
		case '.' :
			wordCount++;
		}
		switch(c)
		{
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			vowelCount++;
		}
		
		if(c >= 65 && c <= 90)
		{
			uppercaseCount++;
		}
	}
	
	System.out.println("wordcount="+(wordCount+1));
	System.out.println("vowelcount="+vowelCount);
	System.out.println("uppercaseCount="+uppercaseCount);

}
}
