package test;

import dao.*;
import datos.*;
import negocio.*;

public class TestAgregarContacto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ClienteDao dao= new ClienteDao();
		long idCliente=4;
		Cliente c=dao.traerCliente(idCliente);
		System. out .println(c);
		Contacto con= new Contacto( "oscarruina@hotmail.com" , "1142481887" , "1167994165" , c);
		ContactoDao dao1= new ContactoDao();
		dao1.agregar(con);*/
		String email = "pepe@yahoo.com";
		String movil = "1144445555";
		String fijo = "22223333";
		long idCliente = 5;
		ClienteABM abm = ClienteABM.getInstancia();
		Cliente c = abm.traerCliente(idCliente);
		System.out.println(c);
		ContactoABM cabm = new ContactoABM();
		cabm.agregar(email, movil, fijo, c);
		
		
		HibernateUtil.getSessionFactory().close();
		

	}

}
