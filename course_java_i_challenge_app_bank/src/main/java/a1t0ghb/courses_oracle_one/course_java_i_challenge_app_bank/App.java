/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package a1t0ghb.courses_oracle_one.course_java_i_challenge_app_bank;

import java.util.Scanner;

/**
 *
 * @author a1t0ghb
 */
public class App {

    public static void main(String[] args) {
        
        //  Client's variables declaration and initialization.
        String nombre = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;

        //  Home screen: validate initialization variables.
        System.out.println("\n********************");
        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("El tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("Su saldo disponible es: " + saldo + "$");

        System.out.println("\n********************");
        String menu = """
        *** Escriba el número de la opción deseada. ***
        1 - Consultar saldo.
        2 - Retirar.
        3 - Depositar.
        9 - Salir.
        """;

        //  Class to receive input of user from console; INITIALIZATION.
        //  - Use in conjunction with try-with-resources, to AUTOMATICALLY close resources and manage try-cath exceptions. Ref: 'https://www.w3schools.com/java/java_try_catch_resources.asp'.
        try (Scanner teclado = new Scanner(System.in)) {
            
            //  Initialize client's option.
            int opcion = 0;
            //  While client doesn't choose '9' as input, program will keep asking for an option.
            while (opcion != 9) {

                //  Prints menu message, every time enters the 'while' loop.
                System.out.println(menu);
                //  Asks user for the 'opcion' input.
                opcion = teclado.nextInt();                                     //  'Scanner.nextInt()' method to receive an integer as an input.

                //  Evaluates 'opcion' entered by user. Alternative to use 'if' conditionals.
                switch (opcion) {

                    //  Option: get balance.
                    case 1 -> System.out.println("El saldo actualizado es: " + saldo + "$");

                    //  Option: withdrawals.
                    case 2 -> {
                        System.out.println("Cuál es el valor que desea retirar?");
                        double valorARetirar = teclado.nextDouble();            //  'Scanner.nextDouble()' method to receive a doubles an input.
                        if (saldo < valorARetirar) {
                            System.out.println("Saldo insuficiente.");
                        } else {
                            saldo -= valorARetirar;
                            System.out.println("El saldo actualizado es: " + saldo + "$");
                        }
                    }
                    
                    //  Option: deposits.
                    case 3 -> {
                        System.out.println("Cuál es el valor que desea depositar?");
                        double valorADepositar = teclado.nextDouble();          //  'Scanner.nextDouble()' method to receive a doubles an input.
                        saldo += valorADepositar;
                        System.out.println("El saldo actualizado es: " + saldo + "$");
                    }
                    
                    //  Option: exit system.
                    case 9 -> {
                        System.out.println("Saliendo del programa... Gracias por utilizar nuestros servicios.");
                    }
                    
                    //  No valid option selected.
                    default -> {
                        System.out.println("Opción NO valida.");
                    }
                    
                }
            }
        }

    }
}
//  EOF.