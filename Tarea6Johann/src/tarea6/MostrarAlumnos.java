package tarea6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MostrarAlumnos {

	Scanner sc = new Scanner(System.in);
	BufferedReader br;
	String lineas;
	String leerFichero;

	public void mostrarAlumnos() {

		try {
			System.out.println("Seleccione el archivo: ");
			leerFichero = sc.nextLine();
			br = new BufferedReader(new FileReader(leerFichero));

			while ((lineas = br.readLine()) != null) {
				System.err.println(lineas);
			}

			AlumnosJUnitMain.main(null);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}