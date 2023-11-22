package Assignment1;

import Assignment1.Workers.Booker;
import Assignment1.Workers.Director;
import Assignment1.Workers.Worker;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the job code (1 - Director, 2 - Worker, 3 - Accountant).");
        int positionInCompany = scanner.nextInt();
        Position employee = null;
        switch (positionInCompany){
            case 1:
                employee = new Director();
                break;
            case 2:
                employee = new Worker();
                break;
            case 3:
                employee = new Booker();
                break;
            default:
                System.out.println("Incorrect job code");
                System.exit(1);
        }
        if (employee != null){
            employee.displayPosition();
        }
    }
}
