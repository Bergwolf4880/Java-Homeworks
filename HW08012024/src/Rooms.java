public class Rooms {
private int roomNumber;
private TypeOfBeds typeOfBeds;
private int price;
private Room room;

    public Rooms(int roomNumber, TypeOfBeds typeOfBeds, int price, Room room) {
        this.typeOfBeds = typeOfBeds;
        this.price = price;
        this.room = room;
        this.roomNumber=roomNumber;
    }
//region Getters

    public int getRoomNumber() {
        return roomNumber;
    }
    public TypeOfBeds typeOfBeds() {
        return typeOfBeds;
    }
    public int getPrice() {
        return price;
    }
    public Room getRoom() {
        return room;
    }
    //endregion


    @Override
    public String toString() {
        return "\nRoom number: " + roomNumber +
                ", type Of bed: " + typeOfBeds +
                ", price: " + price +"\n"+ room
                ;
    }
}

