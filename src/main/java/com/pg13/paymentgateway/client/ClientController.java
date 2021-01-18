package com.pg13.paymentgateway.client;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    private final ClientRepository repository;

    ClientController(ClientRepository repository){
        this.repository = repository;
    }

    @GetMapping("/client")
    List<Client> all(){
        return (List<Client>) repository.findAll();
    }

    @PostMapping("/clients")
    Client newClient(@RequestBody Client newClient){
        return (Client) repository.save(newClient);


    }
    @GetMapping("/clients/{id}")
    Client one(@PathVariable Long id) throws Throwable {

        return (Client) repository.findById(id)
                .orElseThrow(() -> new ClientNotFoundException(id));

        }
        @PutMapping("/clients/{id}")
    Client replaceClient(@RequestBody Client newClient, @PathVariable Long id) {
            return (Client) repository.findById(id)
                    .map(client -> {
                        newClient.setFirstName(newClient.getFirstName());
                        newClient.setLastName(newClient.getLastName());
                        newClient.setDob(newClient.getDob());
                        return repository.save(client);

                    })
                .orElseGet(() -> {
                newClient.setId(id);
                return repository.save(newClient);
            });
        }
            @DeleteMapping("/clients/{id}")
            void deleteClient(@PathVariable Long id) {
                repository.deleteById(id);
        }
    }



