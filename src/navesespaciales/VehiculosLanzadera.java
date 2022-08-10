
package navesespaciales;

//Herencia a traves implements
public class VehiculosLanzadera extends Nave implements MetodoNave{

    public VehiculosLanzadera(String nombre, int peso, String combustible, int anolanzamiento) {
        super(nombre, peso, combustible, anolanzamiento);
    }
        
    @Override
    public void despegar() {      
       System.out.println("La nave "+ nombre +" va de despegar");
       System.out.println("La nave acaba de despegar");
       aterrizar();
    }

    @Override
    public void aterrizar() {
       System.out.println("La nave acaba de aterrizar");
    }
    
}
