package org.us.matrial.user.service.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;
import org.hibernate.envers.AuditReader;
import org.hibernate.envers.AuditReaderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.us.matrial.user.model.User;
import org.us.matrial.user.repository.UserRepository;
import org.us.matrial.user.service.UserService;

@Service("userService")
@Repository
@Transactional
public class UserServiceImpl implements UserService{
	private Logger log = Logger.getLogger(UserServiceImpl.class);
	
	/* -fill if you need method just leave blank if u dont need
	 * -for simple query u can write and use on userRepository
	 */
	@PersistenceContext
	private EntityManager em;
	@Autowired 
	private UserRepository userRepository;
	
	@Transactional
	@Override
	public User saveOrUpdate(User entity) {
		// TODO Auto-generated method stub
		return userRepository.save(entity);
	}
	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public Iterable<User> saveOrUpdate(Iterable<? extends User> entities) {
		// TODO Auto-generated method stub
		return (Iterable<User>) userRepository.save(entities);
	}
	@Transactional
	@Override
	public void delete(User entity) {
		// TODO Auto-generated method stub
		userRepository.delete(entity);
	}
	@Transactional
	@Override
	public void delete(Iterable<? extends User> entities) {
		// TODO Auto-generated method stub
		userRepository.delete(entities);
	}
	@Transactional
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		userRepository.deleteAll();
	}

	@Transactional(readOnly=true)
	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findOne(id);
	}
	@Transactional(readOnly=true)
	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return userRepository.equals(id);
	}
	@Transactional(readOnly=true)
	@Override
	public long count() {
		// TODO Auto-generated method stub
		return userRepository.count();
	}
	@Transactional(readOnly=true)
	@Override
	public Iterable<User> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Transactional(readOnly=true)
	@Override
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return userRepository.findByUsername(username);
	}


	@Transactional(readOnly=true)
	@Override
	public User findAuditByRevision(Long id, int revision) {
		// TODO Auto-generated method stub
		AuditReader auditReader = AuditReaderFactory.get(em);

		return auditReader.find(User.class, id, revision);

	}
	
	
	
}
