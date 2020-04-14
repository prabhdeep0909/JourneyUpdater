package models;

import io.ebean.annotation.Sql;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Sql
public class ActiveCustomer {
    private Integer gatewayId;
    private String name;
    private Date createdOn;

    public Integer getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(Integer gatewayId) {
        this.gatewayId = gatewayId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
}
