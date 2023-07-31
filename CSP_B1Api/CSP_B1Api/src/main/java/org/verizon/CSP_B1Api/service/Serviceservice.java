package org.verizon.CSP_B1Api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.verizon.CSP_B1Api.model.Servicemodel;
import org.verizon.CSP_B1Api.repo.Servicerepo;

@Service
public class Serviceservice {
	private final Servicerepo  servicerepo;
	@Autowired
	public Serviceservice(Servicerepo servicerepo) {
		this.servicerepo = servicerepo;
		
	}
	public List<Servicemodel> getAllServicemodel()
	{
		return servicerepo.findAll();
		
	}
	public Servicemodel createservicemodel(Servicemodel sermod) {
		return servicerepo.save(sermod);
	}

}
