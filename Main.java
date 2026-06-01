import entities.Account;
import entities.BussinesAccount;
import entities.SavingsAccount;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
    //     Account acc = new Account(1001, "Alex", 0.0);
    //     BussinesAccount bacc = new BussinesAccount(1002, "Maria", 0.0, 500.00);

    //     // UPCASTING V

    //     Account acc1 = bacc;
    //     Account acc2 = new BussinesAccount(1003, "Bob", 0.0, 200.0);
    //     Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

    //     // DOWNCASTING V

    //     BussinesAccount acc4 = (BussinesAccount)acc2;
    //     acc4.loan(100.00);

    //    // BussinesAccount acc5 = (BussinesAccount)acc3;
    //     if (acc3 instanceof BussinesAccount) {
    //         BussinesAccount acc5 = (BussinesAccount)acc3;
    //         acc5.loan(200.0);
    //         System.out.println("Emprestimo!");
    //      }

    //      if (acc3 instanceof SavingsAccount) {
    //          SavingsAccount acc5 = (SavingsAccount)acc3;
    //         acc5.updateBalance();
    //         System.out.println("Uptade!! ");
    //      }

    //     // Account acc1 = new Account(1001, "Alex", 1000.00);
    //     // acc1.withdraw(200.00);
    //     // System.out.println(acc1.getBalance());


        // Account acc1 = new Account(1001, "Alex", 1000.0);
        // Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        // Account acc3 = new BussinesAccount(1003, "Bob", 1000.0, 500.00);

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
        list.add(new BussinesAccount(1002, "Maria", 1000.00, 400.00));
        list.add(new SavingsAccount(1003, "Bob", 300.00, 0.01));
        list.add(new BussinesAccount(1004, "Anna", 500.00, 500.00));

        double sum = 0.0;
        for(Account acc : list){
            sum += acc.getBalance();
        }
        System.out.printf("Total Balance %.2f\n", sum);

        for(Account acc : list){
            acc.deposit(10.0);
        }
        for(Account acc : list){
            System.out.printf("Update balance for account %d: %.2f\n", acc.getNumber(), acc.getBalance());
        }
      
    }   
}
