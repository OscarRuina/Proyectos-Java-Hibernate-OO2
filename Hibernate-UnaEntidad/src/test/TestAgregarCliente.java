package test;

import java.util.GregorianCalendar;
import negocio.ClienteABM;
import dao.HibernateUtil;

public class TestAgregarCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String apellido = "Simpson";
		String nombre = "Homero";
		int documento = 10354783;
		GregorianCalendar fechaDeNacimiento = new GregorianCalendar(1956,02,21);
		ClienteABM abm = ClienteABM.getInstancia();
		try {
			long ultimoIdCliente = abm.agregar(apellido, nombre, documento, fechaDeNacimiento);
			System.out.println(ultimoIdCliente);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			HibernateUtil.getSessionFactory().close();
		}

	}

}
