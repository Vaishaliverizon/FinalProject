package org.verizon.CSP_B1Api.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.verizon.CSP_B1Api.model.Catalogmodel;
import org.verizon.CSP_B1Api.service.Catalogservice;

@RestController
@RequestMapping("/api/catalogmodel")
public class Catalogcontroller {
	private Catalogservice catalogservice;
	
	@Autowired
	public Catalogcontroller(Catalogservice catalogservice) {
		this.catalogservice = catalogservice;
		
	}
	@RequestMapping("/allcat")
	public List<Catalogmodel> getAllCatalogmodel(){
		return catalogservice.getAllCatalogmodel();
	}
	@PostMapping("/insert")
	public Catalogmodel createcatalogmodel(@RequestBody Catalogmodel catmod){
		return catalogservice.createcatalogmodel(catmod);
	}	
}
