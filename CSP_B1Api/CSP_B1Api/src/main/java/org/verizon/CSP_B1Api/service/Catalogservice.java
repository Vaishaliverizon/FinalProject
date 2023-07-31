package org.verizon.CSP_B1Api.service;

import java.util.List;

import javax.xml.catalog.Catalog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.verizon.CSP_B1Api.model.Catalogmodel;
import org.verizon.CSP_B1Api.repo.Catalogrepo;

@Service
public class Catalogservice {
	private final Catalogrepo catalogrepo;
	@Autowired
	public Catalogservice(Catalogrepo catalogrepo) {
		this.catalogrepo = catalogrepo;
	}
	
	public List <Catalogmodel> getAllCatalogmodel()
	{
		return catalogrepo.findAll();
	}
	public Catalogmodel createcatalogmodel(Catalogmodel catmod) {
		return catalogrepo.save(catmod);
	}
	public Catalogmodel updatePlan(Integer id, Catalog ctl) {

		Catalogmodel existingPlan = catalogrepo.findById(id).orElse(null);

		if(existingPlan != null) {

		existingPlan.setPlan(((Catalogmodel) ctl).getPlan());
		existingPlan.setPrice(((Catalogmodel) ctl).getPrice());
		existingPlan.setDuration(((Catalogmodel) ctl).getDuration());
		return catalogrepo.save(existingPlan);

		}

		return null;

		}

}
