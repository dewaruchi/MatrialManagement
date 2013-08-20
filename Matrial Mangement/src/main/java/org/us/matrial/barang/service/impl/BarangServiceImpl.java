package org.us.matrial.barang.service.impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.us.matrial.barang.model.Barang;
import org.us.matrial.barang.repository.BarangRepository;
import org.us.matrial.barang.service.BarangService;

@Service("barangService")
@Repository
@Transactional
public class BarangServiceImpl implements BarangService {
	private Logger log = Logger.getLogger(BarangServiceImpl.class);

	@PersistenceContext
	private EntityManager em;
	@Autowired
	private BarangRepository barangRepository;

	@Transactional
	@Override
	public Barang saveOrUpdate(Barang entity) {
		// TODO Auto-generated method stub
		return barangRepository.save(entity);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public Iterable<Barang> saveOrUpdate(Iterable<? extends Barang> entities) {
		// TODO Auto-generated method stub
		return (Iterable<Barang>) barangRepository.save(entities);
	}

	@Transactional
	@Override
	public void delete(Barang entity) {
		// TODO Auto-generated method stub
		barangRepository.delete(entity);
	}

	@Transactional
	@Override
	public void delete(Iterable<? extends Barang> entities) {
		// TODO Auto-generated method stub
		barangRepository.delete(entities);
	}

	@Transactional
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		barangRepository.deleteAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Barang findById(String id) {
		// TODO Auto-generated method stub
		return barangRepository.findOne(id);
	}

	@Transactional(readOnly = true)
	@Override
	public boolean exists(String id) {
		// TODO Auto-generated method stub
		return barangRepository.exists(id);
	}

	@Transactional(readOnly = true)
	@Override
	public long count() {
		// TODO Auto-generated method stub
		return barangRepository.count();
	}

	@Transactional(readOnly = true)
	@Override
	public Iterable<Barang> findAll() {
		// TODO Auto-generated method stub
		return barangRepository.findAll();
	}

    static final String findByName = "";
    @Transactional(readOnly = true)
    @Override
    public List<Barang> findByName(String name) {
        Query query = em.createQuery("SELECT b FROM Barang b WHERE b.nama LIKE :kriteria ORDER BY b.nama");
        query.setParameter("kriteria", "%" + name + "%");
        return query.getResultList();
    }


    
    
}
