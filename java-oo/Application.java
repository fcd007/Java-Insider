public class Application {
    public static void main(String[] args) {

       Account conta1 = new Account();
        conta1.deposit(1500);
        conta1.deposit("1000");

       Account conta2 = new Account();
       conta2.deposit(1000);

       conta1.transfer(500, conta2);

       conta1.printBalance();
       conta2.printBalance();
    }
}
