package pl.sda.cmed.design_patterns.creational.factory_method;

public interface Application {

    // Zadanie 2:
    // Utwórz klasę ImageProcessingApplication, która implementuje ten interfejs
    // W metodzie createDocument sprawdź czy podana nazwa pliku (parametr name)
    // kończy się rozszerzeniem .png i jeśli tak to stwórz obiekt klasy PngImageDocument,
    // jeśli nie to klasy ImageDocument

    // Zadanie 3:
    // Utwórz klasę TextProcessingApplication, która implementuje ten interfejs
    // W metodzie createDocument zwróć obiekt klasy TextDocument

    Document createDocument(String name);

}