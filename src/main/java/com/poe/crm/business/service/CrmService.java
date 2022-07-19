package com.poe.crm.business.service;

import com.poe.crm.business.Client;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CrmService {

    ArrayList<Client> clients = new ArrayList<>();

    public List<Client> getAllClients() {

        return clients;
    }

    public void addClient(Client client){
        clients.add(client);
    }


}
