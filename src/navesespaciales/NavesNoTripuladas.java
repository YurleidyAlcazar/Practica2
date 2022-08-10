
package navesespaciales;

public class NavesNoTripuladas extends Nave implements MetodoNave {
   
    public NavesNoTripuladas(String nombre, int peso, String combustible, int anolanzamiento) {
        super(nombre, peso, combustible, anolanzamiento);
    }
    
    @Override
    public void despegar() {  
       if(anolanzamiento == anolanzamiento){
           aterrizar();
       }       
    }

    @Override
    public void aterrizar() {
        System.out.println("La nave va aterrizar porque fue lanzada en el año "+anolanzamiento);
}
    
}