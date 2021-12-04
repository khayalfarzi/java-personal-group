package az.coders.java_lessons.lesson_13.functional_programming;

import java.util.function.Predicate;

public class FuncPrgEx {

    public static void main(String[] args) {

        Predicate<Integer> negative = integer -> integer < 0;
        Predicate<Integer> positive = integer -> integer > 0;
        Predicate<Integer> zero = integer -> integer == 0;

        boolean test = negative.test(5);
        System.out.println(test);
        boolean resultAnd = negative.and(positive).and(zero).test(0);                //it is look like bitwise and operator
        System.out.println(resultAnd);
        boolean resultOr = negative.or(positive).or(zero).test(0);                   //it is look like bitwise or operator
        System.out.println(resultOr);
        boolean resultAndNegate = negative.and(positive).and(zero).negate().test(0); //bitwise negate operator
        System.out.println(resultAndNegate);
        boolean resultOrNegate = negative.or(positive).or(zero).negate().test(0);    //bitwise negate operator
        System.out.println(resultOrNegate);
    }
}
