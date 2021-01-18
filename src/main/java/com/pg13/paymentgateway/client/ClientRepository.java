package com.pg13.paymentgateway.client;


import org.springframework.data.repository.CrudRepository;


import java.util.List;


public interface ClientRepository extends CrudRepository {
    List<Client> findByLastName(String lastName);
    Client findById(long id);
}
