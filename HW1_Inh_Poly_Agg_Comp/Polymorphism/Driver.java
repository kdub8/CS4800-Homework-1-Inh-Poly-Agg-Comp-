public class Driver {
    public static void main(String args[]) {
        Ship ships[] = new Ship[3];

        ships[0] = new Ship("Titanic", "1911");
        ships[1] = new CruiseShip("Harmony of the Seas", "2011", 6700);
        ships[2] = new CargoShip("Vale Brasil", null, 360000);

        for (Ship ship : ships) {
            ship.print();
            System.out.println();
        }

    }
}
