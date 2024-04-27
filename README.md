# Validador de Contraseñas

Este es un programa de consola en Java que utiliza expresiones regulares para validar contraseñas de usuarios de manera concurrente. El programa lanza varios hilos que, de manera independiente, validan las contraseñas ingresadas por los usuarios. Cada hilo verifica si una contraseña cumple con ciertos requisitos, como longitud mínima, presencia de caracteres especiales, letras mayúsculas y minúsculas, y al menos un número.

## Requisitos del Sistema

- Java Development Kit (JDK) instalado en su sistema.

## Ejecución

1. Clonar o descargar este repositorio en su máquina local.
2. Navegar a la carpeta del proyecto en la terminal.
3. Compilar el programa ejecutando el siguiente comando:

   ```bash
   javac PasswordValidator.java
   ```

4. Una vez compilado, ejecutar el programa con el siguiente comando:

   ```bash
   java PasswordValidator
   ```

5. Siga las instrucciones en pantalla para ingresar las contraseñas que desea validar. Para salir del programa, escriba "exit".

## Ejemplo de Uso

1. Ingrese las contraseñas que desea validar. Por ejemplo:

   ```plaintext
   Ingrese las contraseñas a validar (escriba 'exit' para salir en cualquier momento):
   Contraseña123!
   ```

2. El programa mostrará un mensaje indicando si la contraseña ingresada es válida o no.

   ```plaintext
   La contraseña 'Contraseña123!' es válida.
   ```
