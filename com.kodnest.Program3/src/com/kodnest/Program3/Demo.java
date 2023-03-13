package com.kodnest.Program3;

public class Demo {
public static void main(String[] args) {
	int[] alice = {3,2,1};
	int[] bob = {1,2,3};
	int alicePoints = 0;
	int bobPoints = 0;
	
	for( int i=0;i<bob.length;i++)
	{
			if(alice[i]>bob[i])
			{
				alicePoints++;
			}
			if(alice[i] < bob[i]) {
				bobPoints++;
			}
			 if(alice[i] == bob[i])
			{
				alicePoints ++;
				bobPoints++;
			}
		}
	

	String str = alicePoints + " "+ bobPoints;
	char[] charArray = str.toCharArray();
	
	for( int i=0;i<charArray.length;i++)
	{
		System.out.println(charArray[i]+" ");
	}
}
}
