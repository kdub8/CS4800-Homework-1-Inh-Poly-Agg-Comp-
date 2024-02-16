public class Ship {
    private String name;
    private String year_built;

    Ship(String name, String year_built) {
        this.name = name;
        this.year_built = year_built;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setYearBuilt(String year) {
        this.year_built = year;
    }

    public String getYearBuilt() {
        return year_built;
    }

    public void print() {
        System.out.println("Ship name: " + name);
        System.out.println("Year Built: " + year_built);
    }
}

class CruiseShip extends Ship {
    private int maxPassengers;

    CruiseShip(String name, String year_built, int maxPassengers) {
        super(name, year_built);
        this.maxPassengers = maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    @Override
    public void print() {
        System.out.println("Ship name: " + this.getName());
        System.out.println("Maximum number of passengers: " + maxPassengers);
    }
}

class CargoShip extends Ship {
    private int cargoCapacity;

    CargoShip(String name, String year_built, int cargoCapacity) {
        super(name, year_built);
        this.cargoCapacity = cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public void print() {
        System.out.println("Ship name: " + this.getName());
        System.out.println("Cargo Capacity(tons): " + cargoCapacity);
    }
}
