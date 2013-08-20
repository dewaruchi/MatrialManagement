package org.us.matrial.penjualan.service.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.us.matrial.penjualan.model.Transaksi;
import org.us.matrial.penjualan.repository.TransaksiRepository;
import org.us.matrial.penjualan.service.TransaksiService;

@Service("transaksiService")
@Repository
@Transactional
public class TransaksiServiceImpl implements TransaksiService {
	private Logger log = Logger.getLogger(TransaksiServiceImpl.class);

	@PersistenceContext
	private EntityManager em;
	@Autowired
	private TransaksiRepository transaksiRepository;

	@Transactional
	@Override
	public Transaksi saveOrUpdate(Transaksi entity) {
		// TODO Auto-generated method stub
		return transaksiRepository.save(entity);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public Iterable<Transaksi> saveOrUpdate(Iterable<? extends Transaksi> entities) {
		// TODO Auto-generated method stub
		return (Iterable<Transaksi>) transaksiRepository.save(entities);
	}

	@Transactional
	@Override
	public void delete(Transaksi entity) {
		// TODO Auto-generated method stub
		transaksiRepository.delete(entity);
	}

	@Transactional
	@Override
	public void delete(Iterable<? extends Transaksi> entities) {
		// TODO Auto-generated method stub
		transaksiRepository.delete(entities);
	}

	@Transactional
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		transaksiRepository.deleteAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Transaksi findById(Long id) {
		// TODO Auto-generated method stub
		return transaksiRepository.findOne(id);
	}

	@Transactional(readOnly = true)
	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return transaksiRepository.exists(id);
	}

	@Transactional(readOnly = true)
	@Override
	public long count() {
		// TODO Auto-generated method stub
		return transaksiRepository.count();
	}

	@Transactional(readOnly = true)
	@Override
	public Iterable<Transaksi> findAll() {
		// TODO Auto-generated method stub
		return transaksiRepository.findAll();
	}

}
