import java.util.Scanner;
import java.lang.Math;

public class Main {

  public static void main(String[] args) {
    int a, b, c, maiorAb, maiorC;

    Scanner in = new Scanner(System.in);

    a = in.nextInt();
    b = in.nextInt();
    c = in.nextInt();

    maiorAb = (a + b + Math.abs(a-b))/2;

    maiorC = (maiorAb + c + Math.abs(maiorAb-c))/2;
    System.out.println(maiorC + " eh o maior");

  }
}
