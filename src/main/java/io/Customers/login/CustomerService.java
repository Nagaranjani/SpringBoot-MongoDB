package io.Customers.login;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.Bean.Customer;
import io.Customers.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepo;
	
	public List<Customer>getCustomers(){
		return customerRepo.findAll();
	}
	public Optional<Customer> getCustomer(String userName){
		//return customers.stream().filter(c -> c.getUser_name().equals(uName)).findFirst().get();
		return customerRepo.findByUserName(userName);
	}

	public String addCustomer(Customer customer) {
		customerRepo.save(customer);
		return "Added Customer with id : "+customer.getId();
	}
	public String updateCustomer(Customer customer) {
		customerRepo.save(customer);
		return "Updated Customer with id : "+customer.getId();
	}
	public void deleteCustomer(String Username) {
		customerRepo.deleteByUserName(Username);
	}
}
