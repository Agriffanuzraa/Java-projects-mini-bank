//mau buat bank mini
//bisa nyimpen saldo
//bisa withdraw atau mengambil
//bisa menambah


import java.util.Scanner;
class BankAccount{
    public double money ;
    public void balance() {
        System.out.println("your balance now: "+money);
    }

    public double deposit(double deposit_money) throws Exception{
        money += deposit_money;
        System.out.println("update saldo.");
        Thread.sleep(3000);
        System.out.print("\033[H\033[2J");
        System.out.println("update saldo..");
        Thread.sleep(3000);
        System.out.print("\033[H\033[2J");
        System.out.println("update saldo...");
        Thread.sleep(3000);
        System.out.print("\033[H\033[2J");
        System.out.println("Yes!Your saldo succesfully update! ");
        System.out.println("Update your saldo!");
        return money;
    }
    public double withdraw(double withdraw_money) throws InterruptedException {
        money -= withdraw_money;
        System.out.println("update saldo.");
        Thread.sleep(3000);
        System.out.print("\033[H\033[2J");
        System.out.println("update saldo..");
        Thread.sleep(3000);
        System.out.print("\033[H\033[2J");
        System.out.println("update saldo...");
        Thread.sleep(3000);
        System.out.print("\033[H\033[2J");
        System.out.println("Yes!Your saldo succesfully update! ");
        System.out.println("your saldo now: "+money);

        return money;
    }
}
public class Main {

    public static void main(String[] args) throws Exception{
        BankAccount Account = new BankAccount();
        Scanner Action = new Scanner(System.in);

        while (true){

                System.out.println("Menu:");
                System.out.println("1. Check Saldo");
                System.out.println("2. Deposit ");
                System.out.println("3. Withdraw");
                System.out.print("Choose an option: ");
                try{
                    int inp_action = Action.nextInt();
                    if (inp_action == 1){
                            Account.balance();
                    } else if (inp_action==2) {
                            System.out.println("\033[H\033[2J");
                            System.out.println("how much do you want to deposit?");
                            double inp_deposit = Action.nextDouble();
                            Account.deposit(inp_deposit);
                    } else if (inp_action==3) {
                            System.out.println("\033[H\033[2J");
                            System.out.println("how much do you want to deposit?");
                            double inp_withdraw = Action.nextDouble();
                            Account.withdraw(inp_withdraw);
                    }else{
                            System.out.println("thank you for using this systems!");
                    }
                }catch (java.util.InputMismatchException e){
                    System.out.println("must be a number!");
                    Action.next();

                                    }

        }

    }
}

//recrusion method


