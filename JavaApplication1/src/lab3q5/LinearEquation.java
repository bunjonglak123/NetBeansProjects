/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3q5;

/**
 *
 * @author bunjo
 */
import java.util.Scanner;

public class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public LinearEquation ()
    {
        System.out.print("Enter a b c d e f:");
        Scanner input = new Scanner(System.in);
          a = input.nextDouble();
          b = input.nextDouble();
          c = input.nextDouble();
          d = input.nextDouble();
          e = input.nextDouble();
          f = input.nextDouble();

    }

    double x ;
    double y ;

    public void getx()
    {
        if((a*d)-(b*c) == 0)
        {
            System.out.println("The equation has no solution");
        }
        else
        {
            x = ((e*d)-(b*f))/((a*d)-(b*c));
            
        }
    }

    public void  gety()
    {
        if((a*d)-(b*c) == 0)
        {
            System.out.println("The equation has no solution");
        }
        else
        {
            y = ((a*f)-(e*c))/((a*d)-(b*c));
            
        }
        System.out.print("x is "+x+" and y is "+ y);
        
    }
    boolean isSolvable() {
            return (a*d)-(b*c) !=0 ? true:false;
        }
}
