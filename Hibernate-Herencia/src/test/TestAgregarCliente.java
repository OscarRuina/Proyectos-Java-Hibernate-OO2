package test;

import dao.HibernateUtil;
import datos.*;
import negocio.ClienteABM;

public class TestAgregarCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClienteABM abmc = ClienteABM.getInstance();
		try {
			PersonaJuridica p1 = new PersonaJuridica("33333333","La Nueva","3333333333");
			PersonaFisica p2 = new PersonaFisica("44444444","Lopez","Rodrigo",44444444);
			int idUltimo = abmc.agregar(p1);
			System.out.println("Id ultimo agregado:" + idUltimo);
			idUltimo = abmc.agregar(p2);
			System.out.println("Id ultimo agregado:" + idUltimo);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally{
			HibernateUtil.getSessionFactory().close();
		}

	}

}
