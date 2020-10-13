package com.example.rest.restAccenture.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.restAccenture.model.Cliente;
import com.example.rest.restAccenture.model.Livro;
import com.example.rest.restAccenture.service.LivroService;

@RestController
@RequestMapping(value="/login/")
public class LivroController {
	
	@Autowired
	LivroService livroService;
	

    @PostMapping("/livro_Caixa")
    Livro create(@RequestBody Livro livro) { 
    	
    	return livroService.save(livro);
    }     
    
    @GetMapping("/livro_Caixa/listaTodos")
    Iterable<Livro> read() {
    	
    	return livroService.findAll();
    }
    
    @PutMapping("/livro_Caixa")
     ResponseEntity<Livro> update (@RequestBody Livro livro) {
    	System.out.println("Id Passado é " + livro.getId() + livro);
     if(livro.getId()!=0)  
    	 
    	return new ResponseEntity(livroService.save(livro),HttpStatus.OK);
        if(livro.getId()==0) 
    	return new ResponseEntity(livro,HttpStatus.BAD_REQUEST);
		return new ResponseEntity(livro,HttpStatus.LOCKED);
        
    }
    
    @DeleteMapping("/livro_Caixa/{id}")
    void delete(@PathVariable Integer id) {
    	livroService.deleteById(id);
    }
    @GetMapping("/livro_Caixa/{id}")
    Optional<Livro> findById(@PathVariable Integer id){      	
    return livroService.findById(id);
    }
    
    @GetMapping("/livro_Caixa/cliente/{IdCliente}")
    Iterable<Livro> findByClienteId(@PathVariable Integer IdCliente){      	
    return livroService.findByClienteId(IdCliente);
    }
}
	


