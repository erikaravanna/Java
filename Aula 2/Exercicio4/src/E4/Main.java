package E4;

public class Main {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    System.out.print("Digite o nome do cliente: ");
	    String nome = input.nextLine();

	    System.out.print("Digite o CPF do cliente: ");
	    String cpf = input.nextLine();

	    Cliente cliente = new Cliente(nome, cpf);

	    System.out.println("Dados do cliente:");
	    System.out.println("Nome: " + cliente.getNome());
	    System.out.println("Idade: " + cliente.getIdade());
	    System.out.println("CPF: " + cliente.getCpf());

	    System.out.print("Digite a nova idade do cliente: ");
	    int idade = input.nextInt();
	    cliente.setIdade(idade);

	    System.out.println("Dados atualizados do cliente:");
	    System.out.println("Nome: " + cliente.getNome());
	    System.out.println("Idade: " + cliente.getIdade());
	    System.out.println("CPF: " + cliente.getCpf());
	  }
}
