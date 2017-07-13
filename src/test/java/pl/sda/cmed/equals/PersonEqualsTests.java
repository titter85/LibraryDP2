package pl.sda.cmed.equals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnit4.class)
public class PersonEqualsTests {

    @Test
    public void testReflexivity() {
        Person person = new Person("Jan", "Kowalski", 25);

        Boolean result = person.equals(person);

        assertThat(result).isTrue();
    }

    @Test
    public void testSymmetryPositive() {
        Person person = new Person("Jan", "Kowalski", 25);
        Person person2 = new Person("Jan", "Kowalski", 25);

        Boolean result = person.equals(person2);
        Boolean inverseResult = person2.equals(person);

        assertThat(result).isTrue();
        assertThat(inverseResult).isTrue();
    }

    @Test
    public void testSymmetryNegative() {
        Person person = new Person("Jan", "Kowalski", 25);
        Person person2 = new Person("Janusz", "Kowalski", 52);

        Boolean result = person.equals(person2);
        Boolean inverseResult = person2.equals(person);

        assertThat(result).isFalse();
        assertThat(inverseResult).isFalse();
    }

    @Test
    public void testTransitiveNegative() {
        Person personA = new Person("Jan", "Kowalski", 25);
        Person personB = new Person("Jan", "Kowalski", 25);
        Person personC = new Person("Witold", "Kowalski", 52);

        Boolean resultAB = personA.equals(personB);
        Boolean resultBC = personB.equals(personC);
        Boolean resultAC = personA.equals(personC);

        assertThat(resultAB).isTrue();
        assertThat(resultBC).isFalse();
        assertThat(resultAC).isFalse();
    }

    @Test
    public void testTransitivePositive() {
        Person personA = new Person("Jan", "Kowalski", 25);
        Person personB = new Person("Jan", "Kowalski", 25);
        Person personC = new Person("Jan", "Kowalski", 25);

        Boolean resultAB = personA.equals(personB);
        Boolean resultBC = personB.equals(personC);
        Boolean resultAC = personA.equals(personC);

        assertThat(resultAB).isTrue();
        assertThat(resultBC).isTrue();
        assertThat(resultAC).isTrue();
    }

    @Test
    public void testCoherence() {
        Person personA = new Person("Jan", "Kowalski", 25);
        Person personB = new Person("Jan", "Kowalski", 25);

        Boolean result1 = personA.equals(personB);
        Boolean result2 = personA.equals(personB);
        Boolean result3 = personA.equals(personB);

        assertThat(result1).isTrue();
        assertThat(result2).isTrue();
        assertThat(result3).isTrue();
    }

    @Test
    public void testNullEquality() {
        Person personA = new Person("Jan", "Kowalski", 25);

        Boolean result = personA.equals(null);

        assertThat(result).isFalse();
    }

    @Test
    public void testAcceptSubclass() {
        Person person = new Person("Jan", "Kowalski", 25);
        Person librarian = new Librarian("Jan", "Kowalski", 25, 50);

        Boolean result = person.equals(librarian);

        assertThat(result).isTrue();
    }
}
