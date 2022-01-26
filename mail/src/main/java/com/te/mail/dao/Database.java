package com.te.mail.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.te.mail.model.Drafts;
import com.te.mail.model.Register;

@Component
public class Database {

	private static EntityManager getEntityManager() {
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("mail");
		return createEntityManagerFactory.createEntityManager();
	}

	public Boolean store(Register reg) {
		try {
			EntityManager entityManager = getEntityManager();
			EntityTransaction transaction = entityManager.getTransaction();
			String mail = reg.getRegMail();
			transaction.begin();
			Query createQuery = entityManager.createQuery("from Register where regMail=:mail");
			createQuery.setParameter("mail",mail);
			Object singleResult = createQuery.getSingleResult();
			if(singleResult.equals(mail)) {
				return false;
			}
			entityManager.persist(reg);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public String fetch(String mailid, String upass) {
		try {
			Object name = null;
			EntityManager entityManager = getEntityManager();
			EntityTransaction transaction = entityManager.getTransaction();
			transaction.begin();
			Query createQuery = entityManager.createQuery("select regPass from Register where regMail=:mail1");
			createQuery.setParameter("mail1", mailid);
			Object singleResult = createQuery.getSingleResult();
			if (upass.equals(singleResult)) {
				Query createQuery2 = entityManager.createQuery("select regName from Register where regMail=:mail2");
				createQuery2.setParameter("mail2", mailid);
				name = createQuery2.getSingleResult();
			}
			return (String) name;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public boolean save(ComposeData compose) {
		try {
			EntityManager entityManager = getEntityManager();
			EntityTransaction transaction = entityManager.getTransaction();
			Query createQuery = entityManager.createQuery("select regMail from Register where regMail=:mail");
			createQuery.setParameter("mail", compose.getToAddress());
			transaction.begin();
			Object singleResult = createQuery.getSingleResult();
			if (singleResult == null) {
				return false;
			}
			entityManager.persist(compose);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public List<ComposeData> getInbox(Object emailId) {
		List<ComposeData> resultList = null;
		try {
			EntityManager entityManager = getEntityManager();
			EntityTransaction transaction = entityManager.getTransaction();
			Query createQuery = entityManager.createQuery("from ComposeData where toAddress=:mail");
			createQuery.setParameter("mail", emailId);
			resultList = createQuery.getResultList();
			return resultList;
		} catch (Exception e) {
			e.printStackTrace();
			return resultList;
		}
	}
	public List<ComposeData> getSent(Object emailId) {
		List<ComposeData> resultList = null;
		try {
			EntityManager entityManager = getEntityManager();
			EntityTransaction transaction = entityManager.getTransaction();
			Query createQuery = entityManager.createQuery("from ComposeData where fromAddress=:mail");
			createQuery.setParameter("mail",emailId);
			resultList = createQuery.getResultList();
			return resultList;
		} catch (Exception e) {
			e.printStackTrace();
			return resultList;
		}
	}
	public List<Drafts> getDrafts(Object emailId) {
		List<Drafts> resultList = null;
		try {
			EntityManager entityManager = getEntityManager();
			EntityTransaction transaction = entityManager.getTransaction();
			Query createQuery = entityManager.createQuery("from Drafts where fromAddress=:mail");
			createQuery.setParameter("mail",emailId);
			resultList = createQuery.getResultList();
			return resultList;
		} catch (Exception e) {
			e.printStackTrace();
			return resultList;
		}
	}
	public boolean saveDraft(Drafts drafts) {
		try {
		EntityManager entityManager = getEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(drafts);
		transaction.commit();
		return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public Boolean change(String mailId, String newPassword) {
		try {
		EntityManager entityManager = getEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		Query createQuery = entityManager.createQuery("from Register where regMail=:mail");
		Query createQuery2 = entityManager.createQuery("update Register set regPass=:pass where regMail=:mail");
		createQuery2.setParameter("mail", mailId);
		createQuery.setParameter("mail", mailId);
		createQuery2.setParameter("pass", newPassword);
		createQuery2.executeUpdate();
		return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	

}
