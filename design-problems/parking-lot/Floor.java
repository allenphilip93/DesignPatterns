/**
 * Class which implements Graphic to represent a floor in a building
 */

 public class Floor extends Graphic {

    private List<Graphic> children = new HashMap<>();

    /**
     * Can be used to add rooms, doors, exits, walls, parking spots etc
     */
    public void insert(Graphic graphic) {
        // Add the graphic to the floor
        children.add(graphic);
    }
 }