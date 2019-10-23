public class Table extends Furniture {
    String tableSku;

    String chairSku;

    Room room;

    Table(String tableSku, String chairSku) {
        this.tableSku = tableSku;
        this.chairSku = chairSku;

        room = new Room("Dining Room");
    }

    @Override
    String getSku() {
        return "table-" + tableSku + "-chair-" + chairSku;
    }

    Room getRoom() {
        return room;
    }
}
