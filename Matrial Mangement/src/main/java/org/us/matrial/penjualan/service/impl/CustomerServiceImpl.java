package org.us.matrial.penjualan.service.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.us.matrial.penjualan.model.Customer;
import org.us.matrial.penjualan.repository.CustomerRepository;
import org.us.matrial.penjualan.service.CustomerService;

@Service("customerService")
@Repository
@Transactional
public class CustomerServiceImpl implements CustomerService {
	private Logger log = Logger.getLogger(CustomerServiceImpl.class);

	@PersistenceContext
	private EntityManager em;
	@Autowired
	private CustomerRepository customerRepository;

	@Transactional
	@Override
	public Customer saveOrUpdate(Customer entity) {
		// TODO Auto-generated method stub
		return customerRepository.save(entity);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public Iterable<Customer> saveOrUpdate(Iterable<? extends Customer> entities) {
		// TODO Auto-generated method stub
		return (Iterable<Customer>) customerRepository.save(entities);
	}

	@Transactional
	@Override
	public void delete(Customer entity) {
		// TODO Auto-generated method stub
		customerRepository.delete(entity);
	}

	@Transactional
	@Override
	public void delete(Iterable<? extends Customer> entities) {
		// TODO Auto-generated method stub
		customerRepository.delete(entities);
	}

	@Transactional
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		customerRepository.deleteAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Customer findById(Long id) {
		// TODO Auto-generated method stub
		return customerRepository.findOne(id);
	}

	@Transactional(readOnly = true)
	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return customerRepository.exists(id);
	}

	@Transactional(readOnly = true)
	@Override
	public long count() {
		// TODO Auto-generated method stub
		return customerRepository.count();
	}

	@Transactional(readOnly = true)
	@Override
	public Iterable<Customer> findAll() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

}
