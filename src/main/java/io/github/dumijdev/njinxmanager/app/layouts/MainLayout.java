package io.github.dumijdev.njinxmanager.app.layouts;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.sidenav.SideNav;
import com.vaadin.flow.component.sidenav.SideNavItem;
import com.vaadin.flow.theme.lumo.LumoUtility;
import io.github.dumijdev.njinxmanager.app.pages.HomePage;
import io.github.dumijdev.njinxmanager.app.pages.LocationPage;
import io.github.dumijdev.njinxmanager.app.pages.ServerPage;
import io.github.dumijdev.njinxmanager.app.pages.SettingPage;

import static com.vaadin.flow.component.icon.VaadinIcon.*;

public class MainLayout extends AppLayout {
    public MainLayout() {
        var toggle = new DrawerToggle();
        var title = new H1("Njinx Manager");
        title.getStyle().set("font-size", "var(--lumo-font-size-l)").set("margin", "0");

        var scroller = new Scroller(getSideNav());
        scroller.setClassName(LumoUtility.Padding.SMALL);

        addToNavbar(toggle, title);
        addToDrawer(scroller);
    }

    private SideNav getSideNav() {
        var nav = new SideNav();
        nav.addItem(
                new SideNavItem("Home", HomePage.class, VaadinIcon.DASHBOARD.create()),
                new SideNavItem("Servers", ServerPage.class, SERVER.create()),
                new SideNavItem("Locations", LocationPage.class, FILE.create()),
                new SideNavItem("Settings", SettingPage.class, FACTORY.create())
        );
        return nav;
    }
}
