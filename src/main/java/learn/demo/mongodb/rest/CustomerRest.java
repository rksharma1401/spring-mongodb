package learn.demo.mongodb.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import learn.demo.mongodb.entity.Customer;
import learn.demo.mongodb.repo.CustomerRepository;

@RestController
@RequestMapping(path = "/customer")
public class CustomerRest {

	@Autowired
	private CustomerRepository repository;

	@PostMapping(path = "", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Customer save(@RequestBody Customer cust) {
		System.out.println(cust);
		return repository.save(cust);
	}

	@GetMapping(path = "/{id}")
	public Optional<Customer> findById(@PathVariable("id") String id) {
		return repository.findById(id);
	}

	@GetMapping(path = "")
	public List<Customer> findAll(@RequestParam(required = false, name = "firstName") Optional<String> firstName) {
		if (firstName.isPresent()) {
			return repository.findByFirstName(firstName.get());
		}
		return repository.findAll();
	}

}