//mau buat bank mini
//bisa nyimpen saldo
//bisa withdraw atau mengambil
//bisa menambah
//tambahin abstraction yang di setiap class itu punya method itu
//tambahin encaptulation (private/protected)
//tambahin inheritance

import java.util.Scanner;


abstract class Accounts{
    //penerapan encaptulation dimana menggunakan protected yang dapat dipakai di class turunannya
    protected double money ;

    //penerapan abstraction
    public double getMoney(){
        return money;
    }

    public void setMoney(double income){
        this.money = income;
    }

    abstract String balance();

}
//penerapan inheritance menggunakan extends
class BankAccount extends Accounts{
    //penerapan abstraction
    public String balance() {
        String a = "your balance:"+getMoney();
        return a;
    }
    public double deposit(double deposit_money) throws Exception{
        money += deposit_money;
        setMoney(money);
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
        setMoney(money);
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
        System.out.println("your saldo now: "+ getMoney());

        return money;
    }
}

class maintenanceBank extends Accounts {
    public String balance() {
        String b = "this account balance: "+getMoney();
        return b;
    }
    public String get_balance(){
        return "this account balance: "+ getMoney();
    }

}
public class Main {
    public static void main(String[] args) throws Exception{
        BankAccount Account = new BankAccount();
        maintenanceBank operator = new maintenanceBank();

        Scanner Action = new Scanner(System.in);
        while (true){
            System.out.println("Hallo selamat datang di CBA Bank😊🙏");
            System.out.println("1. as operators");
            System.out.println("2. as users ");
            System.out.print("Choose an option: ");
            int users_option = Action.nextInt();
            if (users_option==2){
                while (true){
                    System.out.println("Menu:");
                    System.out.println("1. Check Saldo");
                    System.out.println("2. Deposit ");
                    System.out.println("3. Withdraw");
                    System.out.println("4. Exit");
                    System.out.print("Choose an option: ");
                    try{
                        int inp_action = Action.nextInt();
                        if (inp_action == 1){
                                System.out.println(Account.balance());
                        } else if (inp_action==2) {
                                System.out.println("\033[H\033[2J");
                                System.out.println("how much do you want to deposit?");
                                double inp_deposit = Action.nextDouble();
                                Account.deposit(inp_deposit);
                        } else if (inp_action==3) {
                                System.out.println("\033[H\033[2J");
                                System.out.println("how much do you want to withdraw?");
                                double inp_withdraw = Action.nextDouble();
                                Account.withdraw(inp_withdraw);
                        } else if (inp_action==4) {
                                System.out.println("Wait! processing to home menu's");
                                break;
                        } else{
                                System.out.println("thank you for using this systems!");
                        }
                    }catch (java.util.InputMismatchException e){
                        System.out.println("must be a number!");
                        Action.next();
                    }
                }
            } else if (users_option==1) {
                System.out.print("Hi Developers!");
                System.out.print("u can see balance this users, do you want see?");
                String dev_option = Action.next();
                //equalsIgnoreCase ga sensitif sama huruf besar atau kecil
                if (dev_option.equalsIgnoreCase("yes")){
                    System.out.print("this account balance"+ Account.balance());
                }
            }
        }
    }
}



