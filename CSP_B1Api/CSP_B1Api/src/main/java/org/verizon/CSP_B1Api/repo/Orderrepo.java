package org.verizon.CSP_B1Api.repo;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.verizon.CSP_B1Api.model.Ordermodel;

@Repository
public interface Orderrepo extends JpaRepository<Ordermodel, Integer>{

}
