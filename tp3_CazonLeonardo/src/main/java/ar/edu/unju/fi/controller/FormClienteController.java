package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormClienteController {
@GetMapping({"/Formulario"}) //indica en la raiz del servidor
	
	public String getFormCliente() {
		return "FormCliente";
	}
	
	
	
}
