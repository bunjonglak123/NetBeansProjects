/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author bunjo
 */
import java.util.Scanner;
public class HW9
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double fahrenheit = input.nextDouble();
		double celsius = ((fahrenheit - 32)*5/9);
		

		if(fahrenheit >= 32 && fahrenheit <= 4000)
		{

			System.out.format("%.4f",celsius);
		}
	}
}

