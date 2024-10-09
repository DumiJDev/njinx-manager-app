package io.github.dumijdev.njinxmanager.app.pages;

import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.router.Route;
import io.github.dumijdev.njinxmanager.app.layouts.MainLayout;

@Route(value = "/", layout = MainLayout.class)
public class HomePage extends Main {
    public HomePage() {

    }
}
