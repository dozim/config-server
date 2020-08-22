package com.doz;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;

@Component
public class ApplicationConfigurationPrinter {

    private static final Logger LOGGER = Logger.getLogger(ApplicationConfigurationPrinter.class.getName());

    private final ApplicationConfiguration applicationConfiguration;

    public ApplicationConfigurationPrinter(ApplicationConfiguration applicationConfiguration) {
        this.applicationConfiguration = applicationConfiguration;
    }

    @PostConstruct
    public void printConfiguration() {
        if (this.applicationConfiguration.isPrintOnStart()) {
            LOGGER.info("Printing Current ApplicationConfiguration");
            LOGGER.info(applicationConfiguration.toString());
        }
    }
}
