package com.algaworks.algafood.domain.exception;

public class CozinhaNaoEncontradoException extends EntidadeNaoEncontradaException {

	private static final long serialVersionUID = 1L;

	public CozinhaNaoEncontradoException(String mensagem) {
		super(mensagem);
	}
	
	public CozinhaNaoEncontradoException(Long cidadeId) {
		this(String.format("Não existe um cadastro de cidade com código %d", cidadeId));
	}

}