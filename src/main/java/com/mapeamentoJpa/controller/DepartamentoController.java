package com.mapeamentoJpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mapeamentoJpa.entities.Departamento;
import com.mapeamentoJpa.repository.DepartamentoRepository;

@Controller
public class DepartamentoController {

	@Autowired
	DepartamentoRepository departamentoRepository;

	@RequestMapping(method = RequestMethod.GET, value = "/enviar_departamento")
	public String departamento() {
		return "/cadastro/departamento";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/salvar_dpto")
	public String departamentosave(Departamento departamento) {
		departamentoRepository.save(departamento);
		return "/cadastro/departamento";
	}

}
