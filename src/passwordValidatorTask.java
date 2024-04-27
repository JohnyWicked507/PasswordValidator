package src;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class passwordValidatorTask implements Runnable {
    private final String password;

    public passwordValidatorTask(String password) {
        this.password = password;
    }

    @Override
    public void run() {
        boolean isValid = validatePassword(password);
        if (isValid) {
            System.out.println("La contraseña '" + password + "' es valida.");
        } else {
            System.out.println("La contraseña '" + password + "' no es valida.");
        }
    }

    public boolean validatePassword(String password) {
        // Longitud mínima de 8 caracteres
        if (password.length() < 8) {
            return false;
        }

        // Presencia de caracteres especiales
        Pattern specialCharPattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher specialCharMatcher = specialCharPattern.matcher(password);
        if (!specialCharMatcher.find()) {
            return false;
        }

        // Al menos 2 letras mayusculas
        Pattern uppercasePattern = Pattern.compile("[A-Z]");
        Matcher uppercaseMatcher = uppercasePattern.matcher(password);
        int uppercaseCount = 0;
        while (uppercaseMatcher.find()) {
            uppercaseCount++;
        }
        if (uppercaseCount < 2) {
            return false;
        }

        // Al menos 3 letras minusculas
        Pattern lowercasePattern = Pattern.compile("[a-z]");
        Matcher lowercaseMatcher = lowercasePattern.matcher(password);
        int lowercaseCount = 0;
        while (lowercaseMatcher.find()) {
            lowercaseCount++;
        }
        if (lowercaseCount < 3) {
            return false;
        }

        // Al menos 1 numero
        Pattern digitPattern = Pattern.compile("[0-9]");
        Matcher digitMatcher = digitPattern.matcher(password);
        if (!digitMatcher.find()) {
            return false;
        }

        return true;
    }
}
