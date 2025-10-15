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
public class Evaluaciones {

    public static void main(String[] args) {

        double nota = 0;
        double mediaEvaluaciones = 0;
        int totalEvaluaciones = 0;      //  Counter of inputs.
        
        //  Class to receive input of user from console; INITIALIZATION.
        //  - Use in conjunction with try-with-resources, to AUTOMATICALLY close resources and manage try-cath exceptions. Ref: 'https://www.w3schools.com/java/java_try_catch_resources.asp'.
        try (Scanner teclado = new Scanner(System.in)) {

            //  While user keeps inserting notes DIFFERENT than '-1', loop keeps asking for notes.
            while (nota != -1) {

                System.out.println("Escribe la nota que le darías  la película Matrix: ");
                nota = teclado.nextDouble();                //  'Scanner.nextDouble()' method to receive a doubles an input.
                
                //  Since stop condition depends on user input 'nota', if it's '-1' (the condition for exit loop), it shouldn't be considered in the average calculations.
                if (nota != -1) {
                    
                    mediaEvaluaciones += nota;                  //  Adds 'nota' to 'mediaEvaluaciones'; equivalent to 'mediaEvaluaciones = mediaEvaluaciones + nota;'
                    totalEvaluaciones++;

                }

            }

            //  Prints calculation of average (dividing by 'totalEvaluaciones') of 'mediaEvaluaciones'.
            System.out.println("La media de evaluaciones para Matrix es: " + (mediaEvaluaciones / totalEvaluaciones));

        }

    }

}
//  EOF.