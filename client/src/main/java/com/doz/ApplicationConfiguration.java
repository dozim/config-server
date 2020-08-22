package com.doz;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "application")
public class ApplicationConfiguration {

    private boolean printOnStart = false;

    private String text = "";

    public boolean isPrintOnStart() {
        return printOnStart;
    }

    public void setPrintOnStart(boolean printOnStart) {
        this.printOnStart = printOnStart;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "ApplicationConfiguration{" +
                "printOnStart=" + printOnStart +
                ", text='" + text + '\'' +
                '}';
    }
}
