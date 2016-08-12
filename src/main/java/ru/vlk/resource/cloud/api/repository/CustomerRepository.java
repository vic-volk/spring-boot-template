package ru.vlk.resource.cloud.api.repository;

import org.springframework.data.repository.CrudRepository;
import ru.vlk.resource.cloud.api.model.Customer;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}
