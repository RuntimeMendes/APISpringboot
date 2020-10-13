package com.example.rest.restAccenture.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.restAccenture.model.Cliente;
import com.example.rest.restAccenture.model.Contabil;
import com.example.rest.restAccenture.model.Livro;
import com.example.rest.restAccenture.service.ContabilService;

@RestController
@RequestMapping(value="/login/")
public class ContabilController {
	
	@Autowired
	ContabilService contabilService;
	

    @GetMapping("/contabil")
    Iterable<Contabil> read() {
    	return contabilService.findAll();
    }
 
    @PostMapping("/contabil")
    Contabil create(@RequestBody Contabil contabil) {   	
    	
    	return contabilService.save(contabil);
    }
    
    @GetMapping("/contabil/{id}")
    Optional<Contabil> findById(@PathVariable Integer id){      	
    return contabilService.findById(id);
    }
    
   /* @GetMapping("/contabil/cliente/{IdCliente}")
    Iterable<Livro> findByClienteId(@PathVariable Integer IdCliente){      	
    return contabilService.findByClienteId(IdCliente);
    }*/
    
}
