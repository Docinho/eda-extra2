package extra2;

import java.util.Scanner;

class TeoremaMestre {

	public static void main(String[] args) {
		TeoremaMestre tm = new TeoremaMestre();
		Scanner ler = new Scanner(System.in);
		
		System.out.println(tm.metodoAuxiliar(ler.nextLine()));
	}
	private String metodoAuxiliar(String nextLine) {
		String[] s = nextLine.split(" ");
		
		return teorema(Integer.parseInt(s[0]), Integer.parseInt(s[1]), Integer.parseInt(s[2]));
		
		
	}
	private String teorema(int a, int b, int ord) {
		int valorLog = (int) (Math.log10(a) / Math.log10(b));

		int comparacao = Integer.compare(valorLog, ord);
		String resultado = null;
		
		if (valorLog > ord) {
			resultado = "n**" + valorLog;
		}else if (ord > valorLog) {
			resultado = "n**" + ord;
		} else {
			resultado = "n**" + ord + " * log n";
			
		}
		
		return "T(n) = theta(" + resultado + ")";
		}

	}


