package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data Primeiro = new Data();
		
		Primeiro.Dia = 20;
		Primeiro.Mes = "Novembro";
		Primeiro.Ano = 1993;
		
		System.out.printf("%d/%s/%d%n", Primeiro.Dia, Primeiro.Mes, Primeiro.Ano);
		
		
		Data Segundo = new Data();
		
		Segundo.Ano = 2050;
		Segundo.Mes = "Fevereiro";
		Segundo.Dia = 22;
		
		System.out.printf("%d/%s/%d", Segundo.Dia, Segundo.Mes, Segundo.Ano);



	}
}
