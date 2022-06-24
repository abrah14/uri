import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String nome;
		double salarioFixo, comissao,montante, vendas;
		
		nome = in.nextLine();
		salarioFixo = in.nextDouble();
		vendas = in.nextDouble();
		comissao = (vendas*15)/100;
		montante = salarioFixo+comissao;
		
		System.out.println(String.format("TOTAL = R$ %.2f" , montante));
		
		in.close();
		
	}

}
