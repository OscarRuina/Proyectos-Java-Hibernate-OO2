package negocio;

import dao.ContactoDao;
import datos.Contacto;
import datos.Cliente;

public class ContactoABM {
	
	ContactoDao dao = new ContactoDao();
	
	public Contacto traerContacto(long idContacto) {
		Contacto c = dao.traerContacto(idContacto);
		return c;
	}
	
	public void agregar(String email,String movil,String fijo,Cliente c) {
		Contacto con = new Contacto(email,movil,fijo,c);
		dao.agregar(con);
	}
	
	public void modificar(Contacto objeto) {
		dao.actualizar(objeto);
	}
	
	public void eliminar(Contacto objeto) {
		dao.eliminar(objeto);
	}
	
	
	

}
