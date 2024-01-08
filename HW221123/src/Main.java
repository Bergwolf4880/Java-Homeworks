/*Реализовать метод String substring(String str, int index) который возвращает строку - часть исходной строки,
        начиеая с символа с индексом index и до конца строки.
        Например:
        substring("hello Java world", 6) должен вернуть "Java world"*/

public class Main {
    public static void main(String[] args) {
        String text = "Hello world!";
        int index = 5;
        String substring = substring(text, index);
        System.out.println(substring);
    }

    public static String substring(String text, int index) {

        String outputText="";

        for (int i=index; i<text.length(); i++) {
            outputText = outputText + text.charAt(i);

        }return outputText;

    }
}