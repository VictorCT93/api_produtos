package br.com.cotiinformatica.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.dtos.MovimentacoesPostRequestDTO;

@RestController
@RequestMapping("api/movimentacoes")
public class MovimentacoesController {
	
	@PostMapping
	public void post(@RequestBody MovimentacoesPostRequestDTO dto) {
		// TODO Realizar cadastro de uma movimentação

	}
	
	@GetMapping("{dataInicio}/{dataFim}")
	public void getAll(@PathVariable("dataInicio") String dataInicio, @PathVariable("dataFim") String dataFim) {
		// TODO Realizar consulta das movimentações

	}

}
