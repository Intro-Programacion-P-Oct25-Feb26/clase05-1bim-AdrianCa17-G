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
        double subtotal;
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
        
        System.out.println("Ingrese su parroquia de residencia: ");
        parroquia = entrada.nextLine();
        
        System.out.println("Ingrese el día que pagó su membresia: ");
        diaPago = entrada.nextInt();
        
        if((diaPago <=10) && 
                (parroquia.equals("El Valle") || parroquia.equals("El Sagrario"))){
            subtotal = 25 * 0.5;
            total = valorInicial - subtotal;
            System.out.println("Obtuviste un 5% de descuento en tu membresia");
            System.out.printf("Recibo: /n/nNombre: %s\nApellido: %s\n"
                    + "Usuario: %s\nParroquia de residencia: %s\nEdad:"
                    + "%d\n Dia que pagó la membresia: %d\n Valor inicial de la"
                    + "membresia: %d\nDescuento %f\nTotal a pagar: %f\n\n"
                    + "Gracias por pertenecer a fuerza total"
                    + "", nombre, apellido, usuario, parroquia, diaPago, valorInicial,
                    subtotal, total);
        }else{
           
            
        }
    }
    }

        
    
