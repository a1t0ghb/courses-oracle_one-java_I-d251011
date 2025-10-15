/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package a1t0ghb.courses_oracle_one.course_java_i;

import java.util.Scanner;

/**
 *
 * @author a1t0ghb
 */
public class Lectura {

    public static void main(String[] args) {

        String pelicula;
        int fechaDeLanzamiento;
        double nota;
        
        //  Class to receive input of user from console; INITIALIZATION.
        //  - Use in conjunction with try-with-resources, to AUTOMATICALLY close resources and manage try-cath exceptions. Ref: 'https://www.w3schools.com/java/java_try_catch_resources.asp'.
        try (Scanner teclado = new Scanner(System.in)) {

            System.out.println("Escribe le nombre de tu película favorita: ");
            pelicula = teclado.nextLine();                //  'Scanner.nextLine()' method to receive a String as an input.

            System.out.println("Ahora escribe la fecha de lanzamiento: ");
            fechaDeLanzamiento = teclado.nextInt();       //  'Scanner.nextInt()' method to receive an integer as an input.
            
            System.out.println("Por último, dinos que nota le das a la película: ");
            nota = teclado.nextDouble();                  //  'Scanner.nextDouble()' method to receive a doubles an input.

        }
        
        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(nota);
        
    }

}
// EOF.