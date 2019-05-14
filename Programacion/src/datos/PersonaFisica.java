package datos;

public class PersonaFisica extends Cliente{
	
	private int idPersonaFisica;
	private DatosPersonales datospersonales;
	
	public PersonaFisica() {}

	public PersonaFisica(String direccion,DatosPersonales datospersonales) {
		super(direccion);
		this.datospersonales = datospersonales;
	}
	
	public int getIdPersonaFisica() {
		return idPersonaFisica;
	}

	protected void setIdPersonaFisica(int idPersonaFisica) {
		this.idPersonaFisica = idPersonaFisica;
	}

	public DatosPersonales getDatosPersonales() {
		return datospersonales;
	}

	public void setDatosPersonales(DatosPersonales datospersonales) {
		this.datospersonales = datospersonales;
	}

	@Override
	public String toString() {
		return "PersonaFisica [idPersonaFisica=" + idPersonaFisica + ", datospersonales=" + datospersonales + "]";
	}
	
	

}
