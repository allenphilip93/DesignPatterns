/**
 * Graphic to represent a door
 */

 public class Door extends Graphic {

    private boolean isOneWay;

    Graphic fromGraphic;
    Graphic toGraphic;

    // Hide the default constructor
    private Door() {
    }

    public Door(Graphic fromGraphic, Graphic toGraphic, boolean isOneWay) {
        this.fromGraphic = fromGraphic;
        this.toGraphic = toGraphic;
        this.isOneWay = isOneWay;
    }

    public void enterDoor(Graphic fromGraphic) {
        if ((this.fromGraphic == fromGraphic) || !isOneWay) {
            goto(toGraphic);
            // Move pos to "toGraphic"
        } else {
            return;
        }
    }

    public void insert() {
        // not implemented
    }
 }