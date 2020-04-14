package actor;

import akka.actor.Actor;
import akka.actor.IndirectActorProducer;
import com.google.inject.Injector;

public class ActorDependencyInjector implements IndirectActorProducer {

    final Injector injector;
    final Class<? extends Actor> actorClass;

    public ActorDependencyInjector(Injector injector, Class<? extends Actor> actorClass){
        this.injector = injector;
        this.actorClass = actorClass;
    }

    @Override
    public Class<? extends Actor> actorClass(){
        return actorClass;
    }

    @Override
    public Actor produce(){
        return injector.getInstance(actorClass);
    }
}