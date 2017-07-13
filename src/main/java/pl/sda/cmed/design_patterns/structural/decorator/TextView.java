package pl.sda.cmed.design_patterns.structural.decorator;


import java.util.ArrayList;
import java.util.List;

public class TextView implements Component{
    private List<String> text = new ArrayList<>();

    public TextView(List<String> lista) {
        this.text = lista;
    }

    @Override
    public List<String> printout() {
        return this.text;
    }
}