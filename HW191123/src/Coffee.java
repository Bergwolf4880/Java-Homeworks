public class Coffee {
    public int hotWater;
    public int cowMilk;
    public int coffeeBeans;

    public String coffeeTypeName;


//    public Coffee(int hotWater, int cowMilk, int coffeeBeans, String coffeeTypeName) {
//        this.hotWater = hotWater;
//        this.cowMilk = cowMilk;
//        this.coffeeBeans = coffeeBeans;
//        this.coffeeTypeName = coffeeTypeName;
//    }

    public Coffee(int coffeeType) {
        switch (coffeeType) {
            case 1:
                this.hotWater = 40;
                this.cowMilk = 0;
                this.coffeeBeans = 20;
                this.coffeeTypeName = "EXPRESSO";
                break;
            case 2:
                this.hotWater = 50;
                this.cowMilk = 0;
                this.coffeeBeans = 40;
                this.coffeeTypeName = "FLAT WHITE POWER";
                break;
            case 3:
                this.hotWater = 50;
                this.cowMilk = 100;
                this.coffeeBeans = 30;
                this.coffeeTypeName = "Al Pacino";
                break;
        }
    }

    public void outputCoffee() {

        System.out.println("coffee " + this.coffeeTypeName);
        String choise = "We have used " + this.hotWater + "ml water, " + this.cowMilk + "ml of milk and "
                + this.coffeeBeans + "g of coffee beans";
        System.out.println(choise);
    }
}

