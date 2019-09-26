package fleet;

public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();                           //ez maga a Fleet Class mintára létrehozott lista aminek a neve fleet
    Thing thing1= new Thing("Get milk");             //Thing class mintára létrehozunk elemeket thing 1,-2,-3,-4 néven
    Thing thing2= new Thing("Remove the obstacles");  // name tartalomma, Thing egy object aminek van String "name" tulajdosága és
    Thing thing3= new Thing("Stand up");              // completed boolean állapota (boolean alapjáraton false), így ha nem adunk hozzá
    Thing thing4= new Thing("Eat lunch");             // true állapotot mint a thing3 és 4nél (28 és 29.sor) akkor false marad és
    // - You have the `Thing` class                          // nem "x"-eli ki
    // - You have the `Fleet` class
    // - You have the `FleetOfThings` class with a `main` method
    // - Download those, use those
    // - In the main method create a fleet
    // - Achieve this output:
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    fleet.add(thing1);            // fleet-hez hozzáadjuk a fentebb Thing mintára étrehozott thing 1-4-et
    fleet.add(thing2);
    fleet.add(thing3);
    fleet.add(thing4);

    thing3.complete();        // ezek completed taskok
    thing4.complete();

    System.out.println(fleet);

  }
}
