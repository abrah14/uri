import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    double a, b, c, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, 
            areaRetangulo;

    Scanner in = new Scanner(System.in);

    a = in.nextDouble();
    b = in.nextDouble();
    c = in.nextDouble();

    areaTriangulo = (a * c)/2;
    areaCirculo = 3.14159 * (c * c);
    areaTrapezio = ((a + b) * c) / 2;
    areaQuadrado = b * b;
    areaRetangulo = a * b;

    System.out.println(String.format("TRIANGULO: %.3f", areaTriangulo));
    System.out.println(String.format("CIRCULO: %.3f", areaCirculo));
    System.out.println(String.format("TRAPEZIO: %.3f", areaTrapezio));
    System.out.println(String.format("QUADRADO: %.3f", areaQuadrado));
    System.out.println(String.format("RETANGULO: %.3f", areaRetangulo));

  }
}
