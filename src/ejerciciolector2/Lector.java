package ejerciciolector2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lector {

	List<Restaurante> lineas = new ArrayList<>();
	String linea;

	public void leer(String direccion) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(direccion));
			linea = br.readLine();
			while (linea != null) {
				
				
				linea = br.readLine();
				lineas.add(new Restaurante(linea));
			}
		} catch (IOException e) {
			System.out.println("Error de lectura");
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (NullPointerException e) {
					System.out.println(e.getMessage());
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}

	}

	public String getLinea() {
		return linea;
	}

	public void setLinea(String linea) {
		this.linea = linea;
	}

	public List getLineas() {
		return lineas;
	}


	public void listarNombre(String subcadena) {
		for(Restaurante r: lineas) {
			if(r.getNombre().contains(subcadena)) {
				System.out.println(r.getNombre());
			}
		}
	}
	
	public void ordenar() {
		Collections.sort(lineas);
		
	}
	
	
	public void addRestaurante(Restaurante restaurante) {
		lineas.add(restaurante);
	}
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Restaurante r : lineas) {
		sb.append("\nNombre: ");
		sb.append(r.getNombre());
		sb.append("\nDirección: ");
		sb.append(r.getAddress());
		sb.append("\nCiudad: ");
		sb.append(r.getCity());
		sb.append("\nEstado: ");
		sb.append(r.getState());
		sb.append("\nZip: ");
		sb.append(r.getZipcode());
		
		}return sb.toString();

}
}