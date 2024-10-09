package io.github.dumijdev.njinxmanager.app.pages;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.router.Route;
import io.github.dumijdev.njinxmanager.app.layouts.MainLayout;
import io.github.dumijdev.njinxmanager.app.models.ServerModel;

@Route(value = "/servers", layout = MainLayout.class)
public class ServerPage extends Main {
    public ServerPage() {
        var grid = new Grid<ServerModel>();

        grid.addColumn(ServerModel::getName).setHeader("Name").setSortable(true).setAutoWidth(true);
        grid.addColumn(ServerModel::getHost).setHeader("Host").setSortable(true).setAutoWidth(true);
        grid.addColumn(ServerModel::getPort).setHeader("Port").setSortable(true).setAutoWidth(true);
        grid.addComponentColumn(serverModel -> new Button(VaadinIcon.EYE.create(), ServerPage::onComponentEvent))
                .setHeader("Action").setAutoWidth(true);

        add(grid);
    }

    private static void onComponentEvent(ClickEvent<Button> event) {
        Notification.show("Create Server");
    }
}
