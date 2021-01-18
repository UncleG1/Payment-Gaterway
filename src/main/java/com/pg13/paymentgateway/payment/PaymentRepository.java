package com.pg13.paymentgateway.payment;

import org.springframework.data.repository.CrudRepository;



public interface PaymentRepository extends CrudRepository {

    Payment findById(long id);
}
