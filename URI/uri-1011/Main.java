import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double raio, pi = 3.14159, volume;

        Scanner in = new Scanner(System.in);

        raio = in.nextDouble();

        volume = (4/3.0) * pi * (raio*raio*raio);

        System.out.println(String.format("VOLUME = %.3f" , volume));

    }
}