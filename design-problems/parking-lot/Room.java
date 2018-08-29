/**
 * Class to represent rooms as a graphic. Rooms may or may not have walls.
 */
public class Room extends Graphic {

    private List<Graphic> children = new HashMap<>();

    private Room() {}

    public Room(boolean hasWalls) {
        if (hasWalls) {
            // Adds walls to the room children on all sides
        } else {
            // Don't add anything
        }
    }

    // Insert would be valid only for 1D graphics like doors
    public void insert(Graphic graphic) {
        if (!graphic.hasArea()) {
            children.add(graphic);
        }
    }

    public boolean hasChildren() {
        return (children.size() > 0);
    }
}