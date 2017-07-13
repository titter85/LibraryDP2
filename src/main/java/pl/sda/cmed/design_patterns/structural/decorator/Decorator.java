package pl.sda.cmed.design_patterns.structural.decorator;

import java.util.List;

public class Decorator implements Component {

    protected final Component decoratedComponent;

    public Decorator(Component decoratedComponent) {
        this.decoratedComponent = decoratedComponent;
    }

    @Override
    public List<String> printout() {
        return decoratedComponent.printout();
    }
}
