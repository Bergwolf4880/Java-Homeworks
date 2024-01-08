// Предположим, у вас есть массив с именами пользователей,
// например {"Иван Иванов", "Сергей Петров", "Елена Соколова" }
// (массив задан в начале программы, естественно, имен может быть больше).
// Реализовать следующие методы:
//
// метод, который выводит все элементы данного массива на экран, в виде
// 0 - Иван Иванов  1 - Сергей Петров  2 - Елена Соколова
// т.е. index - значение
//
// метод, boolean checkName(String[] array, String name) который вернет true,
// если в массиве присутствует заданный пользователь


public class Main {
    public static void main(String[] args) {

        String[] registeredUserNames = {"Sophie Marceau", "Anne Hathaway", "Bruce Willis", "Silvester Stallone"};


        printNames(registeredUserNames);
        System.out.println(checkName(registeredUserNames));

    }
    public static void printNames(String[] registeredUserNames) {
        int count = 0;
        for (int i = 0; i < registeredUserNames.length; i++) {
            count++;
            System.out.println(count + " "+registeredUserNames[i]);
            //System.out.println(registeredUserNames[i]);

        }
    }
    public static boolean checkName(String[] registeredUserName) {
        String nameSearch = "Johnny Depp";
        for (int i = 0; i < registeredUserName.length; i++) {
            if (nameSearch == registeredUserName[i]) {
                return true;
            }
        }
        return false;
    }
}