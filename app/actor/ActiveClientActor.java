package actor;

import Service.ActiveCustomerService;
import akka.actor.AbstractActor;
import akka.actor.Props;
import com.google.inject.Guice;
import com.google.inject.Injector;
import play.Logger;

import javax.inject.Inject;

public class ActiveClientActor extends AbstractActor {

    @Inject
    private ActiveCustomerService activeCustomerService;

    public static Props getProps() {
        Injector injector = Guice.createInjector();
        return Props.create(ActorDependencyInjector.class, injector,  ActiveClientActor.class);
    }

    @Override
    public Receive createReceive() {
        Logger.error("called actor");
        return receiveBuilder()
                .matchEquals(
                        "Tick",
                        m -> {
                            Logger.error("executed actor");
                            activeCustomerService.readActiveCustomers();
                        })
                .build();
    }
}
