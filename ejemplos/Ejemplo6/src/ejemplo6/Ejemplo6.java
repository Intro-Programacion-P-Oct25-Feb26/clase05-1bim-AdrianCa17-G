/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo6;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Ejemplo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre;
        String apellido;
        String usuario;
        int edad;
        String parroquia;
        int diaPago;
        double descuento;
        int valorInicial = 25;
        double total;
                
        
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese su apellido: ");
        apellido = entrada.nextLine();
        
        System.out.println("Ingrese su usuario: ");
        usuario = entrada.nextLine();
        
        System.out.println("Ingrese su edad: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        
        System.out.println("Ingrese su parroquia de residencia: ");
        parroquia = entrada.nextLine();
        
        System.out.println("Ingrese el dia que pago su membresia: ");
        diaPago = entrada.nextInt();
        
        if((diaPago <=10) && 
                (parroquia.equals("El Valle") || parroquia.equals("El Sagrario"))){
            
            descuento = 25 * 0.05;
            total = valorInicial - descuento;
            entrada.nextLine();
            
            System.out.println("\nFelicidades, aplicaste a un 5% de descuento en tu membresia\n");
            
            System.out.printf("Recibo del Cliente: \n\nNombre: %s\nApellido: %s\n"
                    + "Usuario: %s\nEdad: %d\nParroquia de residencia: %s\n"
                    + "Dia que pago la membresia: %d\nValor inicial de la "
                    + "membresia: $ %d\nDescuento: $ %.2f\nTotal a pagar: $ %.2f\n\n"
                    + "Gracias por pertenecer a fuerza total"
                    + "", nombre, apellido, usuario,edad, parroquia, diaPago, valorInicial,
                    descuento, total);
        }else{
            
            entrada.nextLine();
            
            System.out.println("\nNo cumples con los requisitos para aplicar a un 5% "
                    + "de descuento en tu membresia\n");
            
            System.out.printf("Recibo del Cliente: \n\nNombre: %s\nApellido: %s\n"
                    + "Usuario: %s\nEdad: %d\nParroquia de residencia: %s\n"
                    + "Dia que pago la membresia: %d\nTotal a pagar: $ %d\n\n"
                    + "Gracias por pertenecer a fuerza total"
                    + "", nombre, apellido, usuario,edad, parroquia, diaPago, valorInicial);
           
            
        }
    }
    }

        
    
