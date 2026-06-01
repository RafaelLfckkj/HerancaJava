package entities;

public class BussinesAccount extends Account {
    private double loanLimit;

    public BussinesAccount(){
        super();
    }

    public BussinesAccount(Integer number, String holder, Double balance, Double loanLimit){
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public void setLoanLimit(double loanLimit){
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if(amount <= loanLimit){
            balance += amount - 10.00;
        }
    }
}