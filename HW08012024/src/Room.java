public enum Room {

    STANDART("Standart","Стандартный однокомнатный номер"),
    STUDIO( "Studio", "Однокомнатный номер с мини-кухней"),
    JUNIOR_SUITE("Junior Suite","Номер улучшенной планировки"),
    SUITE("Suite","Улучшенной планировки, из двух комнат"),
    DELUXE("Deluxe","Номер повышенного комфорта"),
    PRESIDENT("President","Cамые роскошные номера");

    private String name;
    private String description;


    Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Type of room: " + name +
                ", " + description;
    }
}
