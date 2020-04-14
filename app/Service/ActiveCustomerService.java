package Service;

import dao.BusinessDao;
import models.ActiveCustomer;

import org.springframework.stereotype.Service;
import play.Logger;

import javax.inject.Inject;
import java.util.List;

@Service
public class ActiveCustomerService {

    @Inject
    private BusinessDao businessDao;

    public void readActiveCustomers() {
        Logger.info("Active Status Read Service - Started");
        List<ActiveCustomer> activeCustomers =  businessDao.getActiveCustomers();
        Logger.info("Total active customers::{}", activeCustomers.size());
        for (ActiveCustomer customer: activeCustomers){
            Logger.info("Client ID::{}, name::{}, createdOn ::{}", customer.getGatewayId(), customer.getName(), customer.getCreatedOn());
        }
    }
}
