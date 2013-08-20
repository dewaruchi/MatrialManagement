package org.us.matrial.base.iface;

import java.io.Serializable;

public interface BaseTable<T, ID extends Serializable> {
	void save(T entity);
	void update(T entity,int index);
	void delete(int index);
	T get(int index);
        void clear();
        void save(Iterable<T> list);
}
