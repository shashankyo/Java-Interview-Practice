package driveQpOct;

import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
	System.out.println("Enter the sentence");
	Scanner scan = new Scanner(System.in);
	String sentence = scan.nextLine();
	System.out.println("Enter a letter[any letter from A to Z (or) a to z]");
	char ch = scan.next().charAt(0);
	int count = 0;
	int pos=0;
	char[] arr = sentence.toCharArray();
	for(int i=0;i<arr.length;i++)
	{
		if(ch == arr[i])
		{
			count++;
			pos =i;
			break;
		}
	}
	if(pos >0)
	{
		for(int i=pos+1;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
	else {
		System.out.println(sentence);
	}
	
}}
