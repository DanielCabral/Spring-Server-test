package com.example.restservice;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.server.StubProxy;

import models.Acesso;


@RestController
public class RentPayController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	StubProxy stub = new StubProxy(); 
	
	@GetMapping("/login")
	public Acesso login(@RequestParam(value = "name") String name,@RequestParam(value = "password") String password) throws RemoteException, SQLException {
	
		boolean logou = stub.logar(name, password);
		return new Acesso(logou);
	}
}
