package com.example.cadastro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.cadastro.entity.Cadastro;
import com.example.cadastro.service.CadastroService;

@RestController
@RequestMapping("/api/v1/cadastro")
public class CadastroController {

	@Autowired
	private CadastroService cadastroService;
	
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Cadastro create(@RequestBody final Cadastro cadastro) {
		Long id = cadastroService.create(cadastro);
		cadastro.setId(id);
		return cadastro;
	}//end create


	@GetMapping("/{id}")
	public ResponseEntity<Cadastro> read(@PathVariable final Long id) {
		Cadastro response = cadastroService.read(id);
		return ResponseEntity.ok(response);
	}//end read

	
	@PatchMapping("/{id}")
	public ResponseEntity<Cadastro> update(@PathVariable final Long id, @RequestBody final Cadastro cadastro) {
		cadastro.setId(id);
		cadastroService.update(cadastro);
		return ResponseEntity.ok().build(); // não lembro
	}//end update
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Cadastro> delete(@PathVariable Long  id){
		cadastroService.read(id);
		cadastroService.delete(id);	
		return ResponseEntity.ok().build(); //não lembro
	}//end delete
	
}//end class CadastroController
