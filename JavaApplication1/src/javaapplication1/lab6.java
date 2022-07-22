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
public class lab6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h = 0;
        double q;
        double j;
        double m;
        double k;
        double year;
        System.out.print("Enter year month day:");
        year = input.nextFloat();
        m = input.nextFloat();
        q = input.nextFloat();
        j = year/100;
        k = year%100;
        h =  (int) (q + 26*(m + 1) / 10 + k + k / 4 + j / 4 + 5 * j-2);
        h = h%7;
        switch(h){
            case 0:System.out.println("Day of the week is Saturday");break;
            case 1:System.out.println("Day of the week is Monday");break;
            case 2:System.out.println("Day of the week is Tuesday");break;
            case 3:System.out.println("Day of the week is Wednesday");break;
            case 4:System.out.println("Day of the week is Thursday");break;
            case 5:System.out.println("Day of the week is Friday");break;
            case 6:System.out.println("Day of the week is Sunday");break;  
            
        }
    }
}
