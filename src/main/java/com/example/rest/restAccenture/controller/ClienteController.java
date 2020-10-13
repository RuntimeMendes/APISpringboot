package com.example.rest.restAccenture.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.restAccenture.model.Cliente;
import com.example.rest.restAccenture.model.Usuario;
import com.example.rest.restAccenture.service.ClienteService;

@RestController
@RequestMapping(value="/login/")
public class ClienteController {

	@Autowired
	ClienteService clienteService;
	
    @PostMapping("/cliente")
    Cliente create(@RequestBody Cliente cliente) {   	
    	
    	return clienteService.save(cliente);
    }
    
    @GetMapping("/cliente")
    Iterable<Cliente> read() {
    	return clienteService.findAll();
    }
    
    @PutMapping("/cliente")
    Cliente update(@RequestBody Cliente cliente) {
    	return clienteService.save(cliente);
    }
	
    @DeleteMapping("/cliente/{id}")
    void delete(@PathVariable Integer id) {
    	clienteService.deleteById(id);
    }
    
    @GetMapping("/cliente/{id}")
    Optional<Cliente> findById(@PathVariable Integer id){      	
    return clienteService.findById(id);
    }
    
    @GetMapping("/cliente/search")
    Iterable<Cliente> findByquery(
    @RequestParam (value= "nome" ,required =false) String nome,
      @RequestParam (value= "cpf" ,required =false) String cpf,
      @RequestParam (value= "cidade" ,required =false) String cidade,
      @RequestParam (value= "uf" ,required =false) String uf
      
      
    		
    		){
    	
       if(nome !=null) {
    		return clienteService.findByNome(nome);
    	}
       if(cpf !=null) {
    	   return clienteService.findByCpf(cpf);
       }
       if(cidade !=null) {
    	   return clienteService.findByCidade(cidade);
       }
       if(uf !=null) {
    	   return clienteService.findByUf(uf);
       }
       
       else {
    		return clienteService.findAll();
    	}
    	
    	
    }
	
}
