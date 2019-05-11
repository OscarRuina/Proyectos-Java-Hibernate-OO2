package test;

import negocio.ClienteABM;
import dao.HibernateUtil;

public class TestTraerClientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ClienteABM abm = ClienteABM.getInstancia();
			for(int i = 0; i < abm.traerCliente().size();i++) {
				System.out.println(abm.traerCliente().get(i).toString());
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
