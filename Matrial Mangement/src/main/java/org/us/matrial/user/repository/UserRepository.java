package org.us.matrial.user.repository;

import org.springframework.data.repository.CrudRepository;
import org.us.matrial.user.model.User;

public interface UserRepository extends CrudRepository<User, Long>  {

	public User findByUsername(String username);
}
