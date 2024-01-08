//Дан массив строк. Необходимо написать метод, который все строки в этом массиве,
// которые длиннее 5 символов, обрежет до первых 5 символов и добавит в конце "[+]"
//        Например: {"Hello Java", "Jack", "Ann is a programmer",
//        "She has a good offer"} -> {"Hello[+]", "Jack", "Ann i[+]", "She h[+]"}

public class Main {
    public static void main(String[] args) {
        int length = 5;
        String[] wordsArray = {"Hello Java",
                "Jack",
                "Ann is a programmer",
                "She has a good offer"};
        trimWords(wordsArray, length);

    }

    public static void trimWords(String[] array, int length) {
        boolean flag = false;
        for (String str : array) { //for( int i = 0; i<array.length; i++){String str = array[i]};
            if (str.length() >= length) {
                System.out.println(str.substring(0, length) + "[+]");
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("no strings found");
        }
    }
}