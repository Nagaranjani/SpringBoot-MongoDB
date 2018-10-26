package io.Customers.login;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.Bean.Customer;

@RestController
public class LoginController {
	@Autowired
	CustomerService cs;
	@RequestMapping("/list")
	public List<Customer> getCustomerList() {
		return cs.getCustomers();
	}
	@RequestMapping("/get/{username}")
	public Optional<Customer> getCustomerByUser_Name(@PathVariable String username) {
		return cs.getCustomer(username);
	}
	@RequestMapping(method=RequestMethod.POST,value="/addCustomer")
	public String addCustomer(@RequestBody Customer customer) {
		return cs.addCustomer(customer);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/updateCustomer")
	public String updateCustomer(@RequestBody Customer customer) {
		return cs.updateCustomer(customer);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="deleteCustomer/{userName}")
	public void deleteCustomer(@PathVariable String userName) {
		cs.deleteCustomer(userName);
	}
}
