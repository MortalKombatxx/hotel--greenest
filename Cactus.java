public class Cactus extends Plant {
    // Samma ide: återanvänder

    private static final double DAILY_LITERS = 0.02; // Fasta mängden har ett tydligt namn

    public Cactus(String name, double height) {
        super(name, height); //Sätter namn och längd i basklassen
    }

    public LiquidType getLiquidType() { //returnerar vätsketypen(Mineral vatten)
        return LiquidType.Mineralwater;
    }

    public double getLiquidAmount() { // Fast mängd (Längden spelar igen roll här)
        return DAILY_LITERS;
    }
}

