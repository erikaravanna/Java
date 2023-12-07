package estudante;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Estudante {

	private String nome, cpf;
	private Date dataDeNascimento;
	private Scanner scanner;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	void leNome() {
		System.out.println("Informe seu nome: ");
		setNome(scanner.nextLine());
	}
	
	void leCpf() {
		System.out.println("Informe seu cpf: ");
		setCpf(scanner.nextLine());
	}
	
	String leData() {
		String data;
		System.out.println("Insira a sua Data de Nascimento: ");
		data = scanner.nextLine();
		
		return data;
	}
	
	void converteStringToDate(String data) {
		Date dataFormatada = null;
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		try {
			dataFormatada = formato.parse(data); 
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Data invalida tente novamente!!");
			leData();
		}
		this.dataDeNascimento = dataFormatada;
	}
	
	int calculaIdade() {
		Date dataAtual = new Date();
		SimpleDateFormat pegaAnoFormatado = new SimpleDateFormat("yyyy");
	    String anoNascimento = pegaAnoFormatado.format(this.dataDeNascimento);
	    String anoAtual = pegaAnoFormatado.format(dataAtual);
	    
	    int anoDeNascimento = Integer.parseInt(anoNascimento);
	    int ano_Atual = Integer.parseInt(anoAtual);
	    
		return ano_Atual - anoDeNascimento;
	}
	
	void mostrarCliente(){
		System.out.println("Nome: " + getNome());
		System.out.println("Data de Nascimento: " + this.dataDeNascimento);
		System.out.println("Idade: " + calculaIdade() + " anos");
	}
	
	void fechaScanner() {
		this.scanner.close();
	}
	public Estudante() {
		super();
		this.scanner = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		Estudante estudante = new Estudante();
		estudante.leNome();
		estudante.leCpf();
		estudante.converteStringToDate(estudante.leData()); 
		
		estudante.mostrarCliente();
		
		estudante.fechaScanner();
	}
	
}
