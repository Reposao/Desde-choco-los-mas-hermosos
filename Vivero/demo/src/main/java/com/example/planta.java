package Vivero.demo.src.main.java.com.example;

public class planta {
    private String nombreComun;
    private String nombreCientifico;
    private String tipo;
    private String requerimentoLuz;
    private String requerimentosAgua;
    private String otrosCuidados;

    

public planta(String nombreComun, String nombreCientifico, String tipo, String requerimentosLuz,String requerimentosAgua, String otrosCuidados){

    this.nombreComun=nombreComun;
    this.nombreCientifico=nombreCientifico;
    this.tipo=tipo;
    this.requerimentoLuz=requerimentosLuz;
    this.requerimentosAgua= requerimentosAgua;
    this.otrosCuidados=otrosCuidados;
}


public String getNombreCientifico() {
    return nombreCientifico;
}
public void setNombreCientifico(String nombreCientifico) {
    this.nombreCientifico = nombreCientifico;
}

public String getNombreComun() {
    return nombreComun;
}
public void setNombreComun(String nombreComun) {
    this.nombreComun = nombreComun;
}

public String getOtrosCuidados() {
    return otrosCuidados;
}
public void setOtrosCuidados(String otrosCuidados) {
    this.otrosCuidados = otrosCuidados;
}

public String getRequerimentoLuz() {
    return requerimentoLuz;
}
public void setRequerimentoLuz(String requerimentoLuz) {
    this.requerimentoLuz = requerimentoLuz;
}

public String getRequerimentosAgua() {
    return requerimentosAgua;
}
public void setRequerimentosAgua(String requerimentosAgua) {
    this.requerimentosAgua = requerimentosAgua;
}

public String getTipo() {
    return tipo;
}
public void setTipo(String tipo) {
    this.tipo = tipo;
}





















}
