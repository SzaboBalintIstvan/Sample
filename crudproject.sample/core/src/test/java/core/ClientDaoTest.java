package core;
import java.util.Date;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import training.crudproject.sample.core.dao.ClientDao;
import training.crudproject.sample.core.entity.Client;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-test-core.xml")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@Transactional
@TransactionConfiguration(defaultRollback = false)
public class ClientDaoTest {

	private static Client client;

	@Autowired
	ClientDao clientDao;

	@Test
	public void test1Save() {
		try {
			client = new Client();
			client.setClientId("999");
			client.setName("Test");
			client.setRegistrationTime(new Date());
			client = clientDao.save(client);
			
			Client dbclient = clientDao.findClientByClientId(client.getClientId());
			System.out.println(dbclient);
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
