/**
 * Represents a ship with a name and year built.
 */
/** @author Kevin */
public class Ship {
    private String name;
    private String year_built;

    /**
     * Constructs a new Ship object with the given name and year built.
     *
     * @param name       The name of the ship
     * @param year_built The year the ship was built
     */
    Ship(String name, String year_built) {
        this.name = name;
        this.year_built = year_built;
    }

    /**
     * Sets the name of the ship.
     *
     * @param name The name of the ship
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the ship.
     *
     * @return The name of the ship
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the year the ship was built.
     *
     * @param year The year the ship was built
     */
    public void setYearBuilt(String year) {
        this.year_built = year;
    }

    /**
     * Gets the year the ship was built.
     *
     * @return The year the ship was built
     */
    public String getYearBuilt() {
        return year_built;
    }

    /**
     * Prints information about the ship, including its name and year built.
     */
    public void print() {
        System.out.println("Ship name: " + name);
        System.out.println("Year Built: " + year_built);
    }
}

/**
 * Represents a cruise ship, a type of ship with a maximum number of passengers.
 */
class CruiseShip extends Ship {
    private int maxPassengers;

    /**
     * Constructs a new CruiseShip object with the given name, year built, and
     * maximum number of passengers.
     *
     * @param name          The name of the cruise ship
     * @param year_built    The year the cruise ship was built
     * @param maxPassengers The maximum number of passengers the cruise ship can
     *                      hold
     */
    CruiseShip(String name, String year_built, int maxPassengers) {
        super(name, year_built);
        this.maxPassengers = maxPassengers;
    }

    /**
     * Sets the maximum number of passengers the cruise ship can hold.
     *
     * @param maxPassengers The maximum number of passengers the cruise ship can
     *                      hold
     */
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    /**
     * Gets the maximum number of passengers the cruise ship can hold.
     *
     * @return The maximum number of passengers the cruise ship can hold
     */
    public int getMaxPassengers() {
        return maxPassengers;
    }

    /**
     * Prints information about the cruise ship, including its name and maximum
     * number of passengers.
     */
    @Override
    public void print() {
        System.out.println("Ship name: " + this.getName());
        System.out.println("Maximum number of passengers: " + maxPassengers);
    }
}

/**
 * Represents a cargo ship, a type of ship with a cargo capacity in tons.
 */
class CargoShip extends Ship {
    private int cargoCapacity;

    /**
     * Constructs a new CargoShip object with the given name, year built, and cargo
     * capacity.
     *
     * @param name          The name of the cargo ship
     * @param year_built    The year the cargo ship was built
     * @param cargoCapacity The cargo capacity of the cargo ship in tons
     */
    CargoShip(String name, String year_built, int cargoCapacity) {
        super(name, year_built);
        this.cargoCapacity = cargoCapacity;
    }

    /**
     * Sets the cargo capacity of the cargo ship.
     *
     * @param cargoCapacity The cargo capacity of the cargo ship in tons
     */
    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    /**
     * Gets the cargo capacity of the cargo ship.
     *
     * @return The cargo capacity of the cargo ship in tons
     */
    public int getCargoCapacity() {
        return cargoCapacity;
    }

    /**
     * Prints information about the cargo ship, including its name and cargo
     * capacity.
     */
    @Override
    public void print() {
        System.out.println("Ship name: " + this.getName());
        System.out.println("Cargo Capacity(tons): " + cargoCapacity);
    }
}
