package test;

import negocio.ClienteABM;
import dao.HibernateUtil;
import datos.Cliente;

public class TestTraerClienteYContacto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClienteABM cabm = ClienteABM.getInstancia();
		long idCliente = 4;
		Cliente c = cabm.traerCliente(idCliente);
		System.out.println("\ntraer cliente y contacto\n" + c + "\n" + c.getContacto());
		HibernateUtil.getSessionFactory().close();

	}

}
