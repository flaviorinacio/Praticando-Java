package com.example.cdastro.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CadastroNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 7980208164179909508L;

	public CadastroNotFoundException(final Long id) {
		super("Customer with id " + id + " does not exist");
	}
}
