
public class Unidade {
	
	protected String responsavel;
	public double faturamento;
	protected String endereco;
	protected int codigo;
	protected String data_inaug;
	protected Colaboradores[] lista_colaboradores;
	
	
	public Unidade(String responsavel, double faturamento, String endereco, int codigo, String data_inaug,
			Colaboradores[] lista_colaboradores) {
		super();
		this.responsavel = responsavel;
		this.faturamento = faturamento;
		this.endereco = endereco;
		this.codigo = codigo;
		this.data_inaug = data_inaug;
		this.lista_colaboradores = lista_colaboradores;
	}



	public double getFaturamento() {
		return faturamento;
	}
	
	
	
	public double getSomaSalario() {
		double soma = 0;
		int n = lista_colaboradores.length;
	
		for(int i = 0; i < n; i++) {
			soma += lista_colaboradores[i].getSalario();	
		}
		
		return soma;
		
	}

}
