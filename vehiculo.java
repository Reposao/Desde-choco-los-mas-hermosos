public class vehiculo {
    String marca;
    String modelo;
    int año;

    //constructor

    vehiculo(String marca, String modelo,int año){
          
        this.marca= marca;
        this.año=año;
        this.modelo=modelo;
    }

    public String Informacion(){
       return " marca:    " + marca  + "  modelo:   " + modelo + "   año:    " + año;
    }

    public static void main(String[] args) {
        vehiculo mivehiculo= new vehiculo( "toyota",  "txl", 2060);
        System.out.println(mivehiculo.Informacion());
    }



}
