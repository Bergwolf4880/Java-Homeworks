/*Дано два массива. Первый - массив с именами студентов.
Второй (такой же длинны, как и первый) - количество пропущенных занятий.
Нпаисать метод, который вернет имя студента, прогулявшего больше всех.
В рамках жанной задачи, если есть несколько студентов с одинаковым количеством прогулов,
можно вернуть имя любого из них.*/

public class Main {
    public static void main(String[] args) {
        String[] studentNames = {"Luke", "Serge", "Tim", "Cornelius", "Marko"};
        int[] missedLectures = {1, 0, 2, 4, 4};

        studentNamesOutput(studentNames, indexOfMax(missedLectures));
    }

    public static int indexOfMax(int[] missedLectures) {
        int temp = 0;
        for (int i = 0; i < missedLectures.length; i++) {
            if (missedLectures[temp] < missedLectures[i]) {
                temp = i;
            }
        }
        return temp;
    }

    public static void studentNamesOutput(String[] studentNames, int mostMissedIndex) {

        System.out.println(studentNames[mostMissedIndex]);
    }
}