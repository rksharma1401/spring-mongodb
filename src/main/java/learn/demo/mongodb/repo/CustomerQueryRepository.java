package learn.demo.mongodb.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import learn.demo.mongodb.entity.Customer;

public interface CustomerQueryRepository
		extends MongoRepository<Customer, String>, QuerydslPredicateExecutor<Customer> {

	@Query(sort="{lastName : 1}")
	public List<Customer> findByFirstName(String firstName);

	public List<Customer> findByLastName(String lastName);
	 
}