package br.com.cotiinformatica.dtos;

import lombok.Data;

@Data
public class ProdutosPostRequestDTO {
	
	private String nome;
	private String descricao;
	private Double preco;
	private Integer quantidade;

}
