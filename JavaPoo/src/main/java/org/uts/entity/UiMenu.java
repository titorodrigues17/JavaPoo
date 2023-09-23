package org.uts.entity;

import java.util.Scanner;

public class UiMenu {
    public static void showMenu() {
        // Método estático llamado showMenu, sin parámetros y sin valor de retorno (void).
        System.out.println("Welcome to My Appointments");
        // Imprime un mensaje de bienvenida en la consola.
        System.out.println("Selecciona la opción deseada");
        // Imprime un mensaje para que el usuario seleccione una opción.

        int response = 0;
        // Declara una variable entera llamada response e inicializa su valor en 0.
        do {
            // Inicia un bucle do-while que se ejecutará al menos una vez y continuará
            // hasta que la condición en el while sea falsa.
            System.out.println("1. Doctor");
            // Imprime la opción 1: "Doctor".
            System.out.println("2. Patient");
            // Imprime la opción 2: "Patient".
            System.out.println("0. Salir");
            // Imprime la opción 0: "Salir".

            Scanner sc = new Scanner(System.in);
            // Crea una instancia de la clase Scanner para leer la entrada del usuario desde la consola.
            response = Integer.valueOf(sc.nextLine());
            // Lee la entrada del usuario como una línea de texto, la convierte a un entero y la asigna a la variable response.

            switch (response) {
                // Inicia una estructura switch basada en el valor de response.
                case 1:
                    System.out.println("Doctor");
                    // Si response es 1, imprime "Doctor".
                    break;
                case 2:
                    response = 0;
                    showPatientMenu();
                    // Si response es 2, establece response en 0 y llama al método showPatientMenu.
                    break;
                case 0:
                    System.out.println("Thank you for your visit");
                    // Si response es 0, imprime un mensaje de agradecimiento.
                    break;
                default:
                    System.out.println("Please select a correct answer");
                    // Si response no coincide con ninguno de los casos anteriores, imprime un mensaje de selección incorrecta.
            }
        } while (response != 0);
        // El bucle do-while se repite mientras response sea diferente de 0.
    }

    public static void showPatientMenu() {
        // Método estático llamado showPatientMenu.
        int response = 0;
        // Declara una variable entera llamada response e inicializa su valor en 0.
        do {
            // Inicia un bucle do-while que se ejecutará al menos una vez y continuará
            // hasta que la condición en el while sea falsa.
            System.out.println("\n\n");
            // Imprime tres líneas en blanco para separar visualmente el menú de paciente.
            System.out.println("Patient");
            // Imprime "Patient".
            System.out.println("1. Book an appointment");
            // Imprime la opción 1: "Book an appointment".
            System.out.println("2. My appointments");
            // Imprime la opción 2: "My appointments".
            System.out.println("0. Return");
            // Imprime la opción 0: "Return".

            Scanner sc = new Scanner(System.in);
            // Crea una instancia de la clase Scanner para leer la entrada del usuario desde la consola.
            response = Integer.valueOf(sc.nextLine());
            // Lee la entrada del usuario como una línea de texto, la convierte a un entero y la asigna a la variable response.

            switch (response) {
                // Inicia una estructura switch basada en el valor de response.
                case 1:
                    System.out.println("::Book an appointment");
                    // Si response es 1, imprime "::Book an appointment".
                    break;
                case 2:
                    System.out.println("::My appointments");
                    // Si response es 2, imprime "::My appointments".
                    break;
                case 0:
                    showMenu();
                    // Si response es 0, llama al método showMenu.
                    break;
            }
        } while (response != 0);
        // El bucle do-while se repite mientras response sea diferente de 0.
    }

}
