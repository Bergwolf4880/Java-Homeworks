public class Bush extends Plant {
    private final int SUMMER_GROW = 50;
    private final int AUTUMN_GROW =  20;
    private final int WINTER_GROW =  0;
    public Bush(String name, int springGrow, int seedlingHeight) {
        super(name, springGrow, seedlingHeight);
    }
    @Override
    public int getSUMMER_GROW() {
        return SUMMER_GROW;
    }
    @Override
    public int getAUTUMN_GROW() {
        return AUTUMN_GROW;
    }
    @Override
    public int getWINTER_GROW() {
        return WINTER_GROW;
    }
}