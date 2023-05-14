package app.persistence;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    @Override
    Optional<Customer> findById(Long aLong);
    List<Customer> findByIdIsBetweenAnd(Long id1,Long id2);
    List<Customer> findByLastName(String lastName);

    List<Customer> findCustomersByFirstNameAndLastName(String firstName, String lastName);
}
