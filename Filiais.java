
public class Filiais extends Unidade {


	
	
	public Filiais(String responsavel, double faturamento, String endereco, int codigo, String data_inaug,
			Colaboradores[] lista_colaboradores) {
		super(responsavel, faturamento, endereco, codigo, data_inaug, lista_colaboradores);
		// TODO Auto-generated constructor stub
	}

	public void imprimirDados() { 
		System.out.println(codigo);
	}
	

}
