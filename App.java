import contraseña.java.contraseña;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        contraseña su = new contraseña();

        System.out.println("Ingresa tu nombre:  ");
        String name = sc.next();
        su.setuserName(name);
        System.out.println("Ingresa una contraseña:  ");
        String password = sc.next();
        su.setpassword(password);
        System.out.println("Ingresa otra contraseña:  ");
        String intpassword = sc.next();
        System.out.println(su.authenticate(intpassword));

    }
}