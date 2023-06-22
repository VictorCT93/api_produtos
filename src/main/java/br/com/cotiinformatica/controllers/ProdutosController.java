package br.com.cotiinformatica.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.dtos.ProdutosPostRequestDTO;
import br.com.cotiinformatica.dtos.ProdutosPutRequestDTO;

@RestController
@RequestMapping("api/produtos")
public class ProdutosController {

	@PostMapping
	public void post(@RequestBody ProdutosPostRequestDTO dto) {
		// TODO Realizar cadastro de um produto

	}

	@PutMapping
	public void put(@RequestBody ProdutosPutRequestDTO dto) {
		// TODO Realizar a edição de um produto

	}

	@DeleteMapping("{idProduto}")
	public void delete(@PathVariable("idProduto") Integer idProduto) {
		// TODO Realizar a exclusão de um produto

	}

	@GetMapping
	public void getAll() {
		// TODO Realizar a consulta dos produtos

	}
	
	@GetMapping("{idProduto}")
	public void getById(@PathVariable("idProduto") Integer idProduto) {
		//TODO realizar a consulta de 1 produto atraves do ID
	}

}
