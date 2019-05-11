package test;

import negocio.ClienteABM;
import datos.*;
import dao.HibernateUtil;

public class TestTraerClienteYPrestamo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClienteABM abm = ClienteABM.getInstancia();
		try {
		     Cliente c = abm.traerClienteYPrestamo(2);
			for(Prestamo p: c.getPrestamos()) {
				System.out.println("\n" + p);
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
