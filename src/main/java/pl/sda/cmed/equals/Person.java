package pl.sda.cmed.equals;


import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

public class Person {
    private final String name;
    @Nullable
    private final String surname;
    private int age;

    public Person(@NotNull String name, String surname, int age) {
        if (name == null) {
            throw new IllegalArgumentException("You cannot have a person without name!");
        }
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    @SuppressWarnings("SimplifiableIfStatement")
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        // w taki sposób można wywołać porównanie jeśli mamy pewność,
        // że porównywana właściwość nie będzie nullem
        if (!name.equals(person.name)) return false;

        // w taki sposób trzeba porównywać jeśli nie mamy pewności,
        // czy porównywana właściwość nie będzie nullem
        if (surname != null) {
            if (!surname.equals(person.surname)) return false;
        } else {
            if (person.surname != null) return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }
}
