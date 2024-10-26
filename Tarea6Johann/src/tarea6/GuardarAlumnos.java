package tarea6;

import java.time.LocalDate;
import java.util.Scanner;

public class GuardarAlumnos {

	Alumno alumnos[] = new Alumno[1];
	Scanner sc = new Scanner(System.in);

	public void guardarAlumnos() {
		try {
			for (int i = 0; i < alumnos.length; i++) {
				System.out.println("Introduzca la Nia del alumno: ");
				int nia = sc.nextInt();
				nia = nia + Integer.parseInt("J");
				sc.nextLine();

				System.out.println("Introduzca el nombre del alumno: ");
				String nombre = sc.nextLine();

				System.out.println("Introduzca los apellidos del alumno: ");
				String apellidos = sc.nextLine();

				System.out.println("Introduzca el genero del alumno: ");
				char genero = sc.nextLine().charAt(0);

				System.out.println("Introduzca la fecha de nacimiento del alumno(yyyy-MM-dd): ");
				String fechaEntrada = sc.nextLine();
				LocalDate nacimiento = null;
				nacimiento = LocalDate.parse(fechaEntrada);

				System.out.println("Introduzca el cliclo del alumno: ");
				String ciclo = sc.nextLine();

				System.out.println("Introduzca el curso del alumno: ");
				String curso = sc.nextLine();

				System.out.println("Introduzca el grupo del alumno: ");
				String grupo = sc.nextLine();

				alumnos[i] = new Alumno(nia, nombre, apellidos, genero, nacimiento, ciclo, curso, grupo);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
