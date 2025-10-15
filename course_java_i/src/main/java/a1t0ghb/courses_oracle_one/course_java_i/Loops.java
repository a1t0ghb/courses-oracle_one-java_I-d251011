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
public class Loops {

    public static void main(String[] args) {

        double nota;
        double mediaEvaluaciones = 0;
        
        //  Class to receive input of user from console; INITIALIZATION.
        //  - Use in conjunction with try-with-resources, to AUTOMATICALLY close resources and manage try-cath exceptions. Ref: 'https://www.w3schools.com/java/java_try_catch_resources.asp'.
        try (Scanner teclado = new Scanner(System.in)) {

            for (int i = 0; i < 3; i++) {

                System.out.println("Escribe la nota que le darías  la película Matrix: ");
                nota = teclado.nextDouble();                //  'Scanner.nextDouble()' method to receive a doubles an input.
                mediaEvaluaciones += nota;                  //  Adds 'nota' to 'mediaEvaluaciones'; equivalent to 'mediaEvaluaciones = mediaEvaluaciones + nota;'

            }

            //  Prints MANUAL calculation of average (dividing by 3) of 'mediaEvaluaciones'.
            System.out.println("La media de evaluaciones para Matrix es: " + (mediaEvaluaciones / 3));

        }

    }

}
// EOF.