package com.example.server;



import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import models.Aluguel;
import models.Anuncio;
import models.Categoria;
import models.Endereco;
import models.Usuario;

public class StubProxy {
	private static String nomeServidor = "127.0.0.1";
	private static int porta = 12345;
	private static final String NOMEOBJDIST = "Servidor";
	Registry registro;
	InterfaceDoServidor stub;
	
	public StubProxy() {
		try {
			
			//Politica de seguran�a
			System.setProperty("java.security.policy", "java.policy");
			if (System.getSecurityManager() == null) {
			 System.setSecurityManager(new SecurityManager());
			}
			
			System.setProperty("java.security.policy","file:java.policy");
			
			
			// Obtendo refer^encia do servi¸co de registro
			registro = LocateRegistry.getRegistry(nomeServidor, porta);
			System.out.println("Conectado com servidor");
			// Procurando pelo objeto distribu´ıdo registrado previamente com o NOMEOBJDIST
			stub = (InterfaceDoServidor) registro.lookup(NOMEOBJDIST);
		} catch (RemoteException | NotBoundException ex) {
			Logger.getLogger(StubProxy.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	public boolean logar(String name, String password) throws RemoteException, SQLException{
		return stub.logar(name, password);
	}
	
	public int cadastrarUsuario(Usuario usuario) throws RemoteException, SQLException{
		return stub.cadastrarUsuario(usuario);
	}
	public int cadastrarEndereco(Endereco endereco, int id_user) throws RemoteException, SQLException{
		return stub.cadastrarEndereco(endereco, id_user);
	}
	public int cadastrarCategoria(Categoria categoria) throws RemoteException, SQLException{
		return stub.cadastrarCategoria(categoria);
	}
	public int cadastrarAluguel(Aluguel aluguel) throws RemoteException, SQLException{
		return stub.cadastrarAluguel(aluguel);
	}
	public int cadastrarAnuncio(Anuncio anuncio) throws RemoteException, SQLException{
		return stub.cadastrarAnuncio(anuncio);
	}
	public boolean atualizarUsuario(Usuario usuario) throws RemoteException, SQLException{
		return stub.atualizarUsuario(usuario);
	}
	public boolean atualizarEndereco(Endereco endereco, int id_user) throws RemoteException, SQLException{
		return stub.atualizarEndereco(endereco, id_user);
	}
	public boolean atualizarCategoria(Categoria categoria) throws RemoteException, SQLException{
		return stub.atualizarCategoria(categoria);
	}
	public boolean atualizarAluguel(Aluguel aluguel) throws RemoteException, SQLException{
		return stub.atualizarAluguel(aluguel);
	}
	public boolean atualizarAnuncio(Anuncio anuncio) throws RemoteException, SQLException{
		return stub.atualizarAnuncio(anuncio);
	}
	public boolean removerUsuario(int usuario) throws RemoteException, SQLException{
		return stub.removerUsuario(usuario);
	}
	public boolean removerCategoria(int idCategoria) throws RemoteException, SQLException{
		return stub.removerCategoria(idCategoria);
	}
	public boolean removerAluguel(int idAluguel) throws RemoteException, SQLException{
		return stub.removerAluguel(idAluguel);
	}
	public boolean removerAnuncio(int idAnuncio) throws RemoteException, SQLException{
		return stub.removerAnuncio(idAnuncio);
	}
	public Usuario dadosDoUsuario(int id) throws RemoteException, SQLException{
		return stub.dadosDoUsuario(id);
	}
	public Endereco dadosDeEndereco(int id) throws RemoteException, SQLException{
		return stub.dadosDeEndereco(id);
	}
	public Categoria dadosDeCategoria(int id) throws RemoteException, SQLException{
		return stub.dadosDeCategoria(id);
	}
	public Aluguel dadosDeAluguel(int id) throws RemoteException, SQLException{
		return stub.dadosDeAluguel(id);
	}
	public Anuncio dadosDoAnuncio(int id) throws RemoteException, SQLException{
		return stub.dadosDoAnuncio(id);
	}
	public static void main(String [] args) throws RemoteException, SQLException {
		StubProxy s = new StubProxy();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(s.logar("daniel", "123"));
	}
	
}
