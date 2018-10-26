package io.Bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString

@Document(collection="customer")
public class Customer {
@Id
private int id;
private String firstName;
private String lastName;
private String userName;
private String password;
private boolean provider;
}
