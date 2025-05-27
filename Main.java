public class Main {
    public static void main(String[] args) {

        CuentaBancaria miCuenta = new CuentaBancaria("Kevin");


        System.out.println("Titular: " + miCuenta.getTitular());


        miCuenta.depositar(1000);
        System.out.println("Deposito principal 1000");
        System.out.println("Saldo actual: " + miCuenta.getSaldo());


        boolean exito1 = miCuenta.retirar(200);
        System.out.println("Intento retirar 200: " + exito1);
        System.out.println("Saldo actual: " + miCuenta.getSaldo());


        boolean exito2 = miCuenta.retirar(10000);
        System.out.println("Intento retirar 10000: " + exito2);
        System.out.println("Saldo final: " + miCuenta.getSaldo());
    }
}
