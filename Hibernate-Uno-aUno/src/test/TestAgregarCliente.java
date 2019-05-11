package test;

import negocio.ClienteABM;
import java.util.*;

import dao.HibernateUtil;

public class TestAgregarCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String apellido = "Argento";
		String nombre = "Pepe";
		int documento = 12035255;
		GregorianCalendar fechaDeNacimiento = new GregorianCalendar(1955,04,20);
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
