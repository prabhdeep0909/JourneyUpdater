package modules;

import com.google.inject.AbstractModule;
import play.Logger;
import tasks.ReadActiveCustomerTasks;

public class TasksModule extends AbstractModule {

    /**
     * Configures a {@link} via the exposed methods.
     */
    @Override
    protected void configure() {
        Logger.error("calling configure of tasks module");
        this.bind(ReadActiveCustomerTasks.class).asEagerSingleton();
    }

}
