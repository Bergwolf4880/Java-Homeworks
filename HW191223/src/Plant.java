public abstract class Plant {
    private final String name;
    private int height;
    private final int springGrow;
    private String season;


    public Plant(String name, int springGrow) {
        this(name, springGrow,0);
    }

    public Plant(String name, int springGrow, int seedlingHeight) {
        this.name = name;
        this.springGrow = springGrow;
        this.season = "spring";
        this.height = seedlingHeight;
    }


    //region GET-SET
    public abstract int getAUTUMN_GROW();
    public abstract int getWINTER_GROW();
    public abstract int getSUMMER_GROW();

    public int getSpringGrowFactor(){
        return 100;
    }

    public int getSpringGrow() {
        return springGrow;
    }
    public void setSeason(String season) {
        this.season = season;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public String getName() {
        return name;
    }
    public int getHeight() {
        return height;
    }
    public String getSeason() {
        return season;
    }
    //endregion


    public void grow() {
        switch (season){
            case "spring": setHeight(getSpringGrowFactor()); break;
            case "summer": seasonGrow(getSUMMER_GROW());break;
            case "autumn": seasonGrow(getAUTUMN_GROW());break;
            case "winter": seasonGrow(getWINTER_GROW());break;
        }
    }

//    private boolean isPlantGrown(){
//        return getHeight()<getMaxHeight();
//    }

    private void seasonGrow(int factor){
        height+= calcSeaasonGrow(factor);
    }

    public int calcSeaasonGrow(int factor){
        return (int)Math.round(getSpringGrow()/100.0 * factor);

    }
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", springGrow=" + springGrow +
                ", season='" + season + '\'' +
                '}';
    }
}