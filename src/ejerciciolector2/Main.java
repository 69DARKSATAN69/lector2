package ejerciciolector2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean salir = false;
		Lector lector = new Lector();
		Scanner sc = new Scanner(System.in);
		lector.leer("C:\\programacion\\ejerciciolector2\\restaurantes.csv"); //Inserta aqui tu propia direccion.
		int opcion = 0;
		

		while(salir != true) {
			
				System.out.println("Bienvenidos a JustEat. Seleccionad una opción.");
				System.out.println("0. Añadir restaurante.");
				System.out.println("1. Listar restaurantes.");
				System.out.println("2. Buscar restaurantes.");
				System.out.println("3. Ordenar restaurantes.");
				System.out.println("4. Salir.");
				opcion = sc.nextInt();
		
		switch(opcion) {
		case 0:
			System.out.println("Introduce nombre: ");
			String nombre = sc.next();
			System.out.println("Introduce dirección: ");
			String direccion = sc.next();
			System.out.println("Introduce ciudad: ");
			String ciudad = sc.next();
			System.out.println("Introduce estado: ");
			String estado = sc.next();
			System.out.println("Introduce zip: ");
			int zip = sc.nextInt();
			lector.addRestaurante(new Restaurante(nombre, direccion, ciudad, estado, zip));
			break;
			
		
		case 1: 
			System.out.println(lector.toString());
			break;
		case 2:
			System.out.println("Introduce subcadena");
			sc.hasNext();
			String subcadena = sc.next();
			lector.listarNombre(subcadena);
			sc.next();
			break;
		case 3:
			lector.ordenar();
			System.out.println("Por pantalla? 1 para pantalla, 2 para fichero.");
			int opcion2 = sc.nextInt();
			switch(opcion2) {
			case 1:
				System.out.println(lector.toString());
				break;
			case 2:
				try {
					PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("restaurantesescritos.txt")));
					pw.write(lector.toString());
					pw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			break;
		
		case 4:
			System.out.println("Adeu");
			salir = true;
			break;
		}
		
		
		}
		 
		 
		
		
		sc.close();
	}

}
