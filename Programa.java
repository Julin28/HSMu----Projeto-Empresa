

/*
O sistema deve oferecer as seguintes funcionalidades:
1. cálculo do faturamento anual. Se houver filiais, esse faturamento é somado ao da sede;


, que consiste na diferença entre o faturamento anual e a soma dos salários dos colaboradores, mostrando se ele foi positivo ou negativo;


*/




public class Programa {
	
	public static void main(String[] args) {
		
	
	
		Socios theozao = new Socios("theozao", "000.111.222-8", "82038-3213", "01/01/1999");
		Socios yeban = new Socios("yeban", "000.111.322-8", "92038-3213", "01/01/2000");
		Socios[] inimigos_do_benchmark = {theozao, yeban};
		Colaboradores robson = new Colaboradores("1234", "robson", 50, "1234");
		Colaboradores[] lista_colab = {robson};
		Filiais theozaoc = new Filiais("theozao", 25, "rua teste", 12453, "01/01/1999", lista_colab);
		Filiais[] filiais_1 = {theozaoc};
		Sede yebancc = new Sede("yebanc", 10, "rua teste", 126950, "01/01/1999", lista_colab);
		
		
		Empresa yebanc = new Empresa(
				"yebancompany", 
				"331.075.071/0001-3", 
				"25/03/2021", 
				inimigos_do_benchmark, 
				filiais_1, 
				yebancc);
		
		// cálculo do faturamento anual. Se houver filiais, esse faturamento é somado ao da sede
		
		System.out.println(yebanc.getFaturamentoTotal());
		
		//2. a filial com maior e menor faturamento, caso elas existam;
		
		yebanc.getCodigoFilialMaiorGasto();
		
		yebanc.getCodigoFilialMenorGasto();
		
		//3. a média salarial da empresa;
		
		System.out.println(yebanc.getMediaSalario());
		
		
		//4. o balanço anual da empresa
		
		System.out.println(yebanc.getBalancoAnual());
		
		//5. os dados dos sócios cujas empresas tiveram balanço anual negativo.
		
		yebanc.getDadosSocios();
		
		
		
		
	}

}
