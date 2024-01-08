/*Реализовать метод String change(String str, char ch1, char ch2)
который возвращает новую строку, которая представляет из себя исходную строку,
но все символы ch1 заменины на ch2.
        Например:
        change("1-2-3", '-','&') должен вернуть "1&2&3"*/

public class Main {

    public static void main(String[] args) {

        String numberArray = "1-2-3-4-5";

        char old = '-';
        char newChar = '?';
        System.out.println(numberArray);
        System.out.println(substring(numberArray, old, newChar));
    }

    public static String substring(String numberArray, char ch1, char ch2) {

        String result = "";
        for (int i = 0; i < numberArray.length(); i++) {
            char currentChar = numberArray.charAt(i);
            if (currentChar==ch1) {
                currentChar=ch2;
            }
            result=result + currentChar;
        }
        //String newArray = numberArray.replace(old, newChar);
        // return newArray;
        return result;
    }

}