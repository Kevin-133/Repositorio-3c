package model;

public class Computadora {
    private String marca;
    private String modelo;
    private boolean encendida;



    public void encender() {
        if (!encendida) {
            encendida = true;
            System.out.println("Encendiendo");
        }else{
            System.out.println("Esta pc esta encendida");
        }
    }

    public void apagar() {
        if (encendida) {
            encendida = false;
            System.out.println("Apagando");
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean getEncendida() {
        return encendida;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
