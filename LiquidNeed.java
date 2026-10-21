// Interface: kontrakt så Hotel kan prata med alla växter på samma sätt
    public interface LiquidNeed {
    double getLiquidAmount(); // How many liters does a plant need, where the formula needs
    LiquidType getLiquidType(); // What drink is it?
}
