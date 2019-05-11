package test;

import datos.Cliente;
import negocio.ClienteABM;
import dao.HibernateUtil;

public class TestEliminarCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClienteABM abm = ClienteABM.getInstancia();
		Cliente c = abm.traerCliente((long)1);
		try {
			abm.eliminar(c.getIdCliente());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			HibernateUtil.getSessionFactory().close();
		}

	}

}
