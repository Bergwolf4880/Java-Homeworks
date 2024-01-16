public class Manager extends Employee{


    private String name;

    public Manager(String name) {
        super(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Manager " + name;
    }
}
