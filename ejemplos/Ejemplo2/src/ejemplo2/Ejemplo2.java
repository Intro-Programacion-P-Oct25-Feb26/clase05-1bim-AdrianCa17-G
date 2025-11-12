/*
 * Realizar un programa en java que permita determinar
 * si un estudiante ha pasado el ciclo
 * se ingresa el promedio del estudiante
 * - Un estudiante pasa el ciclo si tiene un promedio
 * mayor o igual a 7.5. Si el estudiante aprueba el ciclo, presentar
 * un mensaje como sigue, Estudiante aprobado con un promedio: 8.1 
 * CASO CONTRARIO presentar un mensaje con el siguiente texto, 
 * Estudiante reprobado con un promedio: 7.4 
 */
package ejemplo2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Condicionales compuestos
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); // 10,2 / 10.2
        double promedio;
        String miNombre;
        int edad;
        String ciudadNacimiento;
        System.out.println("Ingrese el nombre por favor: ");
        miNombre = entrada.nextLine();
        System.out.println("Ingrese el promedio por favor: ");
        promedio = entrada.nextDouble();
        System.out.println("Ingrese su edad por favor: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad de nacimiento: ");
        ciudadNacimiento = entrada.nextLine();

        if (promedio >= 7.5) {
            System.out.printf("\nEstudiante %s\nAprobado con un promedio de: %.2f\n"
                    + "Edad: %d\nCiudad de nacimiento: %s\n", 
                    miNombre, promedio, edad, ciudadNacimiento);
        }else{
            System.out.printf("\nEstudiante: %s\nReprobado con un promedio de: %.2f\n"
                    + "Edad: %d\nCiudad de nacimiento: %s\n", 
                    miNombre, promedio, edad, ciudadNacimiento);
        }
    }
    
}
