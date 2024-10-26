package tarea6;

import java.util.Scanner;

public class AlumnosJUnitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		GuardarAlumnos GA = new GuardarAlumnos();
		SeleccionarFicheros SF = new SeleccionarFicheros();
		int num;
		try {
			System.out.println("---------------------------------------");
			System.out.println("1. Generar un fichero");
			System.out.println("2. Seleccionar un fichero");
			System.out.println("3. Guardar alumnos");
			System.out.println("4. Mostrar alumnos");
			System.out.println("---------------------------------------");
			num = sc.nextInt();
			switch (num) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				GA.guardarAlumnos();
				break;
			case 4:
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