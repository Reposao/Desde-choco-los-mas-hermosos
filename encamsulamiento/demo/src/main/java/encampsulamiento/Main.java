package encampsulamiento;

public class Main {
    public static void main(String[] args) {
     persona  persona= new persona("tocineta", 5000, false);

     System.out.println("persona:"+persona);
     persona.setNombre("papajhon");
     persona.setSueldo(3000);
     persona.setEliminado(true);

     System.out.println("persona:"+ persona);




    }
    

}