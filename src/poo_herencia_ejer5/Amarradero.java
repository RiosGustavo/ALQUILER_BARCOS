/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poo_herencia_ejer5;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public abstract class Amarradero {

    protected String nombre;
    protected String DNI;
    protected Date fechaInicio;
    protected Date fechaTerminacion;

    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public Amarradero() {
    }

    public Amarradero(String nombre, String DNI, Date fechaInicio, Date fechaTerminacion) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaInicio = fechaInicio;
        this.fechaTerminacion = fechaTerminacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaTerminacion() {
        return fechaTerminacion;
    }

    public void setFechaTerminacion(Date fechaTerminacion) {
        this.fechaTerminacion = fechaTerminacion;
    }

    public void crearUsuario() {

        System.out.println("Ingrese nombre propietario");
        nombre = leer.next();
        System.out.println("Ingrese DNI");
        DNI = leer.next();
        
        System.out.println("Ingrese fecha de inicio del alquiler");
        System.out.println("Ingrese el dia ");
        int dia = leer.nextInt();

        System.out.println("Ingrese el mes ");
        int mes = leer.nextInt();

        System.out.println("Ingrese el año ");
        int anio = leer.nextInt();

        fechaInicio = new Date(anio - 1900, mes - 1, dia);

        System.out.println("Ingrese fecha de finalizacion del alquiler");
        System.out.println("Ingrese el dia ");
        int diaf = leer.nextInt();

        System.out.println("Ingrese el mes ");
        int mesf = leer.nextInt();

        System.out.println("Ingrese el año ");
        int aniof = leer.nextInt();

        fechaTerminacion = new Date(aniof - 1900, mesf - 1, diaf);
        
        

    }

    public double duracionAlquiler() {

        

        System.out.println("Dias de alquier a cobrar son: " + ((fechaTerminacion.getTime() - fechaInicio.getTime())/86400000));

        
        ///int Años =  fechaActual.getYear()- FechaInicio.getYear();
        return (fechaTerminacion.getTime() - fechaInicio.getTime())/86400000;

    }

    public abstract double Alquiler();

    @Override
    public String toString() {
        return """
               Amarradero{
               nombre=""" + nombre + "\n DNI=" + DNI + "\n fechaInicio=" + fechaInicio + "\n fechaTerminacion=" + fechaTerminacion + '}';
    }

}
