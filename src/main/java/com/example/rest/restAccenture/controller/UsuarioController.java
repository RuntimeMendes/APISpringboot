package com.example.rest.restAccenture.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import javax.xml.bind.ValidationException;

import org.aspectj.weaver.ast.Var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.restAccenture.model.ErrorMessage;
import com.example.rest.restAccenture.model.Usuario;
import com.example.rest.restAccenture.service.UsuarioService;

@RestController
@RequestMapping(value = "/login/")
public class UsuarioController {

	@Autowired
	UsuarioService userService;

	@PostMapping("/usuario")
	Usuario create(@RequestBody Usuario usuario) {
		return userService.save(usuario);
	}

	@GetMapping("/usuario")
	Iterable<Usuario> read() {
		return userService.findAll();
	}

	@PutMapping("/usuario/{id}")
	Usuario update(@RequestBody Usuario usuario) {
		return userService.save(usuario);

	}

	@DeleteMapping("/usuario/{id}")
	void delete(@PathVariable Integer id) {
		userService.deleteById(id);
	}

	@GetMapping("/usuario/{id}")
	Optional<Usuario> findById(@PathVariable Integer id) {

		return userService.findById(id);
	}

	@GetMapping("/usuario/search")
	Iterable<Usuario> findByquery(@RequestParam(value = "nome", required = false) String nome,
			@RequestParam(value = "email", required = false) String email) {

		if (nome != null) {
			return userService.findByNome(nome);
		}
		if (email != null) {
			return userService.findByEmail(email);
		}

		else {
			return userService.findAll();
		}

	}

	@GetMapping("/autenticacao")
	Iterable<Usuario> findByLoginSenha(@RequestParam(value = "login", required = true) String login,
			@RequestParam(value = "senha", required = false) String senha) throws ValidationException {

		List<Usuario> lista = (List<Usuario>) userService.findByLoginAndSenha(login, senha);
		try {
			if (login != null && lista.size() > 0) {

				char status = lista.get(0).getStatus();

				if (String.valueOf(status).equals("A")) {

					return userService.findByLoginAndSenha(login, senha);
				} else {
					throw new ValidationException("erro na autenticacao");
				}

			} else {
				throw new ValidationException("erro na autenticacao");
			}

		} catch (Exception ex) {
			throw new ValidationException("erro na autenticacao");

		}

	}

	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(ValidationException.class)
	ErrorMessage exceptionHandler(ValidationException e) {
		return new ErrorMessage("400", e.getMessage());
	}

}
