/******************************************************************
  			BaseDaoImpl.java
			- Attribution-Noncommercial-Share Alike 3.0 Unported

You are free, to Share  — to copy, distribute and transmit the work, 
to Remix — to adapt the work refer to 
http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_US more details

********************************************************************/

package com.yxz97.hr.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.yxz97.hr.dao.BaseDao;
import com.yxz97.hr.domain.BaseDomain;

public abstract class BaseDaoImpl<T extends BaseDomain> implements BaseDao<T> {

	private Class<T> prototype;

	@PersistenceContext
	private EntityManager entityManager;

	protected abstract String listByNamedQuery();

	protected abstract String getByNamedQuery();

	public BaseDaoImpl(Class<T> prototype) {
		this.prototype = prototype;
	}

	@Override
	public void delete(T entity) {
		entity = entityManager.find(prototype, entity.getId());
		entityManager.remove(entity);
	}

	@Override
	public void delete(Long entityId) {
		Object obj = entityManager.find(prototype, entityId);
		entityManager.remove(obj);
	}

	@Override
	public List<T> loadAll() {
		TypedQuery<T> query = entityManager.createNamedQuery(
				listByNamedQuery(), prototype);
		return query.getResultList();
	}

	@Override
	public T loadById(Long entityId) {
		return entityManager.find(prototype, entityId);
	}

	@Override
	public T read(String entityName) {
		TypedQuery<T> typedQuery = entityManager.createNamedQuery(getByNamedQuery(), prototype);
		return typedQuery.getSingleResult();
	}

	@Override
	public T save(T entity) {
		if (entity.getId() == null)
			entityManager.persist(entity);
		else
			entityManager.merge(entity);
		return entity;
	}

}
