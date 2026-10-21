import java.util.Scanner;
public class Hotel {

    public static void main(String[] args) {


        //Samlar växterna i en array för att loopa och söka i
        Plant[] plants = {
                new Cactus("Igge", 0.20),
                new Palm("Laura", 5),
                new CarnivorousPlant("Meatloaf", 0.7),
                new Palm("Olof", 1)
    };

        //Läser input
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        //Kunna ta hand of flera växter utan att starta om programmet
        while (running) {
            System.out.println("Which plant will be taken care of? (or type exit to quit)");
            String input = scanner.nextLine();

            //exit för att avsluta programmet, oavsett små eller stora bokstäver
            if (input.equalsIgnoreCase("exit")) {
                running = false;

                //Fånga tom inmatning
            } else if (input == null || input.isBlank()) { //Fånga tom inmatning
                System.out.println("Please type a plant name.");
            } else {
                Plant found = null;

                //Söker växt utifrån namn
                for (Plant plant : plants) {
                    if (plant.getName().equalsIgnoreCase(input)) {
                        found = plant;
                        break;
                    }
                }
                if (found != null) {
                    if (found.hasBeenwatered()) {
                        System.out.println(found.getDescription());
                    } else {
                        // Polymorfism: samma metodanrop, olika resultat beroende på växttyp
                        System.out.println(found.getLiquidAmount()); //Frågar rätt växtklassen om mängd
                        System.out.println(found.getLiquidType()); //Frågar rätt växtklass om dryck 'typ'
                        found.takeCare(); // Inte "vattna" samma växt två gånger i samma körning, cuz WHY NOT!?
                    }
                } else {
                    System.out.println("That plant is not currently staying at this hotel");

                }
            }

        }
    }
}




