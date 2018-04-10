package com.java.service;

import java.util.List;

import com.java.Custmer.Entity.Coustmer;

public interface CoustmerService {

	public List<Coustmer> getcoustmers();

	public void savecoustmer(Coustmer thecoustmer);

	public Coustmer getcoustmer(int id);
}
