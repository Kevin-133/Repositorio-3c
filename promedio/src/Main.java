import javax.swing.*;
public class Main {


    public static void main(String[] args)  {

        //scoppe

        //System.out.println(1);
        //System.out.println("Hola");
        //System.out.println(4.0);

        String x1 = JOptionPane.showInputDialog("Dame un numero");
        String x2 = JOptionPane.showInputDialog("Dame otro numero");
        String x3 = JOptionPane.showInputDialog("Dame numero tres");
        System.out.println(Integer.parseInt(x1) +  Integer.parseInt(x2) + Integer.parseInt(x3));

        int n1 = Integer.parseInt(x1);
        int n2 = Integer.parseInt(x2);
        int n3 = Integer.parseInt(x3);

        int suma = n1 + n2 + n3;
        double promedio = suma / 3.0;

        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + promedio);

    }
}
