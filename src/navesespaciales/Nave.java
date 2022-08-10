
package navesespaciales;

public abstract class  Nave {
    public String nombre;
    public int peso;
    public String combustible;
    public int anolanzamiento;
    
//Constructores de la clase
    public Nave(String nombre, int peso, String combustible, int anolanzamiento) {
        this.nombre = nombre;
        this.peso = peso;
        this.combustible = combustible;
        this.anolanzamiento = anolanzamiento;
    }
 
}
