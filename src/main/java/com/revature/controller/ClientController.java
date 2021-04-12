package com.revature.controller;

import com.revature.model.Client;
import com.revature.service.ClientService;

import io.javalin.Javalin;
import io.javalin.http.Handler;

public class ClientController implements Controller {
	
	private ClientService clientService;
	
	public ClientController() {
		this.clientService = new ClientService();
	}
	
	private Handler createClient = ctx -> {
		
	};
	
	private Handler deleteClientById = ctx -> {
		
	};
	
	private Handler updateClientById = ctx -> {
		
	};
	
	private Handler getClientsById = ctx -> {
		String id = ctx.pathParam("id");
		
		Client client = clientService.getClientById(id);
		
		ctx.json(client);
		ctx.status(200);
	};
	
	@Override
	public void mapEndpoints(Javalin app) {
		
	}

}
