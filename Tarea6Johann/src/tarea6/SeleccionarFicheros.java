package tarea6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SeleccionarFicheros {

	Scanner sc = new Scanner(System.in);
	BufferedWriter bw = null;
	String fichero;

	public void elegirFichero() {

		try {
			System.out.println("Eliga el fichero: ");
			fichero = sc.nextLine();
			bw = new BufferedWriter(new FileWriter(fichero, true));

			AlumnosJUnitMain.main(null);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				sc.close();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
