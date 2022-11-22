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
public class Velero extends Barco {

    private int numeroMastiles;

    public Velero(int numeroMastiles, String matricula, double eslora, String modelo,
            String nombre, String DNI, Date fechaInicio, Date fechaTerminacion, double modulo) {
        super(matricula, eslora, modelo, nombre, DNI, fechaInicio, fechaTerminacion, modulo);
        this.numeroMastiles = numeroMastiles;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    public void crearVelero() {

        System.out.println("VELERO");
        super.crearBarco();
        super.crearUsuario();

        System.out.println("Ingrese numero de mastiles");
        numeroMastiles = leer.nextInt();

        Velero velero = new Velero(numeroMastiles, matricula, eslora, modelo, nombre, DNI, fechaInicio, fechaTerminacion, modulo);

    }
    
    

    @Override
    public double Alquiler() {

        return (super.modulo() + numeroMastiles) * super.duracionAlquiler();

    }

    @Override
    public String toString() {
        return """
               Velero
               """ + super.toString() + "\n numeroMastiles=  " + numeroMastiles + '}';
    }

}
