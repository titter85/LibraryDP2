package pl.sda.cmed.enums;

import java.util.HashMap;
import java.util.Map;

// zadanie1: Wypełnij klasę enum wartościami VAN, WAGON, SEDAN, HATCHBACK, SPORTS
public enum CarType {
    VAN(1950) {
        String purpose() {
            return "Carry stuff around";
        }
    },
    WAGON(1500) {
        String purpose() {
            return "Family car";
        }
    },
    SEDAN(1300) {
        String purpose() {
            return "Limousine style here";
        }
    },
    HATCHBACK(1100) {
        String purpose() {
            return "Smaller yet comfortable";
        }
    },
    SPORTS(1150) {
        String purpose() {
            return "Fun and speed";
        }
    };

    // -----------------------------
    // zadanie 4: Utwórz publiczną zmienną statyczną o nazwie stringToEnum i typie Map<String,CarType>.
    // Użyj obiektu klasy HashMap do zainicjalizowania jej
    public static final Map<String, CarType> stringToEnum = new HashMap<String, CarType>();

    static {
        // zadanie 4: Wypełnij zmienną statyczną wszystkimi wartościami naszego enuma
        // (podpowiedź, metoda values()) uzywjąc w tym celu pętli for
        for (CarType carType : values())
            stringToEnum.put(carType.toString(), carType);
    }

    // -----------------------------
    // zadanie2: Dodaj do właściwość weight, która będzie oznaczała wagę samochodu w kilogramach
    private final int weight;

    CarType(int weight) {
        this.weight = weight;
    }

    // -----------------------------
    public static CarType fromString(String symbol) {
        // zadanie 5:
        // Uzupełnij implementację metody tak, by na podstawie podanego Stringa
        // zwracała wartość naszej statycznej zmiennej stringToEnum
        return stringToEnum.get(symbol);
    }

    // -----------------------------
    // zadanie2: Dodaj do metodę o takiej samej nazwie, która zwraca wartość weight
    public float weight() {
        return weight;
    }

    // -----------------------------
    public String naivePurpose() {
        // zadanie3: Wypełnij metodę tak by zwracała krótki opis pojazdu dla każdej
        // z wartości enuma.
        // Podpowiedź: użyj instrukcji switch(this){}
        switch (this) {
            case VAN:
                return "Carry stuff around";
            case WAGON:
                return "Family car";
            case SEDAN:
                return "Limousine style here";
            case HATCHBACK:
                return "Smaller yet comfortable";
            case SPORTS:
                return "Fun and speed";
        }
        throw new IllegalArgumentException("Just unhandled");
    }

    // zadanie 6: Dodaj metodę abstrakcyjną purpose i przeciąż ją tak, by zwracała krótki opis pojazdu
    abstract String purpose();

}
