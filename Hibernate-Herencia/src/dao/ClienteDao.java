package dao;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import datos.*;

public class ClienteDao {
	
	private static Session session;
	private Transaction tx;
	private static ClienteDao instancia;
	
	protected ClienteDao() {}
	
	public static ClienteDao getInstance() {
		if(instancia == null) {
			instancia = new ClienteDao();
		}
		return instancia;
	}
	
	private void iniciaOperacion()throws HibernateException{
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}
	
	private void manejaExcepcion(HibernateException he)throws HibernateException{
		tx.rollback();
		throw new HibernateException("ERROR en la capa de acceso a datos",he);
	}
	
	public Cliente traer(int idCliente) {
		Cliente c = null;
		try {
			iniciaOperacion();
			c = (Cliente)session.createQuery("from Cliente c where c.idCliente =" + idCliente).uniqueResult();
		}
		finally {
			session.close();
		}
		return c;
	}
	
	@SuppressWarnings ( "unchecked" )
	public List<Cliente> traer() throws HibernateException {
		List<Cliente> lista = null ;
		try {
			iniciaOperacion();
			lista = session .createQuery( "from Cliente" ).list();
		} finally {
			session .close();
		}
		return lista ;
	}
	
	public int agregar(Cliente c) {
		int id = 0;
		try {
			iniciaOperacion();
			id = Integer.parseInt(session.save(c).toString());
			tx.commit();
		}
		catch(HibernateException he) {
			manejaExcepcion(he);
			throw he;
		}
		finally {
			session.close();
		}
		return id;
	}
	

}
