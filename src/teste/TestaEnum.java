package teste;

import util.Cursos;

/**
 * Classe para demonstrar a utilização de Enum
 * 
 * @author Lucas Igor A M Nogueira
 * @since 7 de abr. de 2021
 * @version 1.0
 */
public class TestaEnum {

	public static void main(String[] args) {

		System.out.println("Todos os Cursos");
		for (Cursos c : Cursos.values()) {
			System.out.println("Curso de " + c + " duração de " + c.getHoras() + " no periodo "
				+ c.getPeriodo());
		}

	}

}
