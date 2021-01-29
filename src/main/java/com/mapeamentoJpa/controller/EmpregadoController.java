package com.mapeamentoJpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpregadoController {

	@RequestMapping("/empregado")
	public String empregado() {
		return "/cadastro/empregado";
	}
	
	
}
