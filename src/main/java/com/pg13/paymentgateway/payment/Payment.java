package com.pg13.paymentgateway.payment;


import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "payments")
@EntityListeners(AuditingEntityListener.class)

public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "method",nullable = false)
    private String method;

    @Column(name = "currency", nullable = false)
    private String currency;
    @Column(name = "email_address", nullable = false)
    private String email;
    @Column(name = "bundle", nullable = false)
    private String bundle;
}
