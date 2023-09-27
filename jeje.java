public class jeje {
    String titulo;
    String autor;
    int numeropag;
         //constructor 
    jeje( String titulo, String autor, int numeropag) {

        this.titulo = titulo;
        this.autor=autor;
        this.numeropag = numeropag;

    }
     
    public String resumen() {
        return " titulo:    " + titulo  + "  autor:   " + autor + "   numeropag:    " + numeropag;

    }
 
    public static void main(String[] args) {

    jeje milibro= new jeje ("valentina mi novia la mas linda", "jeronimo guzman", 180);  
         
    System.out.println(milibro.resumen());
     }



}
