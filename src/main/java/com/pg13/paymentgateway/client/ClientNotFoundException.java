package com.pg13.paymentgateway.client;

public class ClientNotFoundException extends RuntimeException {
    ClientNotFoundException(Long id){
        super("Could not find Client" + id);
    }
}
