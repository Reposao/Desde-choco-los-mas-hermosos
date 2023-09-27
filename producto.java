public class producto {

    String nombre;
    double precio;
    int cantidadStock;


public producto(String nombre, double precio, int cantidadStock){

    this.nombre= nombre;
    this.precio= precio;
    this.cantidadStock= cantidadStock;
}

public void comprar(int cantidad) {
    if (cantidad>0){ 
    cantidadStock += cantidad;
    System.out.println(cantidad + "unidades de " + nombre + "compradas. stock actual:" + cantidadStock);

} else
    System.out.println("la cantidad debe ser mayor a 0");
} 

public void vender(int cantidad){ 
    if (cantidad>0 && cantidad <= cantidadStock){ 
        cantidadStock-= cantidad;
        System.out.println(cantidad + "unidades de      " + nombre + " vendidas. stock atual:   "+ cantidadStock);
    }else{
        System.out.println("cantidad invalidad");
    }
}

public int cantidadStock(){
    return cantidadStock;
}

 public static void main(String[] args) {
    producto mipProducto= new producto("producto ABC  ",  10,50);
       mipProducto.comprar(20);
       mipProducto.vender(10);
       System.out.println("stock actual: " + mipProducto.cantidadStock());



}




}





















    

