
package ---;

import java.util.Scanner;
import java.util.ArrayList;

public class BankAccountTester {
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        BankAccount bankaccount = new BankAccount();
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
        int accountNumber = 1000;

        boolean a = true;
        while(a){
            System.out.println("***************************");
            System.out.println("*                         *");
            System.out.println("* N-New account 	  *");
            System.out.println("* D-Deposit               *");
            System.out.println("* W-withdrawal            *");
            System.out.println("* I-Inquiry               *");
            System.out.println("* T-Transfer              *");
            System.out.println("* C-Count of all Accounts *");
            System.out.println("* M-Maximum Account       *");
            System.out.println("* S-Sum Total of Accounts *");
            System.out.println("* Q-Quit                  *");
            System.out.println("* 		          *");
            System.out.println("***************************");
            System.out.print("Select menu letter : ");
            
            String letter = in.nextLine();

            switch(letter){
                case "N" :
                    System.out.println("account number : " + accountNumber);
                    System.out.print("Type amount : ");
                    double initialBalance = in.nextDouble();
                    in.nextLine();
                    bankaccount.newAccount(new BankAccount(accountNumber, initialBalance));
                    accountNumber += 1;
                    break;

                case "D" :
                    System.out.print("Type account number : ");
                    int depositAccountNumber = in.nextInt();
                    in.nextLine();
                    System.out.print("Type amount to deposit : ");
                    double depositAmount = in.nextDouble();
                    in.nextLine();
                    for (BankAccount account : accounts) {
                        if (account.getAccountNumber() == depositAccountNumber) {
                            account.deposit(depositAmount);
                            System.out.println("Deposit done");
                        }
                    }
                    break;

               case "W" :
                    System.out.print("Type account number : ");
                    int withdrawAccountNumber = in.nextInt();
                    in.nextLine();
                    System.out.print("Type amount to withdraw : ");
                    double withdrawAmount = in.nextDouble();
                    in.nextLine();
                    for (BankAccount account : accounts) {
                        if (account.getAccountNumber() == withdrawAccountNumber) {
                            account.withdraw(withdrawAmount);
                            System.out.println("Withdrawal done.");
                        }
                    }
                    break;

                case "I" :
                    System.out.print("Type account number : ");
                    int inquiryAccountNumber = in.nextInt();
                    in.nextLine();
                    for (BankAccount account : accounts) {
                        if (account.getAccountNumber() == inquiryAccountNumber) {
                            System.out.println("Account number : " + account.getAccountNumber());
                            System.out.println("Account balance : " + account.getBalance());
                        }
                    }
                    break;

                case "T" :
                    System.out.print("Type 1-st account number : ");
                    int firstAccountNumber = in.nextInt();
                    in.nextLine();
                    System.out.print("Type 1-st amount : ");
                    double firstAmount = in.nextDouble();
                    in.nextLine();
                    System.out.print("Type 2-nd account number : ");
                    int secondAccountNumber = in.nextInt();
                    in.nextLine();
                    System.out.print("Type 2-nd amount : ");
                    double secondAmount = in.nextDouble();
                    in.nextLine();
                    bankaccount.transfer(new BankAccount(firstAccountNumber, firstAmount), secondAmount);
                    System.out.println("Transfer done.");
                    break;

                case "C" :
                    System.out.println("count of all Accounts : " + accounts.size());
                    break;

                case "M" :
                    BankAccount maxAccount = bankaccount.getMaximum();
                    System.out.println("Maximum Account Number : " + maxAccount.getAccountNumber());
                    System.out.println("Maximum Account Amount : " + maxAccount.getBalance());
                    break;

                case "S" :
                    double total = 0;
                    for (BankAccount account : accounts) {
                        total += account.getBalance();
                    }
                    System.out.println("Sum total of Accounts : " + total);
                    break;

                case "Q" :
                    a = false;
                    break;
                }
            }
        }
    }

            
