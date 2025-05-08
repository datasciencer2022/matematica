package pacote;

public class Calculos {

	public int maior(int a, int b) {
		int resp = 0;
		if (a > b) {
			resp = a;
		}
		if (a < b) {
			resp = b;
		}
		return resp;
	}
	
	// verificacao se par ou impar
	// true é par e false é impar
	public boolean verifica(int num) {
		boolean resp = false;
		if (num % 2 == 0) {
			resp = true;
		}
		return resp;
	}
	
	
	// verificacao se eh primo
		// true eh primo e false não eh
		public boolean ehPrimo (int num) {
			boolean resp = false;  int cont = 0;
			for (int i=num; i>0 ; i--) {
				if (num % i == 0) {
					cont++;
				}
			}
			if (cont == 2) {
				resp = true;
			}
			return resp;
		}
}
	
	
	
	
	
	
	public int somar(int a, int b) {
		int resp = 0;
		// implementar aqui
		return resp;
	}

	public double resolve1grau(double a, double b) {
		double resp = 0;
		// implementar aqui
		return resp;
	}
}
