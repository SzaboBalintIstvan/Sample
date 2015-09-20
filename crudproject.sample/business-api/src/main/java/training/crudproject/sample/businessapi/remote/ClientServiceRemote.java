package training.crudproject.sample.businessapi.remote;

import java.util.List;

import training.crudproject.sample.core.entity.Client;

public interface ClientServiceRemote {
	public Client findClientByClientId(String clientId) throws Exception;
	
	public void saveClient(Client client) throws Exception;
	
	public void removeClient(String clientId) throws Exception;
	
	public void updateClient(Client client) throws Exception;
	
	public List<Client> findAll() throws Exception;
}
