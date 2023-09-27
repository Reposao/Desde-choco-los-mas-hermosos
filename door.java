public class door{
   boolean abierta;

public door(){

    abierta=false;
}

public void abrir(){

    abierta=true;
}


public void cerrar (){
    abierta=false;
}

public void mostrarEstado(){
    if(abierta){
        System.out.println("la puerta esta abierta");
    } else{
        System.out.println("la puerta esta cerrada");
    }

}

public static void main(String[] args){
    door puelta=new door();
}

  
}
