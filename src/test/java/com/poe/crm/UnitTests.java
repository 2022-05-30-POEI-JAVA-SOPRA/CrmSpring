package com.poe.crm;

import com.poe.crm.business.Client;
import com.poe.crm.business.service.CrmService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

class UnitTests {

	@Test
	void testAjoutClient() {
		CrmService crmService = new CrmService();
		Client client = new Client();
		client.setFirstName("Alain");
		client.setLastName("Delon");
		crmService.addClient(client);

		Assertions.assertEquals(1, crmService.getAllClients().size());
	}

	@Test
	void testFindClient(){
		CrmService crmService = new CrmService();
		Client client = new Client();
		client.setFirstName("Alain");
		client.setLastName("Delon");
		crmService.addClient(client);

		Assertions.assertNotNull(crmService.findClient(1L));
	}
}
