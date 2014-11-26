package org.camunda.bpm.extension.dropwizard.example;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.camunda.bpm.extension.dropwizard.CamundaBundle;

public class CamundaDropwizardExampleApplication extends Application<CamundaDropwizardExampleApplication.Config> {


    @Override
    public void run(Config configuration, Environment environment) throws Exception {
        // nothing so far
    }

    @Override
    public void initialize(Bootstrap<Config> bootstrap) {
        bootstrap.addBundle(new CamundaBundle());
    }

    public static class Config extends Configuration {
        // empty
    }

    public static void main(String... args) throws Exception {
        new CamundaDropwizardExampleApplication().run(args);
    }
}