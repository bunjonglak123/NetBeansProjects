package lab3q6;
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    double annualInterestRate;
    private Date dataCreated;

    Account()
    {
        double balance = 0;
    }
    Account(int id,int balance)
    {
        this.id = id;
        this.balance = balance;
    }


    public int getid()  //id
    {
        return this.id;
    }
    public void setid(int id)
    {
        this.id = id;
    }


    public double getBalance()  //Balance
    {
        return this.balance;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }


    public double getannualInterestRate()  //annualInterestRate
    {
        return this.annualInterestRate;
    }
    public void setannualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate = annualInterestRate;
    }


    public Date getdataCreated()  //dataCreated
    {
        return this.dataCreated;
    }
    public void setdataCreated(Date dataCreated)
    {
        this.dataCreated = dataCreated;
    }

    public double getMonthlyInterestRate()
    {
        return annualInterestRate/12;
    }


    public double getMonthlyInterest()
    {
        return (annualInterestRate/12)*balance;
    }


    public void withdraw(double amount)
    {
        balance = balance - amount;
    }


    public void  deposit(double amount)
    {
        balance = balance + amount;
    }
}