package trocaVariaveis;

public class TrocaVariaveis {
	
	public static void main(String[] args) {
		int num01 = 1, num02 = 2, aux;
		
		aux = num01;
		num01 = num02;
		num02 = aux;
		
		TrocaVariaveis troca = new TrocaVariaveis();
		
		System.out.println(num01 + " | " + num02);
		
		num01 = num01^num02;
		num02 = num01^num02;
		num01 = num01^num02;
		
		System.out.println("Sem aux: " + num01 + " | " + num02);
		
	}
}
