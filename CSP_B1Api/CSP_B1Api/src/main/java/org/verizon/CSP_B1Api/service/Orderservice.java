package org.verizon.CSP_B1Api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.verizon.CSP_B1Api.model.Ordermodel;
import org.verizon.CSP_B1Api.repo.Orderrepo;
@Service
public class Orderservice {
private final Orderrepo orderrepo;
@Autowired
public Orderservice(Orderrepo orderrepo) {
this.orderrepo = orderrepo;

}
 
public List<Ordermodel> getAllOrdermodel()
{
return orderrepo.findAll();
}

public Ordermodel createcatalogmodel(Ordermodel ordermod) {
return orderrepo.save(ordermod);
}
}