package utilidades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Consola {
	
	public static final Scanner s = new Scanner(System.in);
	
	public static int ingresarEntero(final int MAX) {
		final int MIN = 1;
		int num = -1;
		boolean error;
		do {
			error = false;
			try {
				num = s.nextInt();
				if(num < MIN || num > MAX) {
					System.out.println("Error: El numero debe ser mayor a " + MIN + " y menor a " + MAX);
					error = true;
				}
			} catch(InputMismatchException e) {
				System.out.println("Error: El tipo de dato ingresado es incorrecto. ");
				error = true;
			} catch(Exception e) {
				System.out.println("Error no contemplado. ");
				error = true;
			} finally {
				s.nextLine();
			}
		}while(error);
		
		return num;
	}
	
	public static int ingresarEntero(final int MIN, final int MAX) {
		int num = -1;
		boolean error;
		do {
			error = false;
			try {
				num = s.nextInt();
				if(num < MIN || num > MAX) {
					System.out.println("Error: El numero debe ser mayor a " + MIN + " y menor a " + MAX);
					error = true;
				}
			} catch(InputMismatchException e) {
				System.out.println("Error: El tipo de dato ingresado es incorrecto. ");
				error = true;
			} catch(Exception e) {
				System.out.println("Error no contemplado. ");
				error = true;
			} finally {
				s.nextLine();
			}
		}while(error);
		
		return num;
	}
	
	public static String ingresarTexto(final int MIN, final int MAX) {
		String txt = "";
		boolean error;
		do {
			error = false;
			try {
				txt = s.nextLine();
				if(txt.length() < MIN || txt.length() > MAX) {
					System.out.println("Error: La longitud de el texto debe ser mayor a " + MIN + " y menor a " + MAX);
					error = true;
				}
			} catch(Exception e) {
				System.out.println("Error no contemplado. ");
				error = true;
			}
		}while(error);
		
		return txt;
	}
	
	public static void esperar(int milis) {
		try {
			Thread.sleep(milis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}