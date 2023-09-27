public class libro {
    String titulo;
    String autor;
    int añoDePublicacion;
    int numeroDePaginas;
    boolean prestado;

    // Constructor
    public libro(String titulo, String autor, int añoDePublicacion, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoDePublicacion = añoDePublicacion;
        this.numeroDePaginas = numeroDePaginas;
        this.prestado = false;
    }

    // Resto de los métodos
    public String obtenerDescripcion() {
        return "Título: " + titulo + "\nAutor: " + autor + "\nAño de Publicación: " +
               añoDePublicacion + "\nNúmero de Páginas: " + numeroDePaginas;
    }

    public void marcarComoPrestado() {
        this.prestado = true;
    }

    public void marcarComoDevuelto() {
        this.prestado = false;
    }

    public boolean estaPrestado() {
        return prestado;
    }
}
