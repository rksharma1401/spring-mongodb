package learn.demo.mongodb.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import learn.demo.mongodb.entity.Customer;
import learn.demo.mongodb.repo.CustomerRepository;

@RestController
@RequestMapping(path = "/customer")
public class CustomerRest {

	@Autowired
	private CustomerRepository repository;

	@PostMapping(path = "/")
	public Customer save(Customer cust) {
		return repository.save(cust);
	}
	@PostMapping(path = "/")
	public Optional<Customer> findById(String id) {
		return repository.findById(id);
	}
}