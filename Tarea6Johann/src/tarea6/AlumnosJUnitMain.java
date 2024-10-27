package tarea6;

import java.util.Scanner;

public class AlumnosJUnitMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		GuardarAlumnos GA = new GuardarAlumnos();
		SeleccionarFicheros SF = new SeleccionarFicheros();
		GenerarFichero GF = new GenerarFichero();
		MostrarAlumnos MA = new MostrarAlumnos();
		int num;

		try {
			System.out.println("---------------------------------------");
			System.out.println("1. Generar un fichero");
			System.out.println("2. Seleccionar un fichero");
			System.out.println("3. Guardar alumnos");
			System.out.println("4. Mostrar alumnos");
			System.out.println("5. Salir");
			System.out.println("---------------------------------------");
			num = sc.nextInt();
			switch (num) {
			case 1:
				GF.fichero();
			case 2:
				SF.elegirFichero();
			case 3:
				GA.guardarAlumnos();
			case 4:
				MA.mostrarAlumnos();
			case 5:
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				sc.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}