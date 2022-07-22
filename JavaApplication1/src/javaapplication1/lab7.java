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
import static java.lang.Math.sqrt;

public class lab7 {
    public static void main(String[] args) {
        double k = 0;
        for(int i = 1; i <=624; i++){
            for(int j = 2; i <=625;j++){
                    k = (1/sqrt(i)+sqrt(j));                                  
                }      
            }
            System.out.println(k);
        } 
}