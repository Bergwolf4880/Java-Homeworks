/*Реализовать метод, который возвращает первое слово в заданной строке
(в рамках данной задачи считаем, что слова отделены пробелом и в строке нет знаков препинания).
Например: "Олег Иванов", результат: "Олег"*/
public class Main {
    public static void main(String[] args) {

        String str = "Олег Иванов";

        System.out.println(firstWord2(str));
    }

//    public static String firstWord(String str) {
//        str = str.trim();
//        String result = "";
//        char space = ' ';
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            result = result + ch;
//            if (ch == space) {
//                break;
//            }
//        }
//        return result;
//
//    }
    public static String firstWord2(String str){

        for(int i = 0; i<str.length(); i++){
            char ch= str.charAt(i);
            if(ch== ' '){
                return str.substring(0,i);
            }
        }
        return str;

    }public static String firstWord3(String str){

        for(int i = 0; i<str.length(); i++){
            char ch= str.charAt(i);
            if(ch== ' '){
                return str.substring(0,i);
            }
        }
        return str;

    }
}