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
public class Yate extends Barco {

    private double potencia;
    private int camarotes;

    public Yate(double potencia, int camarotes, String matricula, double eslora,
            String modelo, String nombre, String DNI, Date fechaInicio, Date fechaTerminacion, double modulo) {
        super(matricula, eslora, modelo, nombre, DNI, fechaInicio, fechaTerminacion, modulo);
        this.potencia = potencia;
        this.camarotes = camarotes;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    public void crearYate() {
        System.out.println("YATE");

        
        super.crearBarco();
        super.crearUsuario();
       
        

       

        System.out.println("Ingrese potencia ");
        potencia = leer.nextDouble();

        System.out.println("Ingrese numero de camarotes ");
        camarotes = leer.nextInt();

        Yate yate = new Yate(potencia, camarotes, matricula, eslora, modelo, nombre, DNI, fechaInicio, fechaTerminacion, modulo);

    }

    @Override
    public double Alquiler() {

        return (super.modulo() + potencia + camarotes) * super.duracionAlquiler();

    }

    @Override
    public String toString() {
        return """
               Yate{
               """ + super.toString() + "\n potencia=  " + potencia + "\n camarotes=" + camarotes + '}';
    }

}
