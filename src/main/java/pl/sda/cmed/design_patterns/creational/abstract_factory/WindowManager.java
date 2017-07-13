package pl.sda.cmed.design_patterns.creational.abstract_factory;

import pl.sda.cmed.design_patterns.creational.abstract_factory.factory.AbstractFactory;
import pl.sda.cmed.design_patterns.creational.abstract_factory.product.ScrollBar;
import pl.sda.cmed.design_patterns.creational.abstract_factory.product.StartMenu;

public class WindowManager {

    public final ScrollBar scrollBar;
    public final StartMenu startMenu;

    public WindowManager(AbstractFactory factory) {
        scrollBar = factory.createScrollBar();
        startMenu = factory.createStartMenu();
    }

    public Integer scrollWindow() {
        return scrollBar.scroll();
    }

    public String nameStartIcon() {
        return startMenu.menuIcon();
    }
}
