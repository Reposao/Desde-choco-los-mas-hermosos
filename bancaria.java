public class bancaria{
    String titular;
    double balance;
    
public bancaria (String titular, double balanceInicial){

    this.titular=titular;
    this.balance=balanceInicial;

}   


public void depositar(double cantidad){
    if (cantidad>0){
        balance +=cantidad;
        System.out.println("deposito extitoso:" + balance);
    }
}

public void retirar(double cantidad){
    if(cantidad<=balance){
        balance-=cantidad;
    }else{
        System.out.println("no tiene suficiente saldo");
    }
}
 
public String obtenerbalance() {
    return "balance";
}

 public static void main(String[] args) {
    
   bancaria Cuenta= new bancaria("jeronimo", 10.000);

    Cuenta.depositar(88000);
    Cuenta.retirar(45000);
   
    System.out.println("saldo actual: " + Cuenta.obtenerbalance());



}


}
