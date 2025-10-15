/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package a1t0ghb.courses_oracle_one.course_java_i;

/**
 *
 * @author a1t0ghb
 */
public class Decisiones {

    public static void main(String[] args) {

        int fechaDeLanzamiento = 1999;
        // double notaDeLaPelicula = 8.2;

        //  Condition for showing message according to movie year: recent since 2022, or before.
        if (fechaDeLanzamiento >= 2022) {
            System.out.println("Películas más populares.");
        } else {
            System.out.println("Películas retro que aún vale la pena ver.");
        }

        //  Condition for specific type of streaming: access if conditions for 2 variables allows it.
        boolean incluidoEnElPlan = true;
        String tipoPlan = "plus";
        
        // if (incluidoEnElPlan || tipoPlan.equals("plus"))  //  If header for validating OR conditions.
        if (incluidoEnElPlan && tipoPlan.equals("plus")) {
            System.out.println("Disfrute de su película.");
        } else {
            System.out.println("Película no disponible para su plan actual.");
        }
    }

}
//  EOF.