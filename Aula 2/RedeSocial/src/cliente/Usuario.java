package cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
	private String nome,email,nacionalidade;
	private ArrayList<String> postagens;
	private int pontuacao;
	private int quantidadeDePostagens;
	
	public Usuario(String nome,String email,String nacionalidade) {
		setNome(nome);
		setEmail(email);
		setNacionalidade(nacionalidade);
		setQuantidadeDePostagens(postagens);
		setPontuacao(pontuacao);
		
		this.postagens = new ArrayList<String>();
		this.quantidadeDePostagens = 0;
		this.pontuacao = 0;
	}

	private void setPontuacao(int pontuacao2) {	
	}

	private void setQuantidadeDePostagens(ArrayList<String> postagens2) {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public void adicionaPostagem(String postagem) {
		this.postagens.add(postagem);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Digite o nome do usuário: ");
	    String nome = scanner.nextLine();
	    System.out.println("Digite o email do usuário: ");
	    String email = scanner.nextLine();
	    System.out.println("Digite a nacionalidade do usuário: ");
	    String nacionalidade = scanner.nextLine();
	    
	    Usuario usuario = new Usuario(nome, email, nacionalidade);
	    
	    System.out.println("Digite algumas postagens: ");
	    String postagem = scanner.nextLine();
	    usuario.adicionaPostagem(postagem);
	    
	    System.out.println("Postagens adicionadas com sucesso!");
	}

}


