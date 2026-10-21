public class Palm extends Plant {
    //Inheritance: Reuses shared field like name and height från Plant

    private static final double LITERS_PER_METER = 0.5;
    public Palm(String name, double height) {

        super(name, height); // Skickar namn/längd till Plant
    }

    public LiquidType getLiquidType() { //Returnerar vätsketypen

        return LiquidType.Tap_water;
    }
    public double getLiquidAmount() { // Räknar 0,5 * längd

        return LITERS_PER_METER * getHeight();
    }
}
