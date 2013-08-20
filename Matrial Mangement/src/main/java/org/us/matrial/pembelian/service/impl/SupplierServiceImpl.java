package org.us.matrial.pembelian.service.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.us.matrial.pembelian.model.Supplier;
import org.us.matrial.pembelian.repository.SupplierRepository;
import org.us.matrial.pembelian.service.SupplierService;

@Service("supplierService")
@Repository
@Transactional
public class SupplierServiceImpl implements SupplierService {
	private Logger log = Logger.getLogger(SupplierServiceImpl.class);

	@PersistenceContext
	private EntityManager em;
	@Autowired
	private SupplierRepository supplierRepository;

	@Transactional
	@Override
	public Supplier saveOrUpdate(Supplier entity) {
		// TODO Auto-generated method stub
		return supplierRepository.save(entity);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public Iterable<Supplier> saveOrUpdate(Iterable<? extends Supplier> entities) {
		// TODO Auto-generated method stub
		return (Iterable<Supplier>) supplierRepository.save(entities);
	}

	@Transactional
	@Override
	public void delete(Supplier entity) {
		// TODO Auto-generated method stub
		supplierRepository.delete(entity);
	}

	@Transactional
	@Override
	public void delete(Iterable<? extends Supplier> entities) {
		// TODO Auto-generated method stub
		supplierRepository.delete(entities);
	}

	@Transactional
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		supplierRepository.deleteAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Supplier findById(Long id) {
		// TODO Auto-generated method stub
		return supplierRepository.findOne(id);
	}

	@Transactional(readOnly = true)
	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return supplierRepository.exists(id);
	}

	@Transactional(readOnly = true)
	@Override
	public long count() {
		// TODO Auto-generated method stub
		return supplierRepository.count();
	}

	@Transactional(readOnly = true)
	@Override
	public Iterable<Supplier> findAll() {
		// TODO Auto-generated method stub
		return supplierRepository.findAll();
	}

}
