/******************************************************************
  			BaseDao.java 
			- Attribution-Noncommercial-Share Alike 3.0 Unported

You are free, to Share  — to copy, distribute and transmit the work, 
to Remix — to adapt the work refer to 
http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_US more details

********************************************************************/

package com.yxz97.hr.dao;

import java.util.List;

import com.yxz97.hr.domain.BaseDomain;

public interface BaseDao<T extends BaseDomain> {
	public T save(T entity);
	public List<T> loadAll();
	public T loadById(Long entityId);
	public T read(final String entityName);
	public void delete(T entity);
	public void delete(Long entityId);
}
