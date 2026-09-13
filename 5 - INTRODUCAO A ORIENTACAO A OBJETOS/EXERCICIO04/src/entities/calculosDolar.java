package entities;

public class calculosDolar {
	
	public static double dolar;
	public static double valorConversao;
	
	public static double valorConvertido() {
		return dolar * valorConversao;
	}
	
	public static double porcentagemIof() {
		return (valorConvertido() * 6) / 100;
	}
	
}
