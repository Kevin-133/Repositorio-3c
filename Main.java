public class Main {
    public static void main(String[] args) {
        Empleado empTiempoCompleto = new EmpleadoTiempoCompleto("1", "Hannah", 2000.0, "Seguro médico");
        empTiempoCompleto.calcularSalario();

        Empleado empPorHoras = new EmpleadoPorHoras("2", "Kevin", 15.0, 120);
        empPorHoras.calcularSalario();

        System.out.println("Salario de tiempo completo: " + empTiempoCompleto.calcularSalario());
        System.out.println("Salario por horas: " + empPorHoras.calcularSalario());
    }
}
