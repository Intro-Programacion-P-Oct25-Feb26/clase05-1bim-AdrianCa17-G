
package ejemplo1;

import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author reroes
 */
public class Ejemplo3 {

    public static void main(String[] args) {
        // Condicionales simplesmain
        Scanner entrada= new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        // Ingresar por teclado el limite de notas
        System.out.println("Ingrese el limite de notas: ");
        double limiteNotas = entrada.nextDouble();
        
        /*
         double promedio;
         System.out.println("Ingrese un valor para analizar");
         promedio = entrada.nextDouble();
        */
        
        System.out.println("Ingrese la nota: ");
        double promedio = entrada.nextDouble();
        
        
        if (promedio >= limiteNotas) {
            System.out.printf("Estudiante aprobado con un "
                    + "promedio: %.2f\n", promedio);
        }

        if (promedio == limiteNotas) {
            System.out.printf("Estudiante aprobado con un "
                    + "promedio: %.2f\n", promedio);
        }

        if (promedio < limiteNotas) {
            System.out.printf("Estudiante aprobado con un "
                    + "promedio: %.2f\n", promedio);
        }
    }

}
