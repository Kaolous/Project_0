package com.revature.service;

import com.revature.doa.ClientRepository;
import com.revature.exceptions.BadParameterException;
import com.revature.model.Client;

public class ClientService {
	
	private ClientRepository clientRepository;
	
	public ClientService() {
		this.clientRepository = new ClientRepository();
	}

	public ClientService(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}
	
	public Client getClientById(String stringId) throws BadParameterException {
		try {
			int id = Integer.parseInt(stringId);
			
			Client client = clientRepository.getClientById(id);
			return client;
		} catch(NumberFormatException e) {
			throw new BadParameterException("Pirate id must be an int. User provided " + stringId);
		}
	}
}
