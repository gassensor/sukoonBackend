package com.staxrt.tutorial.springbootrestapitutorial;

//import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.springframework.data.annotation.CreatedBy;
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.LastModifiedBy;
//import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity

@Table(name = "users")

@EntityListeners(AuditingEntityListener.class)

public class User {

    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)

    private long  id;

    @Column(name = "first_name")

    private String firstName;

    @Column(name = "last_name")

    private String lastName;

    @Column(name = "email_address")

    private String email;


  public long getId() {

        return id;

    }

  

  public void setId(long id) {

        this.id = id;

    }

  
  public String getFirstName() {

        return firstName;

    }

 

  public void setFirstName(String firstName) {

        this.firstName = firstName;

    }

 

  public String getLastName() {

        return lastName;

    }

  

  public void setLastName(String lastName) {

        this.lastName = lastName;

    }

 

  public String getEmail() {

        return email;

    }

 

  public void setEmail(String email) {

        this.email = email;
 
  }

}