/**
 * Used to represent the building graphic. Buidling can have only floors.
 */

 public class Building extends Graphic {

    /**
     * Can be used to add rooms, doors, exits, walls, parking spots etc
     */
    public void insert(Graphic graphic) {
        if (graphic instanceof Floor) {
            // Add the graphic to the floor
            children.add(graphic);
        }
    }
 }