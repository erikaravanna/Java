package E4;

public class Cliente {
	private String nome;
	private int idade;
	private String cpf;
	
public Cliente(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
    this.idade = 0;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
