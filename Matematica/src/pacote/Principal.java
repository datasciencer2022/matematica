package pacote;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		// entrada de dados
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um número:");
		int num1 = ler.nextInt();
		System.out.println("Digite outro número:");
		int num2 = ler.nextInt();
		
		// fazer os cálculos
		String resultado = "";
		Calculos calc = new Calculos();
		int maior = calc.maior(num1, num2);
		if (num1 == num2) {
			resultado = "são iguais";
		}
		else {
			resultado = "o maior é: " + maior;
		}
		// verificar se eh par ou impar
		// verificar se eh primo e exibir se eh ou nao
		
		// exibição do resultado
		System.out.println(resultado);
		
		}
	}
		
		
		
		/*
		int soma = calc.somar(num1,num2);
		System.out.println("Soma: "+soma);
		*/
	
