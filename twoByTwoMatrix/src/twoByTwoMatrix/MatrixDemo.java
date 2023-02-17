package twoByTwoMatrix;

import java.util.Scanner;

public class MatrixDemo {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int r,c;
	System.out.println("Enter the number of Rows");
	r  = scan.nextInt();
	System.out.println("Enter the number of Column");
	c  = scan.nextInt();
	int matrix[][]= new int[r][c];
	System.out.println("Enter the element of the matrix");
	for(int  i= 0; i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			matrix[i][j] = scan.nextInt();
		}
	}
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			System.out.print(matrix[i][j]+ "  ");
		}
		System.out.println(" ");
	}
}
}
