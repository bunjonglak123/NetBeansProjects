package lab3q6;

public class mainaccount {
    public static void main(String[] args) {
        Account INL1 = new Account(1122, 20000);

        INL1.withdraw(2500) ;
        INL1.deposit(3000) ;
        System.out.println(INL1.getBalance() );
        System.out.println(INL1.getMonthlyInterestRate()) ;
    }
}

