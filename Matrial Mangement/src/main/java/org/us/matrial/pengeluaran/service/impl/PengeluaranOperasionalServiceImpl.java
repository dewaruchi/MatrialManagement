package org.us.matrial.pengeluaran.service.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.us.matrial.pengeluaran.model.PengeluaranOperasional;
import org.us.matrial.pengeluaran.repository.PengeluaranOperasionalRepository;
import org.us.matrial.pengeluaran.service.PengeluaranOperasionalService;

@Service("pengeluaranOperasionalService")
@Repository
@Transactional
public class PengeluaranOperasionalServiceImpl implements PengeluaranOperasionalService {
	private Logger log = Logger.getLogger(PengeluaranOperasionalServiceImpl.class);

	@PersistenceContext
	private EntityManager em;
	@Autowired
	private PengeluaranOperasionalRepository pengeluaranOperationalRepository;

	@Transactional
	@Override
	public PengeluaranOperasional saveOrUpdate(PengeluaranOperasional entity) {
		// TODO Auto-generated method stub
		return pengeluaranOperationalRepository.save(entity);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public Iterable<PengeluaranOperasional> saveOrUpdate(Iterable<? extends PengeluaranOperasional> entities) {
		// TODO Auto-generated method stub
		return (Iterable<PengeluaranOperasional>) pengeluaranOperationalRepository.save(entities);
	}

	@Transactional
	@Override
	public void delete(PengeluaranOperasional entity) {
		// TODO Auto-generated method stub
		pengeluaranOperationalRepository.delete(entity);
	}

	@Transactional
	@Override
	public void delete(Iterable<? extends PengeluaranOperasional> entities) {
		// TODO Auto-generated method stub
		pengeluaranOperationalRepository.delete(entities);
	}

	@Transactional
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		pengeluaranOperationalRepository.deleteAll();
	}

	@Transactional(readOnly = true)
	@Override
	public PengeluaranOperasional findById(Long id) {
		// TODO Auto-generated method stub
		return pengeluaranOperationalRepository.findOne(id);
	}

	@Transactional(readOnly = true)
	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return pengeluaranOperationalRepository.exists(id);
	}

	@Transactional(readOnly = true)
	@Override
	public long count() {
		// TODO Auto-generated method stub
		return pengeluaranOperationalRepository.count();
	}

	@Transactional(readOnly = true)
	@Override
	public Iterable<PengeluaranOperasional> findAll() {
		// TODO Auto-generated method stub
		return pengeluaranOperationalRepository.findAll();
	}

}
