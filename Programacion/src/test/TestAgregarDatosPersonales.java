package test;

import datos.DatosPersonales;
import dao.DatosPersonalesDao;
import dao.HibernateUtil;

public class TestAgregarDatosPersonales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatosPersonalesDao d = DatosPersonalesDao.getInstancia();
		try {
			DatosPersonales d1 = new DatosPersonales(35639606,"Oscar","Ruina");
			d.agregarDatosPersonales(d1);
			System.out.println(d.traerDatosPersonales(35639606));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			HibernateUtil.getSessionFactory().close();
		}

	}

}
