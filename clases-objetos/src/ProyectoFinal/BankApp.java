package ProyectoFinal;

import java.util.Scanner;

public class BankApp {
    private BankAccount account;
    private Scanner scanner;

    public BankApp(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        int option;

        do {
            displayMenu();
            option = getUserOption();
            processOption(option);
        } while (option != 4);
    }

    private void displayMenu() {
        System.out.println("--- Menú de Banco ---");
        System.out.println("1. Depositar");
        System.out.println("2. Retirar");
        System.out.println("3. Consultar Saldo");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private int getUserOption() {
        return scanner.nextInt();
    }

    private void handleDeposit() {
        System.out.print("Ingrese el monto a depositar: ");
        double amount = scanner.nextDouble();
        account.deposit(amount);
    }

    private void handleWithdraw() {
        System.out.print("Ingrese el monto a retirar: ");
        double amount = scanner.nextDouble();
        account.withdraw(amount);
    }

    private void processOption(int option) {
        switch (option) {
            case 1:
                handleDeposit();
                break;
            case 2:
                handleWithdraw();
                break;
            case 3:
                account.displayBalance();
                break;
            case 4:
                System.out.println("Gracias por usar el banco. ¡Adiós!");
                break;
            default:
                System.out.println("Opción inválida. Intente de nuevo.");
        }
    }
}
