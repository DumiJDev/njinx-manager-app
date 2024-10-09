package io.github.dumijdev.njinxmanager.app;

import com.vaadin.flow.component.page.AppShellConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NjinxManagerApplication implements AppShellConfigurator {

    public static void main(String[] args) {
        SpringApplication.run(NjinxManagerApplication.class, args);
    }
}
