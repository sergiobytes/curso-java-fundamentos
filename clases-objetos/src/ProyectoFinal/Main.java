package ProyectoFinal;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Juan Perez", 1000.0);
        BankApp bankApp = new BankApp(bankAccount);
        bankApp.start();
    }
}
