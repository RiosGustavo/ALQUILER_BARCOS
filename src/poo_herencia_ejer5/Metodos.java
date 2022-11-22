/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_herencia_ejer5;

import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Metodos {
        int numeroMastiles, camarotes;
        String modelo,nombre,matricula,DNI;
        Date fechaInicio, fechaTerminacion;
        double modulo, potencia,eslora;

    ArrayList<Amarradero> puerto = new ArrayList();
  
    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public void llenarPuerto() {

        int opt;
        String respuesta;
        do {
            do {
                System.out.println("Bienbenido al Puerto");
                System.out.println("De cual Barco desea conocer el alquiler");
                System.out.println(" 1. Velero");
                System.out.println(" 2. Barco Mortor");
                System.out.println(" 3. Yate Lujo");
                opt = leer.nextInt();
            } while (opt < 1 || opt > 3);

            switch (opt) {
                case 1:
                    llenarVelero();
                    break;
                case 2:
                    llenarBarcoMotor();
                    break;
                case 3:
                    llenarYate();
                    break;
            }

            System.out.println("Desea conocer alquiler de otro Barco");
            System.out.println("s/n");
            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("s"));
    }

    public void llenarVelero() {
        
        
        Velero velero = new Velero(numeroMastiles, matricula, eslora, modelo, nombre, DNI, fechaInicio, fechaTerminacion, modulo);
        velero.crearVelero();
        velero.Alquiler();
        
        puerto.add(velero);

    }
    
    public void llenarBarcoMotor(){
        
        barcoMotor barcoM = new barcoMotor(potencia,  matricula, eslora, modelo, nombre, DNI, fechaInicio, fechaTerminacion, modulo);
        barcoM.crearBarcoMotor();
        barcoM.Alquiler();
        
        puerto.add(barcoM);
    }
    
    
    public void llenarYate(){
        
        Yate yate = new Yate(potencia, camarotes, matricula, eslora, modelo, nombre, DNI, fechaInicio, fechaTerminacion, modulo);
        yate.crearYate();
        yate.Alquiler();
        
        puerto.add(yate);
    }

    public void mostrarBarcos() {

        for (Amarradero barcos : puerto) {
            
           
            
            System.out.println("Informacion "+barcos.toString());
            System.out.println("El Costo del Alquiler es es: " + barcos.Alquiler());
            System.out.println("");

        }
    }

}
