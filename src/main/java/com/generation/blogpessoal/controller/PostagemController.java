package com.generation.blogpessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.blogpessoal.model.Postagem;
import com.generation.blogpessoal.repository.PostagemRepository;

@RestController
@RequestMapping("/postagens")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PostagemController {

	// injecao de dependencias
	@Autowired
	private PostagemRepository postagemRepository;

	// acessado verbo get
	@GetMapping
	public ResponseEntity<List<Postagem>> getAll() {
		// respostas no formato http

		return ResponseEntity.ok(postagemRepository.findAll());
		// find all = select * from nome da tabela
		// codigo de retorno -- corpo de retorno

	}

}
