/*
 * EJERCICIO:
 * - Muestra ejemplos de creación de todas las estructuras soportadas por defecto
 *   en tu lenguaje.
 * - Utiliza operaciones de inserción, borrado, actualización y ordenación.
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea una agenda de contactos por terminal.
 * - Debes implementar funcionalidades de búsqueda, inserción, actualización
 *   y eliminación de contactos.
 * - Cada contacto debe tener un nombre y un número de teléfono.
 * - El programa solicita en primer lugar cuál es la operación que se quiere realizar,
 *   y a continuación los datos necesarios para llevarla a cabo.
 * - El programa no puede dejar introducir números de teléfono no númericos y con más
 *   de 11 dígitos (o el número de dígitos que quieras).
 * - También se debe proponer una operación de finalización del programa.
 */

import java.util.*;

public class Six_Estructuras_de_datos {
    public static void main(String[] args) {
        Map<String, Long> myDict = new LinkedHashMap<>();

        myDict.put("Carlos", 4242429897L);
        myDict.put("Josh", 4167895673L);
        myDict.put("Randy", 4146578904L);
        myDict.put("Josi", 4123456789L);

        int response = 0;
        do {
            //1. Create contact
            //2. Update contact
            //3. Search contact
            //4. Delete contact

            for (Map.Entry<String, Long> entry : myDict.entrySet()) {
                String clave = entry.getKey();
                Long valor = entry.getValue();
                System.out.println("Nombre: " + clave + "  Tlf: " + valor);
            }

            System.out.println("\n----------------");
            System.out.println("---Contact List:");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Modificar contacto");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Borrar contacto");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());


            switch (response) {
                case 1:
                    System.out.println("::Agregar contacto");
                    System.out.println("Ingrese el nombre que desea agregar: ");
                    String name = sc.nextLine();
                    System.out.println("Ingrese el numero de tlf: [04246789504] 11 digitos");
                    String number = sc.nextLine();
                    while(number.length() != 11) {
                        System.out.println("Ingresa un numero de tlf valido:");
                        number= sc.nextLine();
                    }
                    Long numberL = Long.parseLong(number);
                    myDict.put(name, numberL);
                    System.out.println("Contacto agregado exitosamente\n");
                    break;


                case 2:
                    System.out.println("::Modificar Contacto");
                    System.out.println("Ingrese el nombre del contacto que desee modificar");
                    for (Map.Entry<String, Long> entry : myDict.entrySet()) {
                        String clave = entry.getKey();
                        Long valor = entry.getValue();
                        System.out.println("Nombre: " + clave + "  Tlf: " + valor);
                    }
                    String nameM = sc.nextLine();
                    if(myDict.containsKey(nameM)){
                        System.out.println("Cambiar numero de telefono: formato [04242345678] 11 digitos");
                        Long newNumber = Long.parseLong(sc.nextLine());
                        myDict.put(nameM, newNumber);
                        System.out.println("Contacto actualizado exitosamente");
                        break;
                    }else{
                        System.out.println("Contacto no encontrado\n");
                    }
                    break;


                case 3:
                    System.out.println("::Buscar contacto");
                    System.out.println("Ingresa el nombre del contacto a buscar");
                    String nameS = sc.nextLine();
                    if (myDict.containsKey(nameS)){
                        System.out.println("Nombre: " + nameS + " Tlf: "+myDict.get(nameS)+ "\n");
                    }else {
                        System.out.println("Contacto no encontrado\n");
                    }
                    break;


                case 4:
                    System.out.println("::Eliminar contacto");
                    System.out.println("::Ingresa el nombre del contacto a eliminar");
                    String nameD = sc.nextLine();
                    if (myDict.containsKey(nameD)){
                        myDict.remove(nameD);
                        System.out.println("Contacto eliminado exitosamente\n");
                    }else{
                        System.out.println("Contacto no encontrado\n");
                    }
                    break;



                case 0:
                    break;
                default:
                    System.out.println("Ingrese una opcion valida\n");
            }

        }while(response!=0);
    }
}