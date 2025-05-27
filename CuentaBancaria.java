public class CuentaBancaria {


    private String titular;
    private double saldo;


    public CuentaBancaria(String nombre) {
        this.titular = nombre;
    }


    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo = saldo + monto;
        }
    }


    public boolean retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            this.saldo = saldo - monto;
            return true;
        } else {
            return false;
        }
    }


    public double getSaldo() {
        return saldo;
    }


    public String getTitular() {
        return titular;
    }


    public void setTitular(String nuevoNombre) {
        titular = nuevoNombre;
    }
}




