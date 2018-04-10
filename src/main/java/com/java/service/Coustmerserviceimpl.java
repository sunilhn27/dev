package com.java.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.Custmer.DAO.CoustmerDAO;
import com.java.Custmer.Entity.Coustmer;

@Service
public class Coustmerserviceimpl implements CoustmerService {

	@Autowired
	private CoustmerDAO coustmerDAO;

	@Override
	@Transactional
	public List<Coustmer> getcoustmers() {
		return coustmerDAO.getcoustmers();

	}

	@Override
	@Transactional
	public void savecoustmer(Coustmer thecoustmer) {
		coustmerDAO.savecoustmer(thecoustmer);

	}

	@Override
	@Transactional
	public Coustmer getcoustmer(int id) {
		return coustmerDAO.getcoustmer(id);
	}

}
