public class FrontEnd  extends Programmer {

    private String name;

    public FrontEnd(String name) {
        super(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "FrontEnd " + name;
    }
}
