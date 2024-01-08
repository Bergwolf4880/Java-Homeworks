public class Tree extends Plant{
    private final int maxHeight;
    private int SUMMER_GROW = 100;
    private int AUTUMN_GROW =  50;
    private int WINTER_GROW =  30;

    public Tree(String name, int springGrow,  int seedlingHeight, int maxHeight) {
        super(name, springGrow,seedlingHeight);
        this.maxHeight = maxHeight;

    }

    public int getMaxHeight() {
        return maxHeight;
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

    @Override
    public int calcSeaasonGrow(int factor){
        int change = (int)Math.round(getSpringGrow()/100.0 * factor);
        return getHeight()+change>maxHeight?maxHeight-getHeight():change;

    }
}