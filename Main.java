import src.passwordValidatorTask;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese las contraseñas a validar (escriba 'exit' para salir en cualquier momento):");

        ExecutorService executor = Executors.newCachedThreadPool();
        String input;
        boolean isExit = false;

        while (!isExit) {
            input = scanner.nextLine();
            isExit = checkExit(input);
            executor.execute(new passwordValidatorTask(input));
        }

        System.out.println("Bye bye!");
        executor.shutdown();
        scanner.close();
    }

    private static boolean checkExit(String input) {
        return input.equalsIgnoreCase("exit");
    }
}
