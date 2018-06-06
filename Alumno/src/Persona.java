
public class Persona {
	/*ATRIBUTOS*/
	private int edad;
	private String nombre;
	private String apellido;
	private int peso;
	
	public Persona(int pEdad, String pTitulo, String pApellido, int pPeso) {
	                edad=pEdad;
	                nombre=pTitulo;
	                apellido=pApellido;
	                peso=pPeso;
	}
	/*METODOS*/


	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public String toSttring(){
		return "El Nombre "+nombre+" y su Apellido "+apellido+" con la Edad "+edad+" y su Peso "+peso+"";
		
	}

}
