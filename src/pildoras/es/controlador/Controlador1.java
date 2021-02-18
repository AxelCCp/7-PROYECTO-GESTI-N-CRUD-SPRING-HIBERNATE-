package pildoras.es.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cliente")
public class Controlador1 {
	
	@RequestMapping("/lista")
	public String vistaClientes(Model modelo) {
		return "A1_ListaClientes";
	}
	

}
