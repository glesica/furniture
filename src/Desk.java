public class Desk extends Furniture {
    String sku;

    Room room;

    Desk(String sku) {
        this.sku = sku;

        room = new Room("Office");
    }

    @Override
    String getSku() {
        return "desk-" + sku;
    }

    Room getRoom() {
        return room;
    }
}
