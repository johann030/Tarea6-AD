package tarea6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GenerarFichero {

	Scanner sc = new Scanner(System.in);
	BufferedWriter bw;
	String fichero;

	public void fichero() {

		try {
			System.out.println("Ponga el nombre del fichero:");
			fichero = sc.nextLine();
			bw = new BufferedWriter(new FileWriter(fichero));

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