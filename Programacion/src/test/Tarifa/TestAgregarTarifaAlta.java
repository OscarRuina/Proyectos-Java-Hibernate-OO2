package test.Tarifa;

import dao.HibernateUtil;
import negocio.TarifaABM;

public class TestAgregarTarifaAlta {

	public static void main(String[] args) {
		
		TarifaABM TABM = TarifaABM.getInstancia();
		
		try {
			//TABM.agregarTarifaAlta(servicio, tensionContratada, limite)
			TABM.agregarTarifaAlta("T2 - BT","BT",300);
			TABM.agregarTarifaAlta("T2 - MT","MT",300);
			TABM.agregarTarifaAlta("T2 - AT","AT",300);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		HibernateUtil.getSessionFactory().close();
		
	}

}
