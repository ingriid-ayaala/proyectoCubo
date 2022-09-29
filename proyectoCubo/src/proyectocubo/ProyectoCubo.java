/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectocubo;

import dominio.Cubo;

/**
 *
 * @author ingri
 */
public class ProyectoCubo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code applicati
        Cubo cubo1 = new Cubo(12,12,12);
        
        int res = cubo1.calcularVolumen(cubo1.getAlto(),cubo1.getAncho(),cubo1.getProfundo());
        
        System.out.println("El  resultado de mi cubo es = "+ res);
    }
    
}
