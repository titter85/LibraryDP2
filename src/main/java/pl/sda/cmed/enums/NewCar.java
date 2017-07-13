package pl.sda.cmed.enums;

public class NewCar {

    private CarType type;

    public NewCar(CarType type) {
        this.type = type;
    }

    public CarType getType() {
        return this.type;
    }

    public void setType(CarType type) {
        this.type = type;
    }
}
