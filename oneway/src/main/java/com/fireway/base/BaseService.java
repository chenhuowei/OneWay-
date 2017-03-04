package com.fireway.base;

import java.util.List;

public interface BaseService<T> {

	void save(T t);
	void saveSelect(T t);
	
	void deleteById(String id);
	
	void update(T t);
	void updateSelect(T t);
	
	List<T> findAll();
	List<T> findByPage();
   
}
