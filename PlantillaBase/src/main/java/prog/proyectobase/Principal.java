/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package prog.proyectobase;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author larapresa
 */
public class Principal {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        
        int opcion;
        boolean fin = false;
        
        // Se muestra el menú mientras fin no sea igual a true
        // Se ejecuta el código correspondiente a la opción elegida por el usuario/a
        do {
            try {
                opcion = menu();
                switch (opcion) {
                    case 1:
                        System.out.println("Opción 1.");
                        // Código a ejecutar 
                        break;
                    case 2:
                        System.out.println("Opción 2.");
                        // Código a ejecutar 
                        break;
                    case 3:
                        System.out.println("Opción 3.");
                        // Código a ejecutar 
                        break;
                    case 4:
                        System.out.println("Opción 4.");
                        // Código a ejecutar 
                        break;
                    case 5:
                        System.out.println("Opción 5.");
                        // Código a ejecutar 
                        break;
                    case 6:
                        System.out.println("Has seleccionado terminar el programa. Hasta luego.");
                        fin = true;
                        break;
                }
            // Se captura la excepción de que el dato introducido no sea un número 
            } catch (InputMismatchException e) {
                System.out.println("Se debe introducir un número entero.");
                teclado.nextLine();
            }
        } while (fin == false);
    }


    /**
     * Método que muestra un menú por pantalla y devuelve la opción elegida por
     * el usuario/a
     *
     * @return <code>option</code> con la opción del menú escogida
     */
    public static int menu() {
        int opcion = 0;

        do {
            System.out.println("Seleccionar una opción:");
            System.out.println("[1] .");
            System.out.println("[2] .");
            System.out.println("[3] .");
            System.out.println("[4] .");
            System.out.println("[5] .");
            System.out.println("[6] .");
            System.out.println("[0] Salir.");

            System.out.println("Escriba la selección: ");
            opcion = teclado.nextInt();
            teclado.nextLine(); // limpiamos el salto de línea del buffer
        } while (opcion < 1 || opcion > 6);

        return opcion;
    }
}
