package pl.sda.cmed.enums;

import java.util.HashMap;
import java.util.Map;

public enum PlaneType {
    B737(10000) {
        String builtBy() {
            return "Boeing";
        }
    },
    A320(11000) {
        String builtBy() {
            return "Airbus";
        }
    };

    private static final Map<String, PlaneType> stringToEnum = new HashMap<String, PlaneType>();

    static {
        for (PlaneType planeType : values())
            stringToEnum.put(planeType.name(), planeType);
    }

    private final int maxAltitude;

    PlaneType(int maxAltitude) {
        this.maxAltitude = maxAltitude;
    }

    public static PlaneType fromString(String symbol) {
        return stringToEnum.get(symbol);
    }

    public float maxAltitude() {
        return maxAltitude;
    }

    abstract String builtBy();

    public String naiveBuiltBy() {
        switch (this) {
            case B737:
                return "Boeing";
            case A320:
                return "Airbus";
        }
        throw new IllegalArgumentException("Just unhandled");
    }
}
