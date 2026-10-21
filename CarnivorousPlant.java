public class CarnivorousPlant extends Plant {
    // Inheritance: Like Cactus and Palm, this class, reuses name and height from Plant thank you veeeery much

    // Samma uträkning, båda värden har tydliga namn
    private static final double BASE_LITERS = 0.1;
    private static final double LITERS_PER_METER = 0.2;

    public CarnivorousPlant(String name, double height) {
        super(name, height); // Skickar namn och längd till Plant så basklassen kan spara dem.
    }

    public LiquidType getLiquidType() { // Returnerar vätsketype(alltså protein drink)
        return LiquidType.Proteindrink;
    }
    public double getLiquidAmount() { // Räknar 0,1 + 0,2 * längd
        return BASE_LITERS + (LITERS_PER_METER * getHeight());
    }
}

