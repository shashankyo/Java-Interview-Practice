package celsiusToFahrenheit;

import java.util.Scanner;

public class Celsius {
public static void main(String[] args) {
	float temp;
	System.out.println("Enter the temperature to convert");
	Scanner scan  =  new Scanner(System.in);
	temp = scan.nextFloat();
	temp = ((temp - 32)*5/9);
	System.out.println("Temperature in Celsius"+temp);
}
}
