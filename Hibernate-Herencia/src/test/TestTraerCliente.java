package test;

import dao.HibernateUtil;
import datos.Cliente;
import negocio.ClienteABM;

public class TestTraerCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int idCliente = 1;
			System.out.println("+traer("+idCliente+")");
			System.out.println(ClienteABM.getInstance().traer(idCliente));
			idCliente = 2;
			System.out.println("+traer("+idCliente+")");
			System.out.println(ClienteABM.getInstance().traer(idCliente));
			System.out.println("\n+traer()");
			for(Cliente c:ClienteABM.getInstance().traer()) {
				System.out.println(c);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			HibernateUtil.getSessionFactory().close();
		}

	}

}
