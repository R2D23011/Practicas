/*
 * EJERCICIO:
 * - Crea ejemplos utilizando todos los tipos de operadores de tu lenguaje:
 *   Aritméticos, lógicos, de comparación, asignación, identidad, pertenencia, bits...
 *   (Ten en cuenta que cada lenguaje puede poseer unos diferentes)
 * - Utilizando las operaciones con operadores que tú quieras, crea ejemplos
 *   que representen todos los tipos de estructuras de control que existan
 *   en tu lenguaje:
 *   Condicionales, iterativas, excepciones...
 * - Debes hacer print por consola del resultado de todos los ejemplos.
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea un programa que imprima por consola todos los números comprendidos
 * entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.
 *
 * Seguro que al revisar detenidamente las posibilidades has descubierto algo nuevo.
 */

import java.net.Socket;

public class Second {
    public static void main(String[] args) {
        //operadores aritmeticos
        System.out.println("Suma 10 + 1 = " + 10 + 1);
        System.out.println("Resta 10 - 1 = " + 10 + -1);
        System.out.println("Multiplicacion 10 * 2 = " + 10 * 2);
        System.out.println("Division 10 / 2 = " + 10 / 2);
        System.out.println("Modulo 10 % 3 = " + 10 % 3);
        System.out.println("Elevado 10 ^ 3 = " + Math.pow(10,3));
        System.out.println("Division Entera 10 // 3 = " + Math.divideExact(20, 3));
        double twenty = 20;
        double three = 3;
        System.out.println("Division Exacta con Decimales  20 / 3 = " + (twenty/three));

        saltoDeLinea();
        //Operadores de Comparacion
        System.out.println("Igualdad 10 es igual a 10 = " + (10 == 10));
        System.out.println("10 mayor que 5 = " + (10 > 5));
        System.out.println("10 menor que 5 = " + (10 < 5));
        System.out.println("10 mayor o igual que 9 = " + (10 >= 5));
        System.out.println("10 menor o igual que 10 = " + (10 <= 5));
        System.out.println("Desigualdad 3 es diferente de 3 = " + (3 != 3));

        saltoDeLinea();
        //Operadores logicos
        boolean oper1 = 4 + 3 == 7;
        boolean oper2 = 7 - 5 == 4;
        if (oper1 && !oper2){
            System.out.println("Operador AND &&");
        }
        if (oper1 || oper2){
            System.out.println("Operador OR ||");
        }
        if (!oper2){
            System.out.println("Operador NOT !");
        }

        saltoDeLinea();
        //Operadores de asignacion
        var my_number = 1;
        System.out.println(my_number);
        my_number += 1;
        System.out.println(my_number);
        my_number -= 1;
        System.out.println(my_number);
        my_number *= 10;
        System.out.println(my_number);
        my_number /= 2;
        System.out.println(my_number);
        my_number %= 3;
        System.out.println(my_number);

        saltoDeLinea();
        //Operadores condicionales
        var my_name = "Carlos";

        if (my_name == "Arturo"){
            System.out.println("Mi nombre es Arturo");
        } else if (my_name == "Carlos") {
            System.out.println("Mi nombre es Carlos");
        }else{
            System.out.println("Mi nombre no es ni Carlos ni Arturo");
        }

        saltoDeLinea();
        //Iterativos
        for (int i = 0; i <= 10 ; i++) {
            System.out.println(i);
        }

        saltoDeLinea();
        int i=0;
        do {
            System.out.println(i++);;
        }while (i <= 6);

        saltoDeLinea();
        try {
            System.out.println(10/0);
        }catch (RuntimeException exception){
            System.out.println("Se ha producido un error");
        }finally {
            System.out.println("Ha finalizado el manejo de excepciones");
        }

        saltoDeLinea();
        /*EXTRA
        * Crea un programa que imprima por consola todos los números comprendidos
        * entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.
        * Seguro que al revisar detenidamente las posibilidades has descubierto algo nuevo.
        */
        for (int j = 10; j <= 55; j++) {
            if(j == 16){
                continue;
            } else if (j % 3 == 0) {
                continue;
            }
            System.out.println(j);
        }
    }

    public static void saltoDeLinea(){
        System.out.println();
        System.out.println();
    }
}

