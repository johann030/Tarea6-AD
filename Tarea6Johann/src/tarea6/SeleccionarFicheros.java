package tarea6;

import java.util.Scanner;

public class SeleccionarFicheros {

	Scanner sc = new Scanner(System.in);

	public void fichero() {
		try {
			System.out.println("Eliga el fichero: ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
