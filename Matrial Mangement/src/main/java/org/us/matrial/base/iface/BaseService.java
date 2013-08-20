package org.us.matrial.base.iface;

import java.io.Serializable;

public interface BaseService<T,ID extends Serializable> {
	 T saveOrUpdate(T entity);
	 Iterable<T> saveOrUpdate(Iterable<? extends T> entities);
	 void delete(T entity);
	 void delete(Iterable<? extends T> entities);
	 void deleteAll();
	 T findById(ID id);
	 boolean exists(ID id);
	 long count();
	 Iterable<T> findAll();

}
