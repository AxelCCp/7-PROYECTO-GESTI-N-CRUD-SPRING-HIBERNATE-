package pildoras.es.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pildoras.es.controlador.entity.Cliente;


@Repository//PARA QUE RECONOZCA COMO UN BEAN
public class ClaseClienteDAO implements ClienteDAO {

	
	@Override //M�TODO QUE NOS DEVOLVER� EL LISTADO DE LOS CLIENTES
	@Transactional
	public List<Cliente> getClientes() {
		// TODO Auto-generated method stub
		
		//OBTENER LA SESSION.
		Session miSession = sessionFactory.getCurrentSession();
		//CREAR CONSULTA.
		Query<Cliente> miQuery = miSession.createQuery("from cliente",Cliente.class);
		//EJECUTAR LA QUERY Y DEVOLVER RESULTADOS.
		List<Cliente> clientes = miQuery.getResultList();
		
		return clientes;
	}
	
	
	//PARA INYECCI�N DE DEPENDENCIAS PARA SESSIONFACTORY. AS� SE PODR� USAR DENTRO DEL M�TODO.
	@Autowired
	private SessionFactory sessionFactory;
	
}

