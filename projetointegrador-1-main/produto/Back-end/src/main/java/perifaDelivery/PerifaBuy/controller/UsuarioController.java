package perifaDelivery.PerifaBuy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import perifaDelivery.PerifaBuy.model.UserLogin;
import perifaDelivery.PerifaBuy.model.Usuario;
import perifaDelivery.PerifaBuy.repository.UsuarioRepository;
import perifaDelivery.PerifaBuy.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class UsuarioController {

	@Autowired
	private UsuarioRepository repository;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Usuario> getById(@PathVariable Long id) {
		return repository.findById(id).map(
				resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Usuario>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@PostMapping("/logar")
	public ResponseEntity<UserLogin> Autentication(@RequestBody Optional<UserLogin> user){
		return usuarioService.Logar(user).map(resp->ResponseEntity.ok(resp))
				.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Usuario> Post(@RequestBody Usuario usuario) {
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(usuarioService.CadastrarUsuario(usuario));
	}
	
	
	@PutMapping("/atualizar")
	public ResponseEntity<Usuario> put(@RequestBody Usuario usuario) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(usuario));
	}
	
	
	

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
	
}
