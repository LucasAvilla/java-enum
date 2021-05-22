package util;

/**
 * Classe para demonstrar o conceito de Enum
 * 
 * @author Lucas Igor A M Nogueira
 * @since 7 de abr. de 2021
 * @version 1.0
 */
public enum Cursos {

	JAVA(180, "Noturno"),
	COBOL(160, "Vespertino"),
	PHP(40, "Noturno/Vespertino"),
	UNITY(100, "Diurno");

	private int horas;
	private String periodo;

	Cursos(int horas, String periodo) {
		this.horas = horas;
		this.periodo = periodo;
		
	}
	
	public int getHoras() {
		return horas;
	}
	public String getPeriodo() {
		return periodo;
	}

	
	
	
	
}// fim da classe
