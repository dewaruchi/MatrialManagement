package org.us.matrial.penjualan.repository;

import org.springframework.data.repository.CrudRepository;
import org.us.matrial.penjualan.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
