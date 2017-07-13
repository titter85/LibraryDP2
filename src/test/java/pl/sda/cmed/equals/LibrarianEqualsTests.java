package pl.sda.cmed.equals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnit4.class)
public class LibrarianEqualsTests {

    @Test
    public void testReflexivity() {
        Librarian librarian = new Librarian("Jan", "Kowalski", 25, 50);

        Boolean result = librarian.equals(librarian);

        assertThat(result).isTrue();
    }

    @Test
    public void testSymmetryPositive() {
        Librarian librarian = new Librarian("Jan", "Kowalski", 25, 50);
        Librarian librarian2 = new Librarian("Jan", "Kowalski", 25, 50);

        Boolean result = librarian.equals(librarian2);
        Boolean inverseResult = librarian2.equals(librarian);

        assertThat(result).isTrue();
        assertThat(inverseResult).isTrue();
    }

    @Test
    public void testSymmetryNegative() {
        Librarian librarian = new Librarian("Jan", "Kowalski", 25, 50);
        Librarian librarian2 = new Librarian("Janusz", "Kowalski", 25, 103);

        Boolean result = librarian.equals(librarian2);
        Boolean inverseResult = librarian2.equals(librarian);

        assertThat(result).isFalse();
        assertThat(inverseResult).isFalse();
    }

    @Test
    public void testTransitiveNegative() {
        Librarian librarianA = new Librarian("Jan", "Kowalski", 25, 50);
        Librarian librarianB = new Librarian("Jan", "Kowalski", 25, 50);
        Librarian librarianC = new Librarian("Witold", "Kowalski", 52, 60);

        Boolean resultAB = librarianA.equals(librarianB);
        Boolean resultBC = librarianB.equals(librarianC);
        Boolean resultAC = librarianA.equals(librarianC);

        assertThat(resultAB).isTrue();
        assertThat(resultBC).isFalse();
        assertThat(resultAC).isFalse();
    }

    @Test
    public void testTransitivePositive() {
        Librarian librarianA = new Librarian("Jan", "Kowalski", 25, 50);
        Librarian librarianB = new Librarian("Jan", "Kowalski", 25, 50);
        Librarian librarianC = new Librarian("Jan", "Kowalski", 25, 50);

        Boolean resultAB = librarianA.equals(librarianB);
        Boolean resultBC = librarianB.equals(librarianC);
        Boolean resultAC = librarianA.equals(librarianC);

        assertThat(resultAB).isTrue();
        assertThat(resultBC).isTrue();
        assertThat(resultAC).isTrue();
    }

    @Test
    public void testCoherence() {
        Librarian librarianA = new Librarian("Jan", "Kowalski", 25, 50);
        Librarian librarianB = new Librarian("Jan", "Kowalski", 25, 50);

        Boolean result1 = librarianA.equals(librarianB);
        Boolean result2 = librarianA.equals(librarianB);
        Boolean result3 = librarianA.equals(librarianB);

        assertThat(result1).isTrue();
        assertThat(result2).isTrue();
        assertThat(result3).isTrue();
    }

    @Test
    public void testNullEquality() {
        Librarian librarian = new Librarian("Jan", "Kowalski", 25, 50);

        Boolean result = librarian.equals(null);

        assertThat(result).isFalse();
    }

    @Test
    public void testPersonAcceptSubclass_SymmetryMaintained() {
        Person person = new Person("Jan", "Kowalski", 25);
        Librarian librarian = new Librarian("Jan", "Kowalski", 25, 50);

        Boolean result = person.equals(librarian);

        assertThat(result).isTrue();
    }

    @Test
    public void testAcceptSubclassReverse_SymmetryIsBroken() {
        Person person = new Person("Jan", "Kowalski", 25);
        Librarian librarian = new Librarian("Jan", "Kowalski", 25, 50);

        Boolean result = librarian.equals(person);

        //This test passes because we expect it to fail(!)
        assertThat(result).isFalse();
    }
}
