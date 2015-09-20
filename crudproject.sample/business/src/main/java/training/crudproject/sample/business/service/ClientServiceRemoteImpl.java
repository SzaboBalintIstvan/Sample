package training.crudproject.sample.business.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import training.crudproject.sample.businessapi.remote.ClientServiceRemote;
import training.crudproject.sample.core.dao.ClientDao;
import training.crudproject.sample.core.entity.Client;

@Service("clientService")
@Transactional(propagation = Propagation.REQUIRED)
public class ClientServiceRemoteImpl implements ClientServiceRemote,
		Serializable {

	private static final long serialVersionUID = -8550464113132010822L;

	@Autowired
	ClientDao clientDao;

	public ClientServiceRemoteImpl() {
		super();
	}

	public Client findClientByClientId(String clientId) throws Exception {
		Client client = clientDao.findClientByClientId(clientId);
		return client; 
	}

	public void saveClient(Client client) throws Exception{
		clientDao.save(client);
	}

	public void removeClient(String clientId) throws Exception{
		clientDao.delete(clientDao.findClientByClientId(clientId));
	}

	public void updateClient(Client client) throws Exception{
		clientDao.save(client);
	}

	public List<Client> findAll() throws Exception{
		return clientDao.findAll();
	}
}
