package com.example.restservice;

import java.rmi.RemoteException;
import java.sql.SQLException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.server.StubProxy;

import models.Acesso;
import models.Endereco;
import models.Usuario;
import models.Categoria;
import models.Aluguel;
import models.Anuncio;

@RestController
public class RentPayController {

	StubProxy stub = new StubProxy(); 
	
	@GetMapping("/login")
	public Acesso login(@RequestParam(value = "email") String email,@RequestParam(value = "password") String password) throws RemoteException, SQLException {
		boolean logou = stub.logar(email, password);
		return new Acesso(logou);
	}
	
	//Rotas de Usuario
	
	
	//Pegar dados de usuario
	@GetMapping("/usuario")
	public Usuario usuario(@RequestParam(value = "id") int id) throws RemoteException, SQLException {
		Usuario usuario = stub.dadosDoUsuario(id);
		return usuario;
	}
	
	//CadastrarUsuario
	@RequestMapping(value = "/cadastro", method = RequestMethod.POST)
	public ResponseEntity<Integer> cadastro(@RequestBody Usuario usuario) throws RemoteException, SQLException {
		Integer id = stub.cadastrarUsuario(usuario);
		return new ResponseEntity<Integer>(id, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/atualizar", method = RequestMethod.PUT)
	public ResponseEntity<Boolean> update(@RequestBody Usuario usuario) throws RemoteException, SQLException {
		Boolean atualizou = stub.atualizarUsuario(usuario);
		return new ResponseEntity<Boolean>(atualizou, HttpStatus.OK);
	}
	
	@RequestMapping(value = {"/deletar/{id}"}, method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> delete(@PathVariable final int id) throws RemoteException, SQLException {
		Boolean removeu = stub.removerUsuario(id);
		return new ResponseEntity<Boolean>(removeu, HttpStatus.OK);
	}
	
	@GetMapping("/endereco")
	public Endereco endereco(@RequestParam(value = "id") int id) throws RemoteException, SQLException {
		Endereco endereco = stub.dadosDeEndereco(id);
		return endereco;
	}
	
	@RequestMapping(value = "/cadastroDeEndereco", method = RequestMethod.POST)
	public ResponseEntity<Integer> cadastroDeEndereco(@RequestBody Endereco endereco, @RequestParam(value = "id") int id_user) throws RemoteException, SQLException {
		Integer id = stub.cadastrarEndereco(endereco, id_user);
		return new ResponseEntity<Integer>(id, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/atualizarEndereco", method = RequestMethod.PUT)
	public ResponseEntity<Boolean> atualizarEndereco(@RequestBody Endereco endereco, @RequestParam(value = "id") int id_user) throws RemoteException, SQLException {
		System.out.println(endereco);
		System.out.println(id_user);
		Boolean atualizou = stub.atualizarEndereco(endereco, id_user);
		return new ResponseEntity<Boolean>(atualizou, HttpStatus.OK);
	}
	
	@GetMapping("/categoria")
	public Categoria categoria(@RequestParam(value = "id") int id) throws RemoteException, SQLException {
		Categoria categoria = stub.dadosDeCategoria(id);
		return categoria;
	}
	
	@RequestMapping(value = "/cadastroDeCategoria", method = RequestMethod.POST)
	public ResponseEntity<Integer> cadastroDeCategoria(@RequestBody Categoria categoria) throws RemoteException, SQLException {
		Integer id = stub.cadastrarCategoria(categoria);
		return new ResponseEntity<Integer>(id, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/atualizarCategoria", method = RequestMethod.PUT)
	public ResponseEntity<Boolean> atualizarCategoria(@RequestBody Categoria categoria) throws RemoteException, SQLException {
		Boolean atualizou = stub.atualizarCategoria(categoria);
		return new ResponseEntity<Boolean>(atualizou, HttpStatus.OK);
	}
	
	@RequestMapping(value = {"/deletarCategoria/{id}"}, method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> deletarCategoria(@PathVariable final int id) throws RemoteException, SQLException {
		Boolean removeu = stub.removerCategoria(id);
		return new ResponseEntity<Boolean>(removeu, HttpStatus.OK);
	}
	
	@GetMapping("/anuncio")
	public Categoria anuncio(@RequestParam(value = "id") String id) throws RemoteException, SQLException {
		//Endereco logou = stub.logar(id);
		//return new Endereco(logou);
		return null;
	}
	
	@RequestMapping(value = "/cadastroDeAnuncio", method = RequestMethod.POST)
	public ResponseEntity<Integer> cadastroDeAnuncio(@RequestBody Anuncio anuncio) throws RemoteException, SQLException {
		Integer id = stub.cadastrarAnuncio(anuncio);
		return new ResponseEntity<Integer>(id, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/atualizarAnuncio", method = RequestMethod.PUT)
	public ResponseEntity<Boolean> atualizarAnuncio(@RequestBody Anuncio anuncio) throws RemoteException, SQLException {
		Boolean atualizou = stub.atualizarAnuncio(anuncio);
		return new ResponseEntity<Boolean>(atualizou, HttpStatus.OK);
	}
	
	@RequestMapping(value = {"/deletarAnuncio/{id}"}, method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> deletarAnuncio(@PathVariable final int id) throws RemoteException, SQLException {
		Boolean removeu = stub.removerAnuncio(id);
		return new ResponseEntity<Boolean>(removeu, HttpStatus.OK);
	}
	
	@GetMapping("/aluguel")
	public Aluguel aluguel(@RequestParam(value = "id") int id) throws RemoteException, SQLException {
		Aluguel aluguel = stub.dadosDeAluguel(id);
		return aluguel;
	}
	
	@RequestMapping(value = "/cadastroDeAluguel", method = RequestMethod.POST)
	public ResponseEntity<Integer> cadastroDeAluguel(@RequestBody Aluguel aluguel) throws RemoteException, SQLException {
		Integer id = stub.cadastrarAluguel(aluguel);
		return new ResponseEntity<Integer>(id, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/atualizarAluguel", method = RequestMethod.PATCH)
	public ResponseEntity<Boolean> atualizarAluguel(@RequestBody Aluguel aluguel) throws RemoteException, SQLException {
		Boolean atualizou = stub.atualizarAluguel(aluguel);
		return new ResponseEntity<Boolean>(atualizou, HttpStatus.OK);
	}
	
	@RequestMapping(value = {"/deletarAluguel/{id}"}, method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> deletarAluguel(@PathVariable final int id) throws RemoteException, SQLException {
		Boolean removeu = stub.removerAluguel(id);
		return new ResponseEntity<Boolean>(removeu, HttpStatus.OK);
	}
}
