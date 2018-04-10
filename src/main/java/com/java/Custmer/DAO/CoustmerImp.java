package com.java.Custmer.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.Custmer.Entity.Coustmer;

@Repository
public class CoustmerImp implements CoustmerDAO {

	@Autowired
	private SessionFactory sessionfactory;

	@Override
	public List<Coustmer> getcoustmers() {
		Session session = sessionfactory.getCurrentSession();
		Query<Coustmer> thequery = session.createQuery("from Coustmer", Coustmer.class);
		List<Coustmer> coustmer = thequery.getResultList();
		return coustmer;
	}

	@Override
	public void savecoustmer(Coustmer thecoustmer) {
		Session session = sessionfactory.getCurrentSession();
		session.save(thecoustmer);
	}

	@Override
	public Coustmer getcoustmer(int id) {
		Session session = sessionfactory.getCurrentSession();
		Coustmer thecoustmer = session.get(Coustmer.class, id);
		return thecoustmer;
	}

}
