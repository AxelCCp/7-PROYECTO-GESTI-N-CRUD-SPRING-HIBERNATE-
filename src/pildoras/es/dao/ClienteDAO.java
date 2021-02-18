package pildoras.es.dao;

import java.util.List;

import pildoras.es.controlador.entity.Cliente;

//ESTA INTERFAZ DEVUELVE UNA LISTA CON TODOS LOS CLIENTES.
//PERMITIRÁ HACER UNA INYECCION DE DEPENDENCIA DE UN OBJ "CLIENTE" DONDE SE NECESITE.

public interface ClienteDAO {
	
	
	//LISTA QUE ALMACENA OBJ's DE TIPO CLIENTE CON UN MÉTODO LLAMADO getClientes()
	public List<Cliente> getClientes();

}
