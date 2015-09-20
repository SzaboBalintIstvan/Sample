package training.crudproject.sample.businessapi.remote;

import java.util.List;

import training.crudproject.sample.core.entity.Product;

public interface ProductServiceRemote {
	public Product findClientByClientId(String clientId);
	 
	public Product saveClient(Product client);
	
	public void removeClient(String clientId);
	
	public void updateClient(Product client);
	
	public List<Product> findAll();
}
