// Реализуйте метод String insertStr (String target, String source, int position).
//
// target целевая строка
// source вставляемая строка
// position позиция вставки
// Метод должен возвращать новую строку, которая получена путем "вставки"
// строки source в строку target в позицию position.
//
// Если position больше длинны строки target тогда результат - простое объединение строк.
// Если position больше длинны строки target, то строка source вставляется в строку target в позицию position,
// а остаток строки target отзывается в конце
// Примеры:
//
// insertStr ("Hello", " world", 10) Результат: "Hello world"
// insertStr ("Script", "Java", 0) Результат: "JavaScript"
// insertStr ("I am busy", "not very ", 5) Результат: "I am not very busy"
// Эту задачу можно решить двумя способами: используя substring и используя только цикл, length и charAt

public class Main {
    public static void main(String[] args) {

        String target = "She sells sea shells";
        String source = " on the sea shore ";
        int index = 9;

        String result = insertString(target, source, index);
        System.out.println(result);
    }

    public static String insertString(String target, String source, int index) {
        String result = "";

        for (int i = 0; i < target.length(); i++) {
            if (index <= target.length()) {
                result = target.substring(0, index) + source + target.substring(index);
            } else {
                result = target + source;
            }

        }return result;
    }public static String indrtString
}