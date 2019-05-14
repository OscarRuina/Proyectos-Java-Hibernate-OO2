package datos;

public class DatosPersonales {
	
	private long idDatosPersonales;
	private int dni;
	private String nombre;
	private String apellido;
	private PersonaFisica personafisica;
	private Inspector inspector;
	
	public DatosPersonales() {}
	
	public DatosPersonales(int dni, String nombre, String apellido) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	

	public long getIdDatosPersonales() {
		return idDatosPersonales;
	}

	protected void setIdDatosPersonales(long idDatosPersonales) {
		this.idDatosPersonales = idDatosPersonales;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
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
	
	public PersonaFisica getPersonaFisica() {
		return personafisica;
	}

	public void setPersonaFisica(PersonaFisica personafisica) {
		this.personafisica = personafisica;
	}

	public Inspector getInspector() {
		return inspector;
	}

	public void setInspector(Inspector inspector) {
		this.inspector = inspector;
	}

	@Override
	public String toString() {
		return "DNI=" + dni + ", nombre=" + nombre + ", apellido=" + apellido;
	}

	
	
	

}
