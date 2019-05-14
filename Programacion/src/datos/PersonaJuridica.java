package datos;

public class PersonaJuridica extends Cliente{
	
	private int idPersonaJuridica;
	private String cuit;
	private String razonSocial;
	
	public PersonaJuridica() {}

	public PersonaJuridica(String direccion, String cuit, String razonSocial) {
		super(direccion);
		this.cuit = cuit;
		this.razonSocial = razonSocial;
	}

	public int getIdPersonaJuridica() {
		return idPersonaJuridica;
	}

	protected void setIdPersonaJuridica(int idPersonaJuridica) {
		this.idPersonaJuridica = idPersonaJuridica;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	@Override
	public String toString() {
		return "PersonaJuridica [idPersonaJuridica=" + idPersonaJuridica + ", cuit=" + cuit + ", razonSocial="
				+ razonSocial + "]";
	}
	
	

}
