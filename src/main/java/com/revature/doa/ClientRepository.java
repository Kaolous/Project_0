package com.revature.doa;

import java.util.ArrayList;

import com.revature.model.Client;

public class ClientRepository {
	
	private ArrayList<Client> client;
	
	public void createClient(String firstName, String lastName) {
		client.add(new Client(client.size()+1, firstName, lastName));
	}
	
	public void createClient(String firstName, String lastName, long phoneNumber) {
		client.add(new Client(client.size()+1, firstName, lastName, phoneNumber));
	}

	public void updateClientById(int clientId, String firstName) {
		client.get(clientId+1).setFirstName(firstName);
	}
	
	public void updateClientById(int clientId, String firstName, String lastName) {
		client.get(clientId+1).setFirstName(firstName);
		client.get(clientId+1).setLastName(lastName);
	}
	
	public void updateClientById(int clientId, String firstName, String lastName, long phoneNumber) {
		client.get(clientId+1).setFirstName(firstName);
		client.get(clientId+1).setLastName(lastName);
		client.get(clientId+1).setPhoneNumber(phoneNumber);
	}
	
	public void deleteClientById(int clientId) {
		client.remove(clientId-1);
	}
	
	public Client getClientById(int clientId) {
		return client.get(clientId-1);
	}

}