package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data Primeiro = new Data();
		
		Primeiro.Dia = 20;
		Primeiro.Mes = "Novembro";
		Primeiro.Ano = 1993;
		
		System.out.println(Primeiro.obterData());
		
		
		Data Segundo = new Data();
		
		Segundo.Ano = 2050;
		Segundo.Mes = "Fevereiro";
		Segundo.Dia = 22;
		
		System.out.printf(Segundo.obterData());



	}
}
