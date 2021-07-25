
public class Colaboradores {
	private String matricula;
	private String nome_completo;
	private double salario_anual;
	private String codigo;

	public double getSalario() {
		return salario_anual;
	}

	public Colaboradores(String matricula, String nome_completo, double salario_anual, String codigo) {
		super();
		this.matricula = matricula;
		this.nome_completo = nome_completo;
		this.salario_anual = salario_anual;
		this.codigo = codigo;
	}
	
	
	
}
