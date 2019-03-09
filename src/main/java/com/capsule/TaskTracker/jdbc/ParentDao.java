package com.capsule.TaskTracker.jdbc;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.capsule.TaskTracker.entity.ParentTask;

@Repository
public class ParentDao {
	
	
	EntityManager entityManager;
	
	@Autowired
	public ParentDao(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	public boolean insertParent(ParentTask parentTask) {
		Session currentSession = entityManager.unwrap(Session.class);
//		ParentTask p = new ParentTask();
//		p.setParentTask(parentTask);
		currentSession.saveOrUpdate(parentTask);		
		return true;
	}

}