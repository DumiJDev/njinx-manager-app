package io.github.dumijdev.njinxmanager.app.pages;

import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.Route;
import io.github.dumijdev.njinxmanager.app.layouts.MainLayout;

@Route(value = "/settings", layout = MainLayout.class)
public class SettingPage extends Tabs {
    public SettingPage() {
    }
}
