package test.Tarifa;

import java.util.List;

import dao.HibernateUtil;
import datos.TarifaBaja;
import datos.DetalleBaja;
import negocio.TarifaABM;
import negocio.DetallesTarifaABM;

public class TestTraerTarifaBajaConDetalles {

	public static void main(String[] args) {
		
		TarifaABM TABM = TarifaABM.getInstancia();
		DetallesTarifaABM DBABM = DetallesTarifaABM.getInstancia();
				
		try {
			TarifaBaja TB = TABM.traerTarifaBaja("T1 - R1");
			System.out.println(TB.toString());
			
			List<DetalleBaja> ListaDB = DBABM.TraerTodasLasDetalleBajaDeUnaTarifa(TB.getIdTarifa());
			
			for (DetalleBaja p : ListaDB)
				System.out.println("\n" + p);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		HibernateUtil.getSessionFactory().close();
	}

}
