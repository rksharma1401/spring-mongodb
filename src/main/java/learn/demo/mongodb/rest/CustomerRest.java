package learn.demo.mongodb.rest;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	@PostMapping(path = "/{id}")
	public Optional<Customer> findById(@PathParam("{id}") String id) {
		return repository.findById(id);
	}
	@GetMapping(path ="/" )
	public List<Customer> findAll() {
		return repository.findAll();
	}
}