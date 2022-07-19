package com.poe.crm.api;

import com.poe.crm.business.Client;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ClientController {

    @GetMapping("clients")
    public List<Client> getAll() {

        ArrayList<Client> clients = new ArrayList<>();
        clients.add(new Client("Google", "Michel", "Dupont", "a@a.com", "0606066006", "12 rue de l'église", "75000",
                "Paris", "France"));
        clients.add(new Client("Google", "Marie", "Delon", "a@a.com", "0606066006", "12 rue de l'église", "75000",
                "Paris", "France"));
        return clients;
    }
}
