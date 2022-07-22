package javaapplication2;


import java.util.Scanner;
public class JavaApplication2
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
                System.out.format("Enter the monthly saving amount:");
		double money = input.nextFloat();
                double sum = (money*(1+0.00417));
                double value = ((money+sum)*(1+0.00417));
	
		System.out.format("After the sixth month, the account value is %f",value);
	}

}