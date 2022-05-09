package ejerciciolector2;

public class Restaurante implements Comparable<Restaurante> {

	String nombre = "";
	String address = "";
	String city = "";
	String state = "";
	int zipcode = 0;
	
	
	public Restaurante(String datos) {
		initialize(datos);
	}
	
	public Restaurante(String nombre, String address, String city, String state, int zipcode) {
		this.nombre = nombre;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	private void initialize(String datos) {
		if(datos!=null) {
		String[] arreglo = datos.split(",");
		
		if(arreglo!=null) {
		this.nombre = arreglo[0];
		String direccion = "";
		for(int i = 1; i < arreglo.length-3; i++) {
			direccion+=datos.split(",")[i];
		}this.address = direccion;
		this.city = arreglo[arreglo.length-3];
		this.state = arreglo[arreglo.length-2];
		this.zipcode = Integer.parseInt((arreglo[arreglo.length-1]));
		}}
		}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Restaurante [nombre=");
		builder.append(nombre);
		builder.append(", address=");
		builder.append(address);
		builder.append(", city=");
		builder.append(city);
		builder.append(", state=");
		builder.append(state);
		builder.append(", zipcode=");
		builder.append(zipcode);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(Restaurante o) {
		// TODO Auto-generated method stub
		return this.getCity().compareTo(o.getCity());
	}






}
