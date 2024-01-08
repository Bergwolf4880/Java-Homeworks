public class Main {
    public static void main(String[] args) {
        Tree t1 = new Tree("apple",20, 100,300);
        Flower f1 = new Flower("rose",5);
        Bush b1 = new Bush("curant", 30, 50);

        Plant[] plants = new Plant[]{b1,f1,t1};
        print(plants);

        System.out.println(" ---------------- grow spring ");
        setSeason(plants,"spring");
        grow(plants);
        print(plants);

        System.out.println(" ---------------- grow summer ");
        setSeason(plants,"summer");
        grow(plants);
        print(plants);

        System.out.println(" ---------------- grow autumn ");
        setSeason(plants,"autumn");
        grow(plants);
        print(plants);

        System.out.println(" ---------------- grow winter ");
        setSeason(plants,"winter");
        grow(plants);
        print(plants);


    }
    public static void print(Plant[] garden){
        for (Plant plant:garden){
            System.out.println(plant);

        }
    }
    public static void setSeason(Plant[] garden, String season){
        for (Plant plant:garden){
            plant.setSeason(season);
        }
    }

    public static void grow(Plant[] garden){
        for (Plant plant:garden){
            plant.grow();
        }
    }
}