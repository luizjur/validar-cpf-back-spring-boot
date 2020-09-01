package br.com.professorisidro.validacpf.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.professorisidro.validacpf.service.Validador;

@RestController // quando tem @ é uma assinatura de metodo
@CrossOrigin("*")
public class ValidadorController {

	@GetMapping("/validacpf") // definindo uma rota o / depois do nome do site
	public String validaCPF(@RequestParam String cpf) {
		if (Validador.isCPF(cpf)) {
			return "{\"status\": \"valido\"}";
		}
		return "{\"status\": \"invalido\"}";
	}

	@GetMapping("/") // definindo uma rota
	public String index() {
		return "{\"mensagem\": \"bem vindo API turma7b\"}";
	}
}
