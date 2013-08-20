package org.us.matrial.penjualan.service.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.us.matrial.penjualan.model.Invoice;
import org.us.matrial.penjualan.repository.InvoiceRepository;
import org.us.matrial.penjualan.service.InvoiceService;

@Service("invoiceService")
@Repository
@Transactional
public class InvoiceServiceImpl implements InvoiceService {
	private Logger log = Logger.getLogger(InvoiceServiceImpl.class);

	@PersistenceContext
	private EntityManager em;
	@Autowired
	private InvoiceRepository invoiceRepository;

	@Transactional
	@Override
	public Invoice saveOrUpdate(Invoice entity) {
		// TODO Auto-generated method stub
		return invoiceRepository.save(entity);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public Iterable<Invoice> saveOrUpdate(Iterable<? extends Invoice> entities) {
		// TODO Auto-generated method stub
		return (Iterable<Invoice>) invoiceRepository.save(entities);
	}

	@Transactional
	@Override
	public void delete(Invoice entity) {
		// TODO Auto-generated method stub
		invoiceRepository.delete(entity);
	}

	@Transactional
	@Override
	public void delete(Iterable<? extends Invoice> entities) {
		// TODO Auto-generated method stub
		invoiceRepository.delete(entities);
	}

	@Transactional
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		invoiceRepository.deleteAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Invoice findById(Long id) {
		// TODO Auto-generated method stub
		return invoiceRepository.findOne(id);
	}

	@Transactional(readOnly = true)
	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return invoiceRepository.exists(id);
	}

	@Transactional(readOnly = true)
	@Override
	public long count() {
		// TODO Auto-generated method stub
		return invoiceRepository.count();
	}

	@Transactional(readOnly = true)
	@Override
	public Iterable<Invoice> findAll() {
		// TODO Auto-generated method stub
		return invoiceRepository.findAll();
	}

}
