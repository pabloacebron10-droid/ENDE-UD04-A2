package figuras;

import java.util.Scanner;
import java.awt.Color;

public class PruebaFigura {
    private static int opcion;
    private static final String AREA = "El área es ";
    private static final String PERIMETRO = "El perímetro es ";

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        do {
            opcion = mostrarMenu();
            if (opcion != 4) {
                System.out.print("Introduzca la coordenada x del centro: ");
                double x = teclado.nextDouble();
                System.out.print("Introduzca la coordenada y del centro: ");
                double y = teclado.nextDouble();
                switch (opcion) {
                    case 1:
                        triangulo(teclado, x, y);
                        break;
                    case 2:
                        rectangulo(teclado, x, y);
                        break;
                    case 3:
                        cuadrado(teclado, x, y);
                        break;
                }
            }
        } while (opcion != 4);
        teclado.close();
    }

    private static void cuadrado(Scanner teclado, double x, double y) {
        System.out.print("Introduzca el lado del cuadrado: ");
        double lado = teclado.nextDouble();
        Cuadrado c = new Cuadrado(x, y, Color.red, lado);
        System.out.println(PERIMETRO + c.perimetro());
        System.out.println(AREA + c.area());
    }

    private static void rectangulo(Scanner teclado, double x, double y) {
        System.out.print("Introduzca la base del rectángulo: ");
        double base = teclado.nextDouble();
        System.out.print("Introduzca la altura del rectángulo: ");
        double altura = teclado.nextDouble();
        Rectangulo r = new Rectangulo(x, y, Color.red, base, altura);
        System.out.println(PERIMETRO + r.perimetro());
        System.out.println(AREA + r.area());
    }

    private static void triangulo(Scanner teclado, double x, double y) {
        System.out.print("Introduzca el lado 1 del triángulo: ");
        double lado1 = teclado.nextDouble();
        System.out.print("Introduzca el lado 2 del triángulo: ");
        double lado2 = teclado.nextDouble();
        System.out.print("Introduzca el lado 3 del triángulo: ");
        double lado3 = teclado.nextDouble();
        Triangulo t = new Triangulo(x, y, Color.red, lado1, lado2, lado3);
        System.out.println(PERIMETRO + t.perimetro());
        System.out.println(AREA + t.area());
    }

    public static int mostrarMenu() {
        int opción;
        System.out.println("1) Triángulo");
        System.out.println("2) Rectángulo");
        System.out.println("3) Cuadrado");
        System.out.println("4) Salir");
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Introduzca una opción (1-4): ");
            opción = teclado.nextInt();
            if (opción < 1 || opción > 4)
                System.out.println("Debe introducir un número entre 1 y 4");
        } while (opción < 1 || opción > 4);
        return opción;
    }
}