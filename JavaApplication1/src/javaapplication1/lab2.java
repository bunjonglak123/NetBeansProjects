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
public class lab2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        double a;
        double b;
        double c;
        double d;
        double r;
        double e;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        r = input.nextDouble();
        
        
        e = 4/(3*(r+34))-9*(a+b*c)+3+d*(2+a)/a+b*d;
        
        System.out.format("%.f",e);

    }
    
}
