package classe;

public class Data {

	int Dia;
	String Mes;
	int Ano;
	
	String obterData() {
		return String.format("%d/%s/%d", Dia, Mes, Ano);
	}
}
