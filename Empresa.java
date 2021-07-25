import java.util.Iterator;

public class Empresa {
	private String nome;
	private String cnpj;
	private String data_inauguracao;
	public Socios[] lista_socios; //nome de todos os donos de sede + filiais
	public Filiais[] lista_filiais;
	public Sede sede;
	
	
	public double getFaturamentoFiliais() {
		// faturamento da sede + faturamento das filiais;
		double soma = 0;
		int n = lista_filiais.length;
	
		for(int i = 0; i < n; i++) {
			soma += lista_filiais[i].getFaturamento();	
		}
		
		return soma;
	}
	
	public double getFaturamentoTotal() {
		
		return sede.getFaturamento() + getFaturamentoFiliais();
		
	}
	


	public double[] getFaturamentoPorFilial() {
		int n = lista_filiais.length;
		double[] gastos = new double[n];
		
		for(int i = 0; i < n; i++) {
			gastos[i] = lista_filiais[i].getFaturamento();
		}
		return gastos;
	}
	
	
	public int getMaxIndex(double[] t) {
		double valor_max = t[0];
		int index = 0;
		
		for (int i=1; i < t.length; i++) {
	        if (t[i] > valor_max) {
	            valor_max = t[i];
	            index = i;
	        }
	    }
	    return index; // retorna a posicao em que estará o maior valor dentro do vetor
		
	}
	
	public int getMinIndex(double[] t) {
		double valor_min = t[0];
		int index = 0;
		
		for (int i=1; i < t.length; i++) {
	        if (t[i] < valor_min) {
	            valor_min = t[i];
	            index = i;// new maximum
	        }
	    }
	    return index; // retorna a posicao em que estará o menor valor dentro do vetor
		
	}
	
	
	public Filiais getFilialMaiorGasto() {
		int index = getMaxIndex(getFaturamentoPorFilial()); // vai achar a posiçao do maior valor de faturamento da filial
		return lista_filiais[index];
	}
	
	
	public void getCodigoFilialMaiorGasto() { 
		getFilialMaiorGasto().imprimirDados();
	}
	
	
	
	public Filiais getFilialMenorGasto() {
		int index = getMinIndex(getFaturamentoPorFilial()); // vai achar a posiçao do maior valor de faturamento da filial
		return lista_filiais[index];
	}
	
	public void getCodigoFilialMenorGasto() { 
		getFilialMenorGasto().imprimirDados();
	}
	
	
	
	
	public double getSalarioUnidades() {
		double soma = sede.getSomaSalario();
		for (int i = 0; i < lista_filiais.length; i++) {
			soma += lista_filiais[i].getSomaSalario();
		}
		return soma;	
	}
	
	public double getMediaSalario() {
		return getSalarioUnidades() / (1 + lista_filiais.length);
	}
	
	
	public double getBalancoAnual() {
		return getFaturamentoTotal() - getSalarioUnidades();
	}
	
	
	public Socios[] getDadosSocios() {
		if (getBalancoAnual() < 0) {
			printDadosSocios();
			return lista_socios;
		} else {
			return null;
		} 
	}
	
	
	public void printDadosSocios() {
		for (int i = 0; i < lista_socios.length; i++) {
			lista_socios[i].printDados();
		}
	}

	public Empresa(String nome, String cnpj, String data_inauguracao, Socios[] lista_socios, Filiais[] lista_filiais,
			Sede sede) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.data_inauguracao = data_inauguracao;
		this.lista_socios = lista_socios;
		this.lista_filiais = lista_filiais;
		this.sede = sede;
	}
	
	
	
	
}
