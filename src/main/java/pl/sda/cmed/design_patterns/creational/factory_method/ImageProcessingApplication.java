package pl.sda.cmed.design_patterns.creational.factory_method;

/**
 * Created by RENT on 2017-07-13.
 */
public class ImageProcessingApplication implements Application {
    @Override
    public Document createDocument(String name) {
        if (name.endsWith(".png")){
            return new PngImageDocument(name);
        }else {
            return new ImageDocument(name);
        }
    }
}
