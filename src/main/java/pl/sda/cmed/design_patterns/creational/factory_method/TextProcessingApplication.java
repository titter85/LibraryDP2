package pl.sda.cmed.design_patterns.creational.factory_method;

/**
 * Created by RENT on 2017-07-13.
 */
public class TextProcessingApplication implements Application{
    @Override
    public Document createDocument(String name) {
        if (name.endsWith(".txt")){
            return new TextDocument(name);
        }
        return new TextDocument("default.txt");
    }
}
