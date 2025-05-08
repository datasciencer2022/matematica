package pacote;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Pensando na equação "
				+ " ax + b = 0");
		System.out.println("Digite o valor de a:");
		double a = ler.nextDouble();
		System.out.println("Digite o valor de b:");
		double b = ler.nextDouble();
		Calculos calc = new Calculos();
		double x = calc.resolve1grau(a, b);
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("x = " + df.format(x));
	}
}
