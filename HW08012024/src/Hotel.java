public class Hotel {

    private String title;
    private static Hotel instance = null;



    private Hotel(String title) {
        this.title = title;
    }

    public static Hotel getInstance(String title){
        if (instance == null){
            instance = new Hotel(title);
        }
        return instance;
    }

    public String getTitle() {
        return title;
    }

    public static Hotel getInstance() {
        return instance;
    }
}
