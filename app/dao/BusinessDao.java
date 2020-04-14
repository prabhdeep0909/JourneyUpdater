package dao;

import io.ebean.RawSql;
import io.ebean.RawSqlBuilder;
import models.ActiveCustomer;
import org.springframework.stereotype.Repository;
import util.EbeanIssuingServer;

import javax.inject.Singleton;
import java.util.List;

@Singleton
public class BusinessDao {

    public List<ActiveCustomer> getActiveCustomers(){
        String query = "SELECT p.gateway_id as gatewayId, p.name, bpm.created_on as createdOn \n"+
                    "FROM party p\n" +
                    "JOIN business_product_mapping bpm ON p.id=bpm.party_id \n"+
                    "WHERE bpm.product_journey_stages_id=5";
        RawSql rawSql = RawSqlBuilder.parse(query).create();
        List<ActiveCustomer> activeCustomerList = EbeanIssuingServer.find(ActiveCustomer.class).setRawSql(rawSql).findList();
        return activeCustomerList != null ? activeCustomerList : null;
    }
}

//        return Json.toJson(activeCustomerList);