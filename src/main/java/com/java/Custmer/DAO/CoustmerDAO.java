package com.java.Custmer.DAO;

import java.util.List;

import com.java.Custmer.Entity.Coustmer;

public interface CoustmerDAO {

	public List<Coustmer> getcoustmers();

	public void savecoustmer(Coustmer thecoustmer);

	public Coustmer getcoustmer(int id);
	
}
