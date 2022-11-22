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
public  class barcoMotor extends Barco {
    private double potencia;

    public barcoMotor(double potencia, String matricula, double eslora, String modelo, 
            String nombre, String DNI, Date fechaInicio, Date fechaTerminacion, double modulo) {
        super(matricula, eslora, modelo, nombre, DNI, fechaInicio, fechaTerminacion, modulo);
        this.potencia = potencia;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    
    public void crearBarcoMotor() {
       System.out.println("Barco Motor");
        super.crearBarco();
       super.crearUsuario();
        
        
        
        
        
        System.out.println("Ingrese potencia ");
        potencia = leer.nextDouble();
        
                  
        

        barcoMotor barcoM = new barcoMotor(potencia,  matricula, eslora, modelo, nombre, DNI, fechaInicio, fechaTerminacion, modulo);

    }
    
    @Override
    public double Alquiler(){
        
        
        
        return (super.modulo() + potencia) * super.duracionAlquiler();
        
    }

    @Override
    public String toString() {
        return """
               barcoMotor{
               """+ super.toString()+ "\n potencia= " + potencia + '}';
    }
    
    
    
}
