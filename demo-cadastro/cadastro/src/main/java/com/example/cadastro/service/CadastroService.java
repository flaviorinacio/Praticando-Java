package com.example.cadastro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cadastro.entity.Cadastro;
import com.example.cadastro.repository.CadastroRepository;
import com.example.cdastro.exception.CadastroNotFoundException;

@Service
public class CadastroService {
	
	@Autowired  // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Para que serve mesmo
	private CadastroRepository cadastroRepository;
	

	public Long create (Cadastro cadastro) {
		return cadastroRepository.save(cadastro).getId();
	}//end create
	
	public Cadastro read(Long id) {
		return cadastroRepository.findById(id)
				.orElseThrow(() -> new CadastroNotFoundException(id)); //não lembro para que serve está classe
	}//end read

	public void update (Cadastro cadastro) {
		cadastroRepository.save(cadastro);
	}//end update
	
	public void delete(Long id) {
		cadastroRepository.deleteById(id);
	}//end delete
	
	
}//end class CadastroService
