package org.us.matrial.pengeluaran.service.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.us.matrial.pengeluaran.model.PengeluaranSales;
import org.us.matrial.pengeluaran.repository.PengeluaranSalesRepository;
import org.us.matrial.pengeluaran.service.PengeluaranSalesService;

@Service("pengeluaranSalesService")
@Repository
@Transactional
public class PengeluaranSalesServiceImpl implements PengeluaranSalesService {
	private Logger log = Logger.getLogger(PengeluaranSalesServiceImpl.class);

	@PersistenceContext
	private EntityManager em;
	@Autowired
	private PengeluaranSalesRepository pengeluaranSalesRepository;

	@Transactional
	@Override
	public PengeluaranSales saveOrUpdate(PengeluaranSales entity) {
		// TODO Auto-generated method stub
		return pengeluaranSalesRepository.save(entity);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public Iterable<PengeluaranSales> saveOrUpdate(Iterable<? extends PengeluaranSales> entities) {
		// TODO Auto-generated method stub
		return (Iterable<PengeluaranSales>) pengeluaranSalesRepository.save(entities);
	}

	@Transactional
	@Override
	public void delete(PengeluaranSales entity) {
		// TODO Auto-generated method stub
		pengeluaranSalesRepository.delete(entity);
	}

	@Transactional
	@Override
	public void delete(Iterable<? extends PengeluaranSales> entities) {
		// TODO Auto-generated method stub
		pengeluaranSalesRepository.delete(entities);
	}

	@Transactional
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		pengeluaranSalesRepository.deleteAll();
	}

	@Transactional(readOnly = true)
	@Override
	public PengeluaranSales findById(Long id) {
		// TODO Auto-generated method stub
		return pengeluaranSalesRepository.findOne(id);
	}

	@Transactional(readOnly = true)
	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return pengeluaranSalesRepository.exists(id);
	}

	@Transactional(readOnly = true)
	@Override
	public long count() {
		// TODO Auto-generated method stub
		return pengeluaranSalesRepository.count();
	}

	@Transactional(readOnly = true)
	@Override
	public Iterable<PengeluaranSales> findAll() {
		// TODO Auto-generated method stub
		return pengeluaranSalesRepository.findAll();
	}

}
