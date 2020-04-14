package tasks;

import actor.ActiveClientActor;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import play.Logger;
import scala.concurrent.ExecutionContext;
import scala.concurrent.duration.Duration;

import javax.inject.Inject;
import java.util.concurrent.TimeUnit;

public class ReadActiveCustomerTasks {

    private final ActorRef activeClientActor;
    private final ActorSystem actorSystem;
    private final ExecutionContext executionContext;

    @Inject
    public ReadActiveCustomerTasks(ActorSystem actorSystem,
                                   ExecutionContext executionContext){
        this.actorSystem = actorSystem;
        this.activeClientActor = actorSystem.actorOf(ActiveClientActor.getProps());
        this.executionContext = executionContext;

        this.initialize();
    }

    private void initialize() {

        Logger.error("initializing scheduler");

        this.actorSystem
                .scheduler()
                .schedule(
                        Duration.create(10, TimeUnit.SECONDS), // initialDelay
                        Duration.create(5, TimeUnit.MINUTES), // interval
                        activeClientActor,
                        "Tick",
                        this.executionContext,
                        ActorRef.noSender());

    }
}
