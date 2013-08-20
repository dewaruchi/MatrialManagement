package org.us.matrial.user.service;
import org.us.matrial.base.iface.BaseService;
import org.us.matrial.user.model.User;

public interface UserService extends BaseService<User, Long>{
	
	public User findByUsername(String username);
	public User findAuditByRevision(Long id, int revision);

}
