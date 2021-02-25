package com.Hopper.RedeHopper.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hopper.RedeHopper.model.PostagemEntidade;
import com.Hopper.RedeHopper.repository.PostagemRepository;




@RestController
@RequestMapping("/postagens")
@CrossOrigin("*")
public class PostagemController {
			
	@Autowired
	private PostagemRepository repository;
	
	@GetMapping
	public ResponseEntity<List<PostagemEntidade>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	

	@GetMapping("/{id}")
	public ResponseEntity<PostagemEntidade> GetById(@PathVariable long id) {
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}

	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<PostagemEntidade>> GetByTitulo(@PathVariable String titulo) {
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
	}
	
	
	/*
	@GetMapping("/tema/{tema}")
	public ResponseEntity<List<PostagemEntidade>> GetByTema(@PathVariable String tema) {
		return ResponseEntity.ok(repository.findAllByTemaContainingIgnoreCase(tema));
	}*/

	@PostMapping
	public ResponseEntity<PostagemEntidade> post(@RequestBody PostagemEntidade postagementidade) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagementidade));
	}

	@PutMapping
	public ResponseEntity<PostagemEntidade> put(@RequestBody PostagemEntidade postagementidade) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagementidade));
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}