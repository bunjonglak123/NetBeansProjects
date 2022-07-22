/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3q8;

/**
 *
 * @author bunjo
 */
public class q8 
{
    private int n;
    private double side;
    private double x;
    private double y;
    double p;
    double k;
    private String a;

    q8(int a, int b)
    {
        x = 3.0;
        y = 2.0;
        n = a;
        side = b; 
    }
    q8(int n, int side,double x,double y)
    {
        this.x=x;
        this.y=y;
        this.n=n;
        this.side = side;
    }

    q8() 
    {
        n=5;
    }

    void getPerimeter()
    {
        p =  this.n*this.side;
        System.out.println(p);
    } 
    
    void getArea()
    {
        k = (this.n*Math.pow(side, 2)/(4*Math.tan(3.14/n)));
        System.out.println(k);
    }
    
    void print()
    {
        System.out.println("Area: " + k);
        System.out.println("Perimeter: "+ p);
    }
}
