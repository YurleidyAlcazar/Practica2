
package navesespaciales;


public class NavesTripuladas extends Nave implements MetodoNave {
   
    public NavesTripuladas(String nombre, int peso, String combustible, int anolanzamiento) {
        super(nombre, peso, combustible, anolanzamiento);
    }
    @Override
    public void despegar() {
        System.out.println("La nave: "+ nombre+ " pesa "+ peso);
        System.out.println("La nave acaba de despegar");
    }

    @Override
    public void aterrizar() {
       System.out.println("La nave acaba de aterrizar");   
    }

  }
