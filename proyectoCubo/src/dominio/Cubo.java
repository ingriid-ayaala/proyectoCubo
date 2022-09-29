/*
contienen las propiedades, contructures 
 */
package dominio;

/**
 *
 * @author ingri
 */
public class Cubo {
    //declaro las propiedades de mi cubo 
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
        StringBuilder sb = new StringBuilder();
        sb.append("Cubo{");
        sb.append("alto=").append(alto);
        sb.append(", ancho=").append(ancho);
        sb.append(", profundo=").append(profundo);
        sb.append('}');
        return sb.toString();
    }

    
    
    /*
    public int multiplicacion(int a, int b){
        return a*b;
    }
    */
     public int calcularVolumen(int alt, int anc, int pro ){
         return (alt * anc)*pro;
     }
}
