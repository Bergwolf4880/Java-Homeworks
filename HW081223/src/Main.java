
public class Main {
    public static void main(String[] args) {


        String techToSearch = "Java";
        String searchedName = "Vitaly";
        Person person = new Person("Vassili", "Pupkin");


        Programmer[] programmers = {
                new Programmer(new Person("Georgij", "Knigov"), new String[]{"Java", "SQL", "Spring Boot"}),
                new Programmer("Alexej", "Serov", new String[]{"C#", "PHP", "SQL"}),
                new Programmer(person, "Java, SQL, Spring Boot"),
                new Programmer("Vitaly Zuckermann", new String[]{"Java", "Rust", "SQL"})
        };

        //System.out.println(arrayToString(programmers, techToSearch));

        System.out.println(arrayToString(sortedProgrammers(programmers, techToSearch)));
        getName(programmers, searchedName);

    }

    public static String arrayToString(Programmer[] programmers) {
        String result = "";
        for (Programmer temp : programmers) {
            result = result + "\n" + temp;
        }
        return result;
    }

    public static String arrayToString(Programmer[] programmers, String technology) {
        String result = "";
        for (Programmer programmer : programmers) {
            if (programmer.hasProgrammerSkill(technology)) {
                result = result + "\n" + programmer;
            }

        }
        return result;
    }



    public static int timesTechFound(Programmer[] programmers, String technology) {  //количество совпадений, используется для создания нового массива
        int times = 0;
        for (Programmer programmer : programmers) {
            if (programmer.hasProgrammerSkill(technology)) {
                times += 1;
            }
        }
        return times;
    }

    public static Programmer[] sortedProgrammers(Programmer[] programmers, String technology) {  //Поиск по технологии и запись в новый массив равный количеству совпадений.
        Programmer[] tempResult = new Programmer[timesTechFound(programmers, technology)];
        int lastResultIndex = 0;

        for (Programmer programmer : programmers) {
            if (programmer.hasProgrammerSkill(technology)) {
                tempResult[lastResultIndex] = programmer;
                lastResultIndex = lastResultIndex + 1;
            }

        }
        return tempResult;
    }

    public static void getName(Programmer[] programmers, String searchedName) {       //Поиск в массиве по имени

        for (Programmer programmer : programmers) {
            if (programmer.getPerson().getFirstName().equals(searchedName)) {
                System.out.println("\n"+programmer);
            }
        }
    }


}