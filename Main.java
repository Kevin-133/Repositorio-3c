import Model.Equilateral;
import Model.FigureAbs;
import Model.Rectangle;


public class Main {
    public static void main(String[] args) throws Exception {


        FigureAbs equilateral = new Equilateral(20, 10, 10);
        FigureAbs rectangle = new Rectangle(10, 10, 10, 10, 10);

        FigureAbs[] figures = {equilateral, rectangle};

        for (FigureAbs figureAbs : figures) {
            System.out.println("La clase es: " + figureAbs.getClass().getSimpleName());
            System.out.println("El area es: " + figureAbs.getArea());
            System.out.println("El perimetro es: " + figureAbs.getPerimeter());
            System.out.println("----------------------------------------------------");
        }

    }
}