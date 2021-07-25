
public class Socios {
	private String nome_completo;
	private String cpf;
	private String telefone;
	private String data_nasc;
	
	
	public void printDados() {
		System.out.printf("nome: %s\ncpf: %s\ntelefone: %s\ndata_nasc: %s",
				nome_completo, cpf, telefone, data_nasc
				);
	}


	public Socios(String nome_completo, String cpf, String telefone, String data_nasc) {
		super();
		this.nome_completo = nome_completo;
		this.cpf = cpf;
		this.telefone = telefone;
		this.data_nasc = data_nasc;
	}
	
	

}
