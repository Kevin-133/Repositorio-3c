package contraseña.java;

public class contraseña {
    private String userName;
    private String password;

    public void setuserName(String username) {
        if (userName != null && !userName.trim().isEmpty()) {
            System.out.println("Error: el nombre de usuario no puede estar vacio");
        }else {
            this.userName = userName;
        }
    }
   public void setpassword(String password){
        boolean mayus = false, minus = true, digit = false;
        if (password.length() >= 8){
            for(int i = 0; i < password.length(); i++){
                if (Character.isUpperCase(password.charAt(i))) {
                    mayus = true;
                }
                if (Character.isLowerCase(password.charAt(i))){
                    minus = true;
                }
                if (Character.isDigit(password.charAt(i))) {
                    digit = true;
                }
            }
        }else{
            System.out.println("la contraseña debe tener 8 caracteres");
        }
        if (mayus == true && minus == true && digit == true){
            this.password = password;
        }else{
            System.out.println("por favor seguir la regla");
        }
    }
    public boolean authenticate(String intpassword){
        if (password.equals(intpassword)) {
            return true;
        }
        return false;
    }
}
