package com.poe.crm;

import com.poe.crm.business.Client;
import com.poe.crm.business.service.CrmService;
import com.poe.crm.dao.ClientRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CrmApplicationTests {

	@Autowired
	CrmService crmService;

	@Autowired
	ClientRepository clientRepository;


	@Test
	void testAddClient() {

		Client client = new Client();
		client.setFirstName("Alain");
		client.setLastName("Delon");
		crmService.addClient(client);

		Assertions.assertEquals(1, crmService.getAllClients().size());
	}

	@Test
	void testClientRepository() {
		List<Client> sqlClients = clientRepository.findAll();
		Assertions.assertTrue(sqlClients.size() > 0);
	}

	@Test
	void testFindAllByCompanyName() {
		List<Client> clientsGoogle = clientRepository.findAllByCompanyName("Google");
		Assertions.assertTrue(clientsGoogle.size() > 0);
		for(Client client: clientsGoogle){
			System.out.println(client);
		}
	}

	@Test
	void testFindAllByFirstNameAndLastName(){
		List<Client> clientsGoogle = clientRepository.
				findAllByFirstNameAndLastName("JC", "Dominguez");
		Assertions.assertTrue(clientsGoogle.size() > 0);
		for(Client client: clientsGoogle){
			System.out.println(client);
		}
	}
}
