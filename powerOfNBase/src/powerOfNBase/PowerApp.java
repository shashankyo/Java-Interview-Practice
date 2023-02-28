package powerOfNBase;

import java.util.Scanner;

public class PowerApp {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter the base and exponent of the number");
	int base =  scan.nextInt();
	int exp = scan.nextInt();
	int res = (int)Math.pow(base, exp);	
	System.out.println("Result of "+base+" Raised to "+exp+" by using the built in function is "+res);
	res = Mathematics.power(base,exp);
	System.out.println("Result of "+base+" Raised to "+exp+" by using the user defined method is "+res);
}
}
