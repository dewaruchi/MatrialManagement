package org.us.matrial.pembelian.service.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.us.matrial.pembelian.model.TransaksiSupplier;
import org.us.matrial.pembelian.repository.TransaksiSupplierRepository;
import org.us.matrial.pembelian.service.TransaksiSupplierService;

@Service("transaksiSupplierService")
@Repository
@Transactional
public class TransaksiSupplierServiceImpl implements TransaksiSupplierService{
	private Logger log = Logger.getLogger(TransaksiSupplierServiceImpl.class);
	
	
	@PersistenceContext
	EntityManager em;
	@Autowired
	TransaksiSupplierRepository transaksiSupplierRepository;
	
	@Transactional
	@Override
	public TransaksiSupplier saveOrUpdate(TransaksiSupplier entity) {
		// TODO Auto-generated method stub
		transaksiSupplierRepository.save(entity);
		return transaksiSupplierRepository.save(entity);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public Iterable<TransaksiSupplier> saveOrUpdate(
			Iterable<? extends TransaksiSupplier> entities) {
		// TODO Auto-generated method stub
		return (Iterable<TransaksiSupplier>) transaksiSupplierRepository.save(entities);
	}

	@Transactional
	@Override
	public void delete(TransaksiSupplier entity) {
		// TODO Auto-generated method stub
		transaksiSupplierRepository.delete(entity);
	}

	@Transactional
	@Override
	public void delete(Iterable<? extends TransaksiSupplier> entities) {
		// TODO Auto-generated method stub
		transaksiSupplierRepository.delete(entities);
	}

	@Transactional
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		transaksiSupplierRepository.deleteAll();
	}

	@Transactional(readOnly=true)
	@Override
	public TransaksiSupplier findById(Long id) {
		// TODO Auto-generated method stub
		return transaksiSupplierRepository.findOne(id);
	}

	@Transactional(readOnly=true)
	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return transaksiSupplierRepository.exists(id);
	}

	@Transactional(readOnly=true)
	@Override
	public long count() {
		// TODO Auto-generated method stub
		return transaksiSupplierRepository.count();
	}

	@Transactional(readOnly=true)
	@Override
	public Iterable<TransaksiSupplier> findAll() {
		// TODO Auto-generated method stub
		return transaksiSupplierRepository.findAll();
	}

}
