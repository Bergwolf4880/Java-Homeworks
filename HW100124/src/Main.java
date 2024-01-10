import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = UserInputAndTest.getTestList();

        System.out.println(numbers);

        UtilClass.getMaxValue(numbers);
        UtilClass.getMinValue(numbers);
        UtilClass.getSum(numbers);


        numbers = UtilClass.randomValueList();
        System.out.println(UtilClass.randomValueList());
        UtilClass.getMaxValue(numbers);
        UtilClass.getMinValue(numbers);
        UtilClass.getSum(numbers);


        numbers = UserInputAndTest.userInputList();
        UtilClass.getMaxValue(numbers);
        UtilClass.getMinValue(numbers);
        UtilClass.getSum(numbers);


    }


}