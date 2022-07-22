/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3q7;

/**
 *
 * @author bunjo
 */
public class q7main {
    public static void main(String[] args) {
        q7 INL1 = new q7(1122, 20000);

        INL1.withdraw(2500) ;
        INL1.deposit(3000) ;
        System.out.println(INL1.getBalance() );
        System.out.println(INL1.getMonthlyInterestRate()) ;
    }
}

