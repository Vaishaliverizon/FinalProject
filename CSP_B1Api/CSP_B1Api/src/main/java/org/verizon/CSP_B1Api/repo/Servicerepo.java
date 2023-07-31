package org.verizon.CSP_B1Api.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.verizon.CSP_B1Api.model.Servicemodel;


@Repository
public interface Servicerepo extends JpaRepository<Servicemodel, Integer> {

}
