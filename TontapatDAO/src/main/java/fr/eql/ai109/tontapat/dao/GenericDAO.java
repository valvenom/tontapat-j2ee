package fr.eql.ai109.tontapat.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.eql.ai109.tontapat.idao.GenericIDAO;

public abstract class GenericDAO<T> implements GenericIDAO<T> {

//	@EJB
//	SessionIDao sessionIDao;
	@PersistenceContext(unitName = "myPersistenceUnit")
	EntityManager em = null;
	EntityTransaction tx = null;
	
	public T add(T t) {
		try {
			em = new EntityManagerHolder().getCurrentEntityManager();
			tx = em.getTransaction();
			em.persist(t);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}
		return t;
	}
	
	public void delete(T t) {
		try {
			em = new EntityManagerHolder().getCurrentEntityManager();
			tx = em.getTransaction();
			em.remove(t);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			em
			.close();
		}
	}
	
	public T update(T t) {
		

		try {
			em = new EntityManagerHolder().getCurrentEntityManager();
			tx = em.getTransaction();
			em.merge(t);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}
		return t;
	}
	
	public T getById(int id) {
		T t = null;

		try {
			 em = new EntityManagerHolder().getCurrentEntityManager();
		
			String className = ((ParameterizedType) getClass().getGenericSuperclass())
					.getActualTypeArguments()[0].getTypeName();
			Class<?> clazz;
			clazz = Class.forName(className);
			t = (T) em.find(clazz, id);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}
		return t;
	}
	
	public List<T> getAll() {
		List<T> objects = null;
		try {
			 em = new EntityManagerHolder().getCurrentEntityManager();
			 tx = em.getTransaction();
			
			String className = ((ParameterizedType) getClass().getGenericSuperclass())
					.getActualTypeArguments()[0].getTypeName();
			Class<?> clazz;
			clazz = Class.forName(className);
			Query query = em.createQuery("FROM " + clazz.getName());
			objects = query.getResultList();
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}	
	    return objects;
	}
}