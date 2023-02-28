package countingVowelsConsonants;

public class VowelsConsonants {
public static void main(String[] args) {
	String str = "Sandep";
	countVowels(str);
}
private static void countVowels(String str)
{
	int vowelsCount = 0;
	int consonantCount = 0;
	for(int i=0;i<str.length();i++)
	{
		if(isVowel(str.charAt(i)))
		{
			++vowelsCount;
		}else {
			++consonantCount;
		}
	}
	System.out.println("Vowels count="+vowelsCount);
	System.out.println("Consonants count="+consonantCount);
}
private static boolean isVowel(char ch)
{
	ch = Character.toUpperCase(ch);
	{
		return(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
	
	}
}
}