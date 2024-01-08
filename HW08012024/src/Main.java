public class Main {
    public static void main(String[] args) {
        Rooms[] edelweiss = {
                new Rooms(101, TypeOfBeds.SINGLE, 50, Room.STANDART),
                new Rooms(102, TypeOfBeds.SINGLE, 50, Room.STANDART),
                new Rooms(103, TypeOfBeds.SINGLE, 100, Room.STUDIO),
                new Rooms(201, TypeOfBeds.DOUBLE, 100, Room.STUDIO),
                new Rooms(202, TypeOfBeds.DOUBLE, 100, Room.STUDIO),
                new Rooms(301, TypeOfBeds.TWIN, 200, Room.JUNIOR_SUITE),
                new Rooms(302, TypeOfBeds.TWIN, 200, Room.JUNIOR_SUITE),
                new Rooms(303, TypeOfBeds.QUEENSIZE, 300, Room.SUITE),
                new Rooms(304, TypeOfBeds.QUEENSIZE, 300, Room.SUITE),
                new Rooms(402, TypeOfBeds.KINGSIZE, 400, Room.DELUXE),
                new Rooms(403, TypeOfBeds.KINGSIZE, 400, Room.DELUXE),
                new Rooms(500, TypeOfBeds.KINGSIZE, 700, Room.PRESIDENT),
        };

        printByRoom(edelweiss, "Deluxe");

    }


    public static void printByRoom(Rooms[] array, String name) {
        for (Rooms room : array) {
            if(room.getRoom().getName().equals(name)){
                System.out.println(room);

            }
        }
    }
}