/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author ingri
 */
public class Cubo {
    private int alto;
    private int ancho;
    private int profundo;

    public Cubo() {
    }

    public Cubo(int alto, int ancho, int profundo) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getProfundo() {
        return profundo;
    }

    public void setProfundo(int profundo) {
        this.profundo = profundo;
    }

    @Override
    public String toString() {
        return "Cubo{" + "alto=" + alto + ", ancho=" + ancho + ", profundo=" + profundo + '}';
    }
    
    /*
    public int multiplicacion(int a, int b){
        return a*b;
    }
    */
     public int calcularVolumen(int alto, int ancho, int profundo ){
         return (alto * ancho)*profundo;
     }
}
