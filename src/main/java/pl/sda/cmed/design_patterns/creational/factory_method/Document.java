package pl.sda.cmed.design_patterns.creational.factory_method;

public abstract class Document {

    protected String name;

    public Document(String name) {
        this.name = name;
    }

    // Zadanie 1:
    // Stwórz dwie podklasy ImageDocument i TextDocument.
    // Stwórz podklasę klasy ImageDocument i nazwij ją PngImageDocument
}