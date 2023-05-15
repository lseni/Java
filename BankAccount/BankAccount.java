
package ---;

import java.util.ArrayList;

public class BankAccount {
    
    private int accountNumber;
    private double balance;
    private ArrayList<BankAccount> accounts;

    public BankAccount()
    {
        accounts = new ArrayList<BankAccount>();
    }

    public BankAccount(int anAccountNumber, double initialBalance)
    {
        accountNumber = anAccountNumber;
        balance = initialBalance;
    }

    public void newAccount(BankAccount a)
    {
        accounts.add(a);
    }

    public void deposit(double amount)
    {
        double newBalance = balance + amount;
        balance = newBalance;
    }

    public void withdraw(double amount)
    {
        double newBalance = balance - amount;
        balance = newBalance;
    }

    public void transfer(BankAccount destination, double amount)
    {
        destination.balance = destination.balance + amount;
        this.balance = this.balance - amount;
    }

    public BankAccount getMaximum()
    {
        if (accounts.size() == 0) return null;
        BankAccount largest = accounts.get(0);
        for (int i = 1; i < accounts.size(); i++)
        {
            BankAccount a = accounts.get(i);
            if (a.getBalance() > largest.getBalance())
                largest = a;
        }
        return largest;
    }

    public int getAccountNumber() 
    {
        return accountNumber;
    }

    public double getBalance()
    {
        return balance;
    }
}
