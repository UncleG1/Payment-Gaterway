package com.pg13.paymentgateway.client;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "clients")
@EntityListeners(AuditingEntityListener.class)

public class Client {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "first_name",nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "email_address", nullable = false)
    private String email;
    @Column(name = "gender", nullable = false)
    private String gender;
    @Column(name = "dob", nullable = false)
    private String dob;
    @Column(name = "createdAt", nullable = false)
    @CreatedDate
    private Date createdAt;




    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getDob(){
        return dob;
    }
    public void setDob(String dob){
        this.dob = dob;
    }

}
