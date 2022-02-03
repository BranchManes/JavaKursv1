package Lesson4;

public class BankAccount {

    int id;
    String name;
    double balance;

    double popolnenieScheta(double uvelechenie) {

        balance += uvelechenie;
        return balance;

    }

    double snyatieScheta(double umenshenie) {

        balance -= umenshenie;
        return balance;

    }

    public static void main(String[] args) {

        BankAccount MyAccount = new BankAccount();

        MyAccount.id = 10;
        MyAccount.name = "Mike";
        MyAccount.balance = 2.2;
        MyAccount.popolnenieScheta(200);
        System.out.println(MyAccount.balance);

        BankAccount YourAccount = new BankAccount();

        YourAccount.id = 6;
        YourAccount.name = "Bike";
        YourAccount.balance = 10.2;
        YourAccount.popolnenieScheta(500);
        System.out.println(YourAccount.balance);

        BankAccount HisAccount = new BankAccount();

        HisAccount.id = 7;
        HisAccount.name = "Luk";
        HisAccount.balance = 50.2;
        HisAccount.popolnenieScheta(50);
        System.out.println(HisAccount.balance);

    }

}

class BankAccountTest {

    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 10;
        MyAccount.name = "Mike";
        MyAccount.balance = 2.2;

        System.out.println(MyAccount.balance);

        YourAccount.id = 6;
        YourAccount.name = "Bike";
        YourAccount.balance = 10.2;

        System.out.println(YourAccount.balance);

        HisAccount.id = 7;
        HisAccount.name = "Luk";
        HisAccount.balance = 50.2;

        System.out.println(HisAccount.balance);

    }
}
