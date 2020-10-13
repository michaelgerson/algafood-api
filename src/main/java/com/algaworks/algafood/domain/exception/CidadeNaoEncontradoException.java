package com.algaworks.algafood.domain.exception;

public class CidadeNaoEncontradoException extends EntidadeNaoEncontradaException {

	private static final long serialVersionUID = 1L;

	public CidadeNaoEncontradoException(String mensagem) {
		super(mensagem);
	}
	
	public CidadeNaoEncontradoException(Long cozinhaId) {
		this(String.format("Não existe um cadastro de cozinha com código %d", cozinhaId));
	}

}