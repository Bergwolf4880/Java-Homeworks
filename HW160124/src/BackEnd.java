public class BackEnd extends  Programmer{


    private String name;

    public BackEnd(String name) {
        super(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "BackEnd " + name;
    }


}
