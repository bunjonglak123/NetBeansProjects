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
public class Question8 
{
    public static void main(String args[]) 
    {
        q8 obj = new q8(6,4);
        obj.getPerimeter();
        obj.getArea();
        obj.print();
        q8 obj2 = new q8();
        obj2.getPerimeter();
        obj2.getArea();
        obj2.print();
        q8 obj3 = new q8(10,4,5.6,7.8);
        obj3.getPerimeter();
        obj3.getArea();
        obj3.print();
    }
}
