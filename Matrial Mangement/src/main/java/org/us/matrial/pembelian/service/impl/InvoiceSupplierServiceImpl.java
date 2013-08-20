package org.us.matrial.pembelian.service.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.us.matrial.pembelian.model.InvoiceSupplier;
import org.us.matrial.pembelian.repository.InvoiceSupplierRepository;
import org.us.matrial.pembelian.service.InvoiceSupplierService;

@Service("invoiceSupplierService")
@Repository
@Transactional
public class InvoiceSupplierServiceImpl implements InvoiceSupplierService {
	private Logger log = Logger.getLogger(InvoiceSupplierServiceImpl.class);

	@PersistenceContext
	private EntityManager em;
	@Autowired
	private InvoiceSupplierRepository invoiceSupplierRepository;

	@Transactional
	@Override
	public InvoiceSupplier saveOrUpdate(InvoiceSupplier entity) {
		// TODO Auto-generated method stub
		return invoiceSupplierRepository.save(entity);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public Iterable<InvoiceSupplier> saveOrUpdate(Iterable<? extends InvoiceSupplier> entities) {
		// TODO Auto-generated method stub
		return (Iterable<InvoiceSupplier>) invoiceSupplierRepository.save(entities);
	}

	@Transactional
	@Override
	public void delete(InvoiceSupplier entity) {
		// TODO Auto-generated method stub
		invoiceSupplierRepository.delete(entity);
	}

	@Transactional
	@Override
	public void delete(Iterable<? extends InvoiceSupplier> entities) {
		// TODO Auto-generated method stub
		invoiceSupplierRepository.delete(entities);
	}

	@Transactional
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		invoiceSupplierRepository.deleteAll();
	}

	@Transactional(readOnly = true)
	@Override
	public InvoiceSupplier findById(Long id) {
		// TODO Auto-generated method stub
		return invoiceSupplierRepository.findOne(id);
	}

	@Transactional(readOnly = true)
	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return invoiceSupplierRepository.exists(id);
	}

	@Transactional(readOnly = true)
	@Override
	public long count() {
		// TODO Auto-generated method stub
		return invoiceSupplierRepository.count();
	}

	@Transactional(readOnly = true)
	@Override
	public Iterable<InvoiceSupplier> findAll() {
		// TODO Auto-generated method stub
		return invoiceSupplierRepository.findAll();
	}

}
