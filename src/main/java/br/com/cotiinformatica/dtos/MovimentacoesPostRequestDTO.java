package br.com.cotiinformatica.dtos;

import lombok.Data;

@Data
public class MovimentacoesPostRequestDTO {
	
	private Integer idProduto;
	private Integer tipo;
	private String  observacoes;
	private Integer quantidade;
	private String dataMovimentacao;

}
