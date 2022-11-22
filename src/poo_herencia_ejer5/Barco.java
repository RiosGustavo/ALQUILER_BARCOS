/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_herencia_ejer5;

import java.util.Date;

/**
 *
 * @author User
 */
public abstract class Barco extends Amarradero {

    protected String matricula;
    protected double eslora;
    protected String modelo;
    protected double modulo;

    public Barco(String matricula, double eslora, String modelo, String nombre,
            String DNI, Date fechaInicio, Date fechaTerminacion, double modulo) {
        super(nombre, DNI, fechaInicio, fechaTerminacion);
        this.matricula = matricula;
        this.eslora = eslora;
        this.modelo = modelo;
        this.modulo = modulo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getModulo() {
        return modulo;
    }

    public void setModulo(double modulo) {
        this.modulo = modulo;
    }

    public void crearBarco() {

        System.out.println("Ingrese Matricula Velero");
        matricula = leer.next();

        System.out.println("Ingrese modelo");
        modelo = leer.next();

        System.out.println("Ingrese eslora en Metros");
        eslora = leer.nextDouble();

    }
    
    
public double modulo(){
    modulo = 10 * eslora;
     System.out.println("el modulo es: "+ modulo);
        return modulo;
    
}
    
    @Override
    public double Alquiler( ) {
        
        
       
        return modulo * super.duracionAlquiler();

    }

    @Override
    public String toString() {
        return """
               Barco
               matricula=""" + matricula + "\n eslora=" + eslora + "\n modelo=" + modelo;
    }

}
