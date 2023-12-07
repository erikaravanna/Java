package maiorMenor;

import java.util.Scanner;

public class MaiorMenor {
	
	public static void main(String[] args) {
		int idade, dia, mes, ano, diaAtual, mesAtual, anoAtual ;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a idade : ");
		idade = scanner.nextInt();
		
		if(idade > 17) System.out.println("Maior de idade !!!");
		else System.out.println("Nao eh maior de idade !!!");
		
		System.out.println("Informe o dia de nascimento : ");
		dia = scanner.nextInt();
		
		System.out.println("Informe o mes de nascimento : ");
		mes = scanner.nextInt();
		
		System.out.println("Informe o ano de nascimento : ");
		ano = scanner.nextInt();
		
		System.out.println("Informe o dia atual : ");
		diaAtual = scanner.nextInt();
		
		System.out.println("Informe o mes atual : ");
		mesAtual = scanner.nextInt();
		
		System.out.println("Informe o ano atual : ");
		anoAtual = scanner.nextInt();
		
		idade = anoAtual - ano;
		if(idade == 17) {
			if(mesAtual - mes > 0) idade = 18;
			if(mesAtual - mes == 0) {
				if(diaAtual - dia >= 0) idade = 18;
			}
		}
		
		if(idade > 17) System.out.println("Idade: " + idade + "Maior de idade !!!");
		else System.out.println("Idade: " + idade + "Nao eh maior de idade !!!");
		
		scanner.close();
	}
}
