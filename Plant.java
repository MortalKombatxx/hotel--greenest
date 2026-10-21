public abstract class Plant implements LiquidNeed {
    // Interface: Plant uppfyller LiquidNeed (mängd + vätsketyp)
    // Abstract: skapa inte new Plant(), bara Palm/Cactus/CarnivorousPlant

    // Inkapsling: private fält, ändras bara inuti klassen
    private String name;
    private double height;  //Encapsulation: name and height are private in order to let them only be changed from inside this class
    private boolean beenWatered;

    public Plant(String name, double height) { //Constructor (Sätta namn och längd direkt när växten skapas)

        this.name = name;
        this.height = height;
        this.beenWatered = false;
    }

    public void takeCare() {
        beenWatered = true;
    } // Markera om växten har redan tagits hand om
    public String getName() {
        return name;
    } // Andra klasser ska kunna läsa utan att röra private fält
    public double getHeight() {
        return height;
    } // Andra klasser ska kunna läsa utan att röra privata fält
    public boolean hasBeenwatered() { //Hotellet kollar status
        return beenWatered;
    }
    public String getDescription() { //För att ge en enkel text om statusen
        if (hasBeenwatered()) {
            return name + " has already been taken care of";
        } else {
            return name + " is ready to be taken care of";
        }

    }
}

