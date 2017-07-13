package pl.sda.cmed.design_patterns.structural.decorator;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by RENT on 2017-07-13.
 */
public class QuotedDecorator extends Decorator {

    public QuotedDecorator(Component decoratedComponent) {
        super(decoratedComponent);
    }

    @Override
    public List<String> printout() {


//        return decoratedComponent.printout().stream().map(line -> "\""+line+"\"").collect(Collectors.toList());
        return decoratedComponent.printout().stream().map(this::decorate).collect(Collectors.toList());
    }

    private String decorate(String line){
        return "\""+line+"\"";
    }
}
