package pl.sda.cmed.design_patterns.creational.factory_method;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnit4.class)
public class FactoryMethodTests {

    // Wypełnij instrukcje z klasy Document
    // Wypełnij instrukcje z interfejsu Application

    @Test
    public void shouldCreateImageDocument() {
        // Zadanie 2:
        // ten test powinien stworzyć obiekt klasy ImageProcessingApplication
        // i użyć go jako interfejsu Application do stworzenia dokumentu ImageDocument
        // sprawdzenie czy stworzono poprawna instancję dokumentu można dokonać
        // za pomocą assertThat(...).isExactlyInstanceOf()

//        To tylko zalążek testu
        Application application = new ImageProcessingApplication();
        Document imgDoc = application.createDocument("a.jpg");
        assertThat(imgDoc).isExactlyInstanceOf(ImageDocument.class);
    }

    @Test
    public void shouldCreatePngImageDocument() {
        // Zadanie 2:
        // ten test powinien stworzyć obiekt klasy ImageProcessingApplication
        // i użyć go jako interfejsu Application do stworzenia dokumentu ImageDocument
        // i sprawdzić co zostało utworzone
        Application application = new ImageProcessingApplication();
        Document imgDoc = application.createDocument("new.png");
        assertThat(imgDoc).isExactlyInstanceOf(PngImageDocument.class);
    }

    @Test
    public void shouldCreateTextDocument() {
        // Zadanie 3:
        // ten test powinien stworzyć obiekt klasy TextProcessingApplication
        // i użyć go jako interfejsu Application do stworzenia dokumentu TextDocument
        // i sprawdzić co zostało utworzone
        Application application = new TextProcessingApplication();
        Document txtDoc = application.createDocument("a.txt");
        assertThat(txtDoc).isExactlyInstanceOf(TextDocument.class);
        System.out.println("Created: "+txtDoc.name);
    }
}
