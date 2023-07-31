package org.verizon.CSP_B1Api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.verizon.CSP_B1Api.model.Servicemodel;
import org.verizon.CSP_B1Api.service.Serviceservice;

@RestController
@RequestMapping("/api/servicemodel")
public class Servicecontroller {
	
	private Serviceservice serviceservice;
	
	@Autowired
	public void ServiceController (Serviceservice serviceservice) {
		this.serviceservice = serviceservice;
	}
	@RequestMapping("/allservice")
	public List<Servicemodel>getAllServicemodel(){
		return serviceservice.getAllServicemodel();
	}
	@PostMapping("/insertservice")
	public Servicemodel createservicemodel (@RequestBody Servicemodel servmod)
	{
		return serviceservice.createservicemodel(servmod);
		
	}

}
