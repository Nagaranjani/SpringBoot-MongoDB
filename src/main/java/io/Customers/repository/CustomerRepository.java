package io.Customers.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import io.Bean.Customer;
@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
	public void deleteByUserName(String UserName);
	public Optional<Customer> findByUserName(String UserName);
}
