public class Main {
    public static void main(String[] args) {
        // EXECUTION STARTS HERE

        Desk d = new Desk("8e33");
        printSummary(d);
        Furniture t = new Table("54be", "32hf");
        printSummary(t);

        System.out.println(d.getSku());
        System.out.println(t.getSku());

        d.getRoom();
        // ...

        Room livingRoom = new Room("living room");

        System.out.println(livingRoom.getName());
    }

    public static void printSummary(Furniture f) {
        System.out.println(f.getSku());
    }
}
