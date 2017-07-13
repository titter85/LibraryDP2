package pl.sda.cmed.equals;

public class Librarian extends Person {

    private int wage;

    public Librarian(String name, String surname, int age, int wage) {
        super(name, surname, age);
        this.wage = wage;
    }

    //     zadanie dodatkowe
//     odkomentuj metody equals i hashCode. Dopisz ich implementacje tak by uwzględniały
//     metody klasy nadrzędnej oraz wartość pola wage
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Librarian)) return false;
        if (!super.equals(o)) return false;

        Librarian librarian = (Librarian) o;

        return wage == librarian.wage;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + wage;
        return result;
    }
}
