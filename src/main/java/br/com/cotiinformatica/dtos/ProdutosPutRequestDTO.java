package br.com.cotiinformatica.dtos;

import lombok.Data;

@Data
public class ProdutosPutRequestDTO {
	
	private Integer idProduto;
	private String nome;
	private String descricao;
	private Double preco;
	private Integer quantidade;

}
