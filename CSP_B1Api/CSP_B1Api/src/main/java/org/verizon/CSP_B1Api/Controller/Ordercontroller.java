package org.verizon.CSP_B1Api.Controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import org.verizon.CSP_B1Api.model.Ordermodel;

import org.verizon.CSP_B1Api.service.Orderservice;

@RestController

@RequestMapping("/api/ordermodel")

public class Ordercontroller {

	private Orderservice orderservice;

	@Autowired
	public Ordercontroller(Orderservice orderservice) {
		this.orderservice = orderservice;

	}
	@RequestMapping("/allorder")

	public List<Ordermodel> getAllOrdermodel(){

		return orderservice.getAllOrdermodel();
	}

	@PostMapping("/insertcatalog")
	public Ordermodel createordermodel(@RequestBody Ordermodel catmod)
	{
		return orderservice.createcatalogmodel(catmod);

}

}