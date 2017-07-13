package pl.sda.cmed.design_patterns.creational.abstract_factory.factory;

import pl.sda.cmed.design_patterns.creational.abstract_factory.product.ScrollBar;
import pl.sda.cmed.design_patterns.creational.abstract_factory.product.StartMenu;

public interface AbstractFactory {

    ScrollBar createScrollBar();

    StartMenu createStartMenu();

}
