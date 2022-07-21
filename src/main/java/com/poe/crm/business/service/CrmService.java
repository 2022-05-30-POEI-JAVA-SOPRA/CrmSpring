package com.poe.crm.business.service;

import com.poe.crm.business.Client;
import com.poe.crm.dao.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CrmService {

    @Autowired
    ClientRepository clientRepository;

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public void addClient(Client client){
       clientRepository.save(client);
    }

    public Optional<Client> findClient(Long id){
        return clientRepository.findById(id);
    }

    public boolean deleteClient(Long id){
        if(clientRepository.existsById(id)) {
            clientRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    public boolean updateClient(Client client){
        if(clientRepository.existsById(client.getId())) {
            clientRepository.save(client);
            return true;
        } else {
            return false;
        }
    }
}
