import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double distanciaPer, totalGasto, media;

        Scanner in = new Scanner(System.in);

        distanciaPer = in.nextDouble();
        totalGasto = in.nextDouble();

        media = (distanciaPer / totalGasto) * 1000;

        System.out.println(String.format(" %.3f km/l", media));
        //System.out.println(media + " km/l");
    }
}