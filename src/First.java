/*
 * ¿Preparad@ para aprender o repasar el lenguaje de programación que tú quieras?
 * - Recuerda que todas las instrucciones de participación están en el
 *   repositorio de GitHub.
 *
 * Lo primero... ¿Ya has elegido un lenguaje?
 * - No todos son iguales, pero sus fundamentos suelen ser comunes.
 * - Este primer reto te servirá para familiarizarte con la forma de participar
 *   enviando tus propias soluciones.
 *
 * EJERCICIO:
 * - Crea un comentario en el código y coloca la URL del sitio web oficial del
 *   lenguaje de programación que has seleccionado.
 * - Representa las diferentes sintaxis que existen de crear comentarios
 *   en el lenguaje (en una línea, varias...).
 * - Crea una variable (y una constante si el lenguaje lo soporta).
 * - Crea variables representando todos los tipos de datos primitivos
 *   del lenguaje (cadenas de texto, enteros, booleanos...).
 * - Imprime por terminal el texto: "¡Hola, [y el nombre de tu lenguaje]!"
 *
 * ¿Fácil? No te preocupes, recuerda que esta es una ruta de estudio y
 * debemos comenzar por el principio.
 */

public class First{
    //JAVA 21
    //URL= https://www.oracle.com/java/
    // Este es un comentario
    /*Este tambien es un comentario*/
    /**Este es un comentario de documentacion, por eso su color es verde*/
    String name = "Carlos";

    //variables de datos primitivos
    int num = 1;
    long numl = 111117273838499L;
    double numd = 0.47839223843;
    float numf = 0.84F;
    short nums = 32767;
    byte numb = 127;
    boolean boolt= true;
    boolean boolf= false;
    char one = 'm'; //admite un unico valor

    public static void main(String[] args) {
        String lenguage = "Java";
        String Url = "https://www.oracle.com/java/";
        System.out.println("Hola, este lenguaje es: " + lenguage + "\ny su url es: " + Url);
    }
}