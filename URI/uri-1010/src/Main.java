import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int codPecaA, numPecaA, codPecaB, numPecaB;
		double valorPecaA, valorPecaB, valorPagar;
		
		codPecaA = in.nextInt();
		numPecaA = in.nextInt();
		valorPecaA = in.nextDouble();
		
		codPecaB = in.nextInt();
		numPecaB = in.nextInt();
		valorPecaB = in.nextDouble();
		
		valorPagar = (numPecaB*valorPecaB)+(numPecaA*valorPecaA);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n",valorPagar);
		
		in.close();
	}

}
