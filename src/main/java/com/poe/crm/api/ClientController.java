package com.poe.crm.api;

import com.poe.crm.business.Client;
import com.poe.crm.business.service.CrmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ClientController {

    @Autowired
    CrmService crmService;

    @GetMapping("clients")
    public List<Client> getAll() {

        return crmService.getAllClients();
    }
}
