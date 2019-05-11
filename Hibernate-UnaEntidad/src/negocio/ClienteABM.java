package negocio;

import java.util.GregorianCalendar;
import java.util.List;

import dao.ClienteDao;
import datos.Cliente;

public class ClienteABM {
	
	private static ClienteABM instancia;
	ClienteDao dao = ClienteDao.getInstancia();
	
	protected ClienteABM () {}
	
	public static ClienteABM getInstancia() {
		if(instancia == null) {
			instancia = new ClienteABM();
		}
		return instancia;
	}
	
	public Cliente traerCliente(long idCliente) {
		Cliente c = dao.traerCliente(idCliente);
		return c;
	}
	
	public Cliente traerCliente(int dni) {
		Cliente c = dao.traerCliente(dni);
		return c;
	}
	
	public int agregar(String apellido,String nombre,int dni,GregorianCalendar fechaDeNacimiento)throws Exception{
		if(dao.traerCliente(dni) != null)throw new Exception("ERROR ya existe cliente con dni: " + dni);
		Cliente c = new Cliente(apellido,nombre,dni,fechaDeNacimiento);
		return dao.agregar(c);
	}
	
	public void modificar(Cliente c)throws Exception{
	    if(dao.traerCliente(c.getDni()) != null)throw new Exception("ERROR no se puede modificar");
		dao.actualizar(c);
	}
	
	public void eliminar(long idCliente)throws Exception{
		Cliente c = dao.traerCliente(idCliente);
		if(c == null)throw new Exception("ERROR no existe cliente a eliminar");
		dao.eliminar(c);
	}
	
	public List<Cliente> traerCliente(){
		return dao.traerCliente();
	}
	
	
	

}
