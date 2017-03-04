package com.fireway.base;

import java.util.List;

public interface BaseService<T> {

	void save(T record);
//	void saveSelect(T record);
	
	void deleteById(String id);
	
//	void update(T record);
	void updateSelectById(T record);
	
	T findById(String id);
	
	List<T> findAll();
	List<T> findByPage(BasePageDTO pageDTO);
   
}
