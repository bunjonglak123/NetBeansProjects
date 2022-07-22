/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author bunjo
 */
public class run 
{        
    static double average(double distance,double time)
    {
        return distance/time;
    }
    static double tohour(double min,double sec)
    {
       return (min/60)+(sec/3600);
    }
    static double convert(double speed)
    { 
        return speed /1.6;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double distance = scan.nextInt();
        double hour = scan.nextInt();
        double min = scan.nextInt();
        double sec = scan.nextInt();
        double time = tohour(min,sec)+hour;
        double speed = average(distance,time);
        double mph = convert(speed);
        System.out.println(mph+"mph");
   
    }
    
}
