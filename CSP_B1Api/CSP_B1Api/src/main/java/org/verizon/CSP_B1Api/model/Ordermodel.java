package org.verizon.CSP_B1Api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Ordermodel {
@Id
private int orderid;
private int planid;

public Ordermodel() {
super();
}

public int getOrderid() {
return orderid;
}

public void setOrderid(int orderid) {
this.orderid = orderid;
}

public int getPlanid() {
return planid;
}

public void setPlanid(int planid) {
this.planid = planid;
}

}