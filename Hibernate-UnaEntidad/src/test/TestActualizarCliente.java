package test;

import java.util.GregorianCalendar;

import datos.Cliente;
import negocio.ClienteABM;
import dao.HibernateUtil;

public class TestActualizarCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClienteABM abm = ClienteABM.getInstancia();
		long id = 2;
		//traer el obj a modificar
		Cliente c = abm.traerCliente(id);
		System.out.println("Cliente a modificar --->" + c);
		c.setFechaDeNacimiento(new GregorianCalendar(1990,10,04));
		try {
			abm.modificar(c);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			HibernateUtil.getSessionFactory().close();
		}
		Cliente cmodif = abm.traerCliente(id);
		System.out.println("Cliente modificado ---> " + cmodif);
		

	}

}
