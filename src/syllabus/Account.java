package syllabus;

class Account{
    private double balance;
    String Name;

    Account(double bal){
        if(bal <= 0.0){
            System.out.println("Account Balance can't be negative or zero!!");
            System.exit(0);
        }
        balance = bal;
    }

    public double getBalance() {
        return balance;
    }

    boolean checkBalance(){
        return balance > 0.0;
    }

    void credit(double amount){
        balance += amount;
    }

    void debit(double amount){
        if(amount > balance){
            System.out.println("“Debit amount exceeded account balance");
        }
        else{
            balance -= amount;
            System.out.println("Amount debited from Account: "+amount);
        }
    }
}
