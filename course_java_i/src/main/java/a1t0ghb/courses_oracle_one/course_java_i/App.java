/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 *  Path of 'package' corresponds to folder tree all the way down to CURRENT file, starting at base level of '<PROJECT_NAME>/src/main/java'.
 *  - Ref.: 'https://medium.com/@pvprasanth474/understanding-the-maven-directory-structure-a-simple-guide-7c7d636ec614'.
 */
package a1t0ghb.courses_oracle_one.course_java_i;

/**
 *
 * @author a1t0ghb
 * IMPORTANT: class name SAME as filename.
 */
public class App {

    public String getGreeting() {
        return "Bienvenido(a) a Screen Match.";
    }

    public static void main(String[] args) {

        System.out.println(new App().getGreeting());
        System.out.println("Película: Matrix.");

        //  Variables declaration: primitive types, such as int (integer), boolean ('true' or 'false'), double (decimal).
        //  - Recommended notation: camel case; e.g. todayDate.
        int fechaDeLanzamiento = 1999;
        // boolean incluidoEnElPlan = true;
        // double notaDeLaPelicula = 8.2;

        //  As example, add 3 random notes.
        //  Operators: to assign (=), arithmetic such as '+', '-', '*', '/', and '%' as mod.
        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);

        //  Strings are it's own class, not part of 'primitive' types.
        String sinopsis;
        //  Concatenate strings: with '+' sign.
        sinopsis = """
        Matrix es una paradoja.
        La mejor película del fin del milenio.
        Fue lanzada en:
        """ + fechaDeLanzamiento;

        System.out.println(sinopsis);

        //  Casting data types (primitives). Ref: 'https://www.w3schools.com/java/java_type_casting.asp'.
        //  In this case, the narrow casting basically TRUNCATES the integer part; e.g. 3.86666 -> 3.
        int clasificacion = (int) (media / 2);
        System.out.println(clasificacion);

    }

}
// EOF.