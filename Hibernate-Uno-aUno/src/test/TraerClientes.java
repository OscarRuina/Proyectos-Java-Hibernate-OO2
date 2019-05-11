package test;

import negocio.ClienteABM;
import dao.HibernateUtil;

public class TraerClientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			long id = 1;   
			ClienteABM abm = ClienteABM.getInstancia();
			System.out.println(abm.traerCliente(id));
			System.out.println(abm.traerCliente(35639606));
			/*for(int i = 0; i < abm.traerCliente().size();i++) {
				System.out.println(abm.traerCliente().get(i));
			}*/
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			HibernateUtil.getSessionFactory().close();
		}

	}

}
