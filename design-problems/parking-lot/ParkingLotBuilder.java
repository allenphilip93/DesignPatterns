/** 
 * Builder class for building the whole parking lot 
 * using the graphic class hierarchy
 */

 public class ParkingLotBuilder {

    private Graphic parkingLot;

    public ParkingLotBuilder(Shape buildingShape, Position pos) {
        parkingLot = new Buidling();
        parkingLot.setShape(buildingShape);
        parkingLot.setPosition(pos);
    }

    public void buildParkingLot() {
        // Create the ground floor
        Graphic floor = new Floor();
        buildGraphic(floorShape, pos, parkingLot, floor);
        // Add the security room
        Graphic room = new Room(true);
        buildGraphic(roomShape, pos, floor, room);
        // Add walls and door to the room
        addDoor(room, null, false, doorShape, pos);
        // Add parking lots
        Graphic parking = new Room(false);
        buildGraphic(parkingShape, pos, floor, room);
    }

    public Graphic getParkingLot() {
        return parkingLot;
    }


    public void buildGraphic(Shape floorShape, Position pos, Graphic parent, Graphic child) {
        child.setShape(floorShape);
        child.setPosition(pos);
        parent.insert(child);
    }

    public void addDoor(Graphic fromGraphic, Graphic toGraphic, boolean isoneway, Shape doorShape, Position pos) {
        Graphic door = new Door(fromGraphic, toGraphic, isoneway);
        buildGraphic(doorShape, pos, fromGraphic, door);
        fromGraphic.insert(door);
        toGraphic.insert(door);
    }
 }